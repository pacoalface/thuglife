package com.franciscoalfacemartin.thuglife.features.songs_list;

import com.franciscoalfacemartin.thuglife.model.Song;

import java.util.List;

/**
 * Created by franciscoalfacemartin on 12/12/15.
 */
public interface MainView {
    void showError(int error);
    void showSongs(List<Song> data);
}