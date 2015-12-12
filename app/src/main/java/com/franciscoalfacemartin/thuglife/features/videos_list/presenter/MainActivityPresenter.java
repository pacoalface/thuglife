package com.franciscoalfacemartin.thuglife.features.videos_list.presenter;

import com.franciscoalfacemartin.thuglife.base.presenters.Presenter;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
public interface MainActivityPresenter extends Presenter {
    void openSettingsActivity();
    void setView(MainView view);
    void loadAllSongs();
}
