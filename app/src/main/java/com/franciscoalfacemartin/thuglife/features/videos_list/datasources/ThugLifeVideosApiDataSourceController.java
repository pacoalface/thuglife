package com.franciscoalfacemartin.thuglife.features.videos_list.datasources;

import com.franciscoalfacemartin.thuglife.model.Video;
import java.util.ArrayList;
import retrofit.Call;
import retrofit.http.GET;

public interface ThugLifeVideosApiDataSourceController {

    @GET("feeds/users/UCPN4CSgbKoO8a80KJc8s0bw/uploads?&alt=json")
    Call<ArrayList<Video>> loadVideos( );
}
