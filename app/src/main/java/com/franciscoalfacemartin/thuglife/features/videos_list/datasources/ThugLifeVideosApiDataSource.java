package com.franciscoalfacemartin.thuglife.features.videos_list.datasources;

import com.franciscoalfacemartin.thuglife.model.Video;

import java.util.ArrayList;

public interface ThugLifeVideosApiDataSource {

    ArrayList<Video> getThugLifeVideos();
}
