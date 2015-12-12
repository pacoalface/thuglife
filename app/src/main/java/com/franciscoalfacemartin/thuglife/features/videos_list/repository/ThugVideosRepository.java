package com.franciscoalfacemartin.thuglife.features.videos_list.repository;

import com.franciscoalfacemartin.thuglife.model.Video;

import java.util.ArrayList;

/**
 * Created by franciscoalfacemartin on 12/12/15.
 */
public interface ThugVideosRepository {
    ArrayList<Video> loadVideos();
}
