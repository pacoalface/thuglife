package com.franciscoalfacemartin.thuglife.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.franciscoalfacemartin.thuglife.BaseActivity;
import com.franciscoalfacemartin.thuglife.R;
import com.franciscoalfacemartin.thuglife.di.components.DaggerThugLifeActivityComponent;
import com.franciscoalfacemartin.thuglife.di.components.ThugLifeActivityComponent;
import com.franciscoalfacemartin.thuglife.di.modules.ThugLifeActivityModule;
import com.franciscoalfacemartin.thuglife.presenters.MainActivityPresenter;
import com.franciscoalfacemartin.thuglife.presenters.MainActivityPresenterImpl;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ThugLifeActivity extends BaseActivity implements MainActivityPresenterImpl.View{

    @Inject
    MainActivityPresenter presenter;

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.fab)
    FloatingActionButton fab;


    private ThugLifeActivityComponent component;

    public ThugLifeActivityComponent component() {
        if (component == null) {
            component = DaggerThugLifeActivityComponent.builder()
                    .applicationComponent(getApplicationComponent())
                    .thugLifeActivityModule(new ThugLifeActivityModule(this))
                    .build();
        }
        return component;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thug_life);
        ButterKnife.bind(this);
        component().inject(this);

        presenter.setView(this);
        presenter.openSettingsActivity();

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_thug_life, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            presenter.loadAllSongs();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showError(int error) {
        Toast.makeText(this, "error " + error, Toast.LENGTH_SHORT).show();
    }
}
