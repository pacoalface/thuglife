package com.franciscoalfacemartin.thuglife.features.songs_list;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
public interface MainActivityPresenter {
    void openSettingsActivity();
    void setView(MainView view);
    void loadAllSongs();
}
