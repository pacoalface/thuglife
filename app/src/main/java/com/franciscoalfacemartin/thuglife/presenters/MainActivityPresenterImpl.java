package com.franciscoalfacemartin.thuglife.presenters;

import com.franciscoalfacemartin.thuglife.callbacks.CollectionDataCallback;
import com.franciscoalfacemartin.thuglife.features.LoadAllThugSongsInteractor;
import com.franciscoalfacemartin.thuglife.model.Song;
import com.franciscoalfacemartin.thuglife.navigation.Router;

import java.util.List;

import javax.inject.Inject;


/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
public class MainActivityPresenterImpl implements MainActivityPresenter, CollectionDataCallback {

    @Inject
    public MainActivityPresenterImpl() {
    }

    @Inject
    LoadAllThugSongsInteractor interactor;

    @Inject
    Router router;

    private View view;


    @Override
    public void openSettingsActivity() {
        router.startSettingsActivity();
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void loadAllSongs() {
        interactor.run(new Song("","aahskash"), this);
    }

    @Override
    public void onSuccess(List result) {

    }

    @Override
    public void onError(int error) {
        view.showError(error);
    }

    public interface View {
        void showError(int error);
    }
}
