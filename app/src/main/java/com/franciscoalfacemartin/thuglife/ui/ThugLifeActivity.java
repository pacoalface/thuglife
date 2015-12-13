package com.franciscoalfacemartin.thuglife.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.franciscoalfacemartin.thuglife.BaseActivity;
import com.franciscoalfacemartin.thuglife.R;
import com.franciscoalfacemartin.thuglife.base.callbacks.ItemClickListener;
import com.franciscoalfacemartin.thuglife.di.components.DaggerThugLifeActivityComponent;
import com.franciscoalfacemartin.thuglife.di.components.ThugLifeActivityComponent;
import com.franciscoalfacemartin.thuglife.di.modules.ThugLifeActivityModule;
import com.franciscoalfacemartin.thuglife.features.videos_list.presenter.MainActivityPresenter;
import com.franciscoalfacemartin.thuglife.features.videos_list.presenter.MainView;
import com.franciscoalfacemartin.thuglife.model.Video;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;


public class ThugLifeActivity extends BaseActivity implements MainView, ItemClickListener {

    @Inject MainActivityPresenter presenter;
    @Inject VideoAdapter adapter;
    @Bind( R.id.toolbar ) Toolbar toolbar;
    @Bind( R.id.recycler_view ) RecyclerView recyclerView;
    @Bind( R.id.progress ) ProgressBar progressBar;


    private ThugLifeActivityComponent component;
    private ArrayList<Video> videos;

    public ThugLifeActivityComponent component() {
        if ( component == null ) {
            component = DaggerThugLifeActivityComponent.builder().applicationComponent( getApplicationComponent() ).thugLifeActivityModule( new ThugLifeActivityModule( this ) ).build();
        }
        return component;
    }


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_thug_life );
        ButterKnife.bind( this );
        component().inject( this );
        presenter.setView( this );
        presenter.loadAllSongs();
        toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {
        getMenuInflater().inflate( R.menu.menu_thug_life, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item ) {
        int id = item.getItemId();
        if ( id == R.id.action_settings ) {
            presenter.loadAllSongs();
            return true;
        }

        return super.onOptionsItemSelected( item );
    }

    @Override
    public void showError( int error ) {
        Toast.makeText( this, "error " + error, Toast.LENGTH_SHORT ).show();
    }

    @Override
    public void showVideos( final List<Video> data ) {
        videos = new ArrayList<>( data );
        runOnUiThread( new Runnable() {
            @Override
            public void run() {
                setupRecyclerView();
            }
        } );
    }

    private void setupRecyclerView() {
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        adapter.setData( videos, this );
        recyclerView.setAdapter( adapter );
        progressBar.setVisibility( View.GONE );
    }

    @Override
    public void onClickItem( int position ) {
        presenter.openVideo(videos.get( position ));
    }
}
