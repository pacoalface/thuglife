package com.franciscoalfacemartin.thuglife.features.videos_list.presenter;

import com.franciscoalfacemartin.thuglife.model.Video;

import java.util.List;

/**
 * Created by franciscoalfacemartin on 12/12/15.
 */
public interface MainView {
    void showError(int error);
    void showVideos( List<Video> data);
}