package com.franciscoalfacemartin.thuglife.features.videos_list.datasources;

import com.franciscoalfacemartin.thuglife.model.Video;
import java.util.ArrayList;
import retrofit.Call;
import retrofit.http.GET;

public interface ThugLifeVideosApiDataSourceController {

    @GET("/youtube/v3/channels?part=contentDetails&forUsername=Thug%20Life%20Videos&key=AIzaSyAJKRb5iGlmVGNglXZ1Cid6ckJOsSr9mVw")
    Call<Object> loadVideos( );
}
