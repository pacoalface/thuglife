package com.franciscoalfacemartin.thuglife.presenters;

import com.franciscoalfacemartin.thuglife.navigation.Router;

import javax.inject.Inject;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
public class MainActivityPresenterImpl implements MainActivityPresenter {

    @Inject
    public MainActivityPresenterImpl() {
    }

    private View view;

    @Inject
    Router router;

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

    }

    public interface View {
        void showError(int error);
    }
}
