package com.franciscoalfacemartin.thuglife.features.videos_list.datasources;

import android.content.Context;

import com.franciscoalfacemartin.thuglife.model.Video;

import java.io.IOException;
import java.util.ArrayList;

import javax.inject.Inject;

import retrofit.Retrofit;

public class ThugLifeVideosApiDataSource {
    private final Context context;

    @Inject
    public ThugLifeVideosApiDataSource( Context context) {
        this.context = context;
    }

    @Inject Retrofit retrofit;


    public ArrayList<Video> getThugLifeVideos() {
        try {
            Object videos = retrofit.create( ThugLifeVideosApiDataSourceController.class ).loadVideos().execute().body();

            return new ArrayList<>(  );
        } catch ( IOException e ) {
            return new ArrayList<>();
        }
    }
}
