package com.franciscoalfacemartin.thuglife.features.videos_list.presenter;

import com.franciscoalfacemartin.thuglife.base.callbacks.CollectionDataCallback;
import com.franciscoalfacemartin.thuglife.features.videos_list.interactor.LoadAllThugVideosInteractor;
import com.franciscoalfacemartin.thuglife.model.Video;
import com.franciscoalfacemartin.thuglife.navigation.Router;

import java.util.List;

import javax.inject.Inject;


/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
public class MainActivityPresenterImpl implements MainActivityPresenter, CollectionDataCallback<Video> {

    @Inject
    public MainActivityPresenterImpl() {
    }

    @Inject LoadAllThugVideosInteractor interactor;

    @Inject
    Router router;

    private MainView view;

    @Override
    public void openSettingsActivity() {
        router.startSettingsActivity();
    }

    @Override
    public void setView(MainView view) {
        this.view = view;
    }

    @Override
    public void loadAllSongs() {
        interactor.run(new Video("","aahskash"), this);
    }

    @Override
    public void onSuccess(List<Video> result) {
        view.showSongs(result);
    }

    @Override
    public void onError(int error) {
        view.showError(error);
    }


    @Override
    public void onCreate() {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onPause() {
    }
}
