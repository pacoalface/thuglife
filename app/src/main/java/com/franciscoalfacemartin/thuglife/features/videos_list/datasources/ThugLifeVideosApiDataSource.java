package com.franciscoalfacemartin.thuglife.features.videos_list.datasources;

import com.franciscoalfacemartin.thuglife.model.Video;

import java.io.IOException;
import java.util.ArrayList;

import javax.inject.Inject;

import retrofit.Retrofit;

public class ThugLifeVideosApiDataSource {

    @Inject Retrofit retrofit;

    @Inject
    public ThugLifeVideosApiDataSource() {
    }

    public ArrayList<Video> getThugLifeVideos() {
        try {
            return retrofit.create( ThugLifeVideosApiDataSourceController.class ).loadVideos().execute().body();
        } catch ( IOException e ) {
            return new ArrayList<>();
        }
    }
}
