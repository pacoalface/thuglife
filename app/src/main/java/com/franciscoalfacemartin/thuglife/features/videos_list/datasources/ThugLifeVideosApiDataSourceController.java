package com.franciscoalfacemartin.thuglife.features.videos_list.datasources;

import retrofit.Call;
import retrofit.http.GET;

public interface ThugLifeVideosApiDataSourceController {

    @GET( "youtube/v3/playlistItems?part=snippet&maxResults=50&playlistId=PLp-A_R4zSGt4ngAlLaMJUTEJ0VgLQi4qU&key=AIzaSyDoygBO_KhOmhfCokQOBg1B_10u9nSwibo" )
    Call<Object> loadVideos();
}
