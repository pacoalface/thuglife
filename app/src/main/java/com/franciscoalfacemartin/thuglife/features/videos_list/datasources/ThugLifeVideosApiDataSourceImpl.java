package com.franciscoalfacemartin.thuglife.features.videos_list.datasources;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.franciscoalfacemartin.thuglife.base.datasource.ApiDataSource;
import com.franciscoalfacemartin.thuglife.model.Video;
import com.franciscoalfacemartin.thuglife.model.api_results.ThugVideoResult;

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
            final ThugVideoResult videos = generateRetrofitClient().create( ThugLifeVideosApiDataSourceController.class ).loadVideos().execute().body();
            return generateCleanVideos(videos);
        } catch ( Exception e ) {
            return new ArrayList<>();
        }
    }

    private ArrayList<Video> generateCleanVideos( ThugVideoResult videos ) {
        ArrayList<Video> cleanVideos = new ArrayList<>(  );
        for(ThugVideoResult.Item item : videos.items) {
            Video video = new Video( item.snippet.title,item.snippet.thumbnails.high.url, item.snippet.resourceId.videoId );
            cleanVideos.add( video );
        }
        return cleanVideos;
    }
}
