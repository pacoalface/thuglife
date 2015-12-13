package com.franciscoalfacemartin.thuglife.features.videos_list.datasources;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.franciscoalfacemartin.thuglife.base.datasource.ApiDataSource;
import com.franciscoalfacemartin.thuglife.model.Video;

import java.util.ArrayList;

import javax.inject.Inject;

public class ThugLifeVideosApiDataSourceImpl extends ApiDataSource implements ThugLifeVideosApiDataSource{

    private Context context;

    @Inject
    public ThugLifeVideosApiDataSourceImpl( Context context) {
        this.context = context;
    }

    @Override
    public ArrayList<Video> getThugLifeVideos() {
        try {

            final Object videos = generateRetrofitClient().create( ThugLifeVideosApiDataSourceController.class ).loadVideos().execute().body();
            ((AppCompatActivity)context).runOnUiThread( new Runnable() {
                @Override
                public void run() {
                    Toast.makeText( context, "Lo que hay " + videos.toString(), Toast.LENGTH_SHORT ).show();
                }
            } );
            return new ArrayList<>();
        } catch ( Exception e ) {
            return new ArrayList<>();
        }
    }
}
