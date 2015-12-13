package com.franciscoalfacemartin.thuglife.features.videos_list.presenter;

import com.franciscoalfacemartin.thuglife.base.presenters.Presenter;
import com.franciscoalfacemartin.thuglife.model.Video;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
public interface MainActivityPresenter extends Presenter {
    void setView(MainView view);
    void loadAllSongs();
    void openVideo( Video video);
}
