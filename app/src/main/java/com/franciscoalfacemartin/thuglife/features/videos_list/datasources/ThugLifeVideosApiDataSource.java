package com.franciscoalfacemartin.thuglife.features.videos_list.datasources;

import android.content.Context;

import com.franciscoalfacemartin.thuglife.base.datasource.ApiDataSource;
import com.franciscoalfacemartin.thuglife.model.Video;

import java.io.IOException;
import java.util.ArrayList;

import javax.inject.Inject;

public class ThugLifeVideosApiDataSource extends ApiDataSource {

    private Context context;

    @Inject
    public ThugLifeVideosApiDataSource( Context context) {
        this.context = context;
    }

    public ArrayList<Video> getThugLifeVideos() {
        try {
            return generateRetrofitClient().create( ThugLifeVideosApiDataSourceController.class )
                    .loadVideos()
                    .execute()
                    .body();
        } catch ( IOException e ) {
            return new ArrayList<>(  );
        }
    }

}
