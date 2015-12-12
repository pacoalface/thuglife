package com.franciscoalfacemartin.thuglife.features.videos_list.repository;

import android.content.Context;

import com.franciscoalfacemartin.thuglife.base.repository.Repository;
import com.franciscoalfacemartin.thuglife.features.videos_list.datasources.ThugLifeVideosApiDataSource;
import com.franciscoalfacemartin.thuglife.model.Video;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by franciscoalfacemartin on 12/12/15.
 */
public class ThugVideosRepositoryImpl extends Repository implements ThugVideosRepository{


    Context context;

    @Inject
    public ThugVideosRepositoryImpl( Context context ) {
        this.context = context;
    }

    @Inject ThugLifeVideosApiDataSource dataSource;

    @Override
    public ArrayList<Video> loadVideos() {
        if(haveInternetConnection(context)) {
            return dataSource.getThugLifeVideos();
        } else {
            return null;
        }
    }
}