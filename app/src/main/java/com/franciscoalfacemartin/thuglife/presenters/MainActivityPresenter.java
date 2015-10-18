package com.franciscoalfacemartin.thuglife.presenters;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
public interface MainActivityPresenter {
    void openSettingsActivity();
    void setView(MainActivityPresenterImpl.View view);
}
