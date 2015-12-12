package com.franciscoalfacemartin.thuglife.di.modules;

import com.franciscoalfacemartin.thuglife.features.songs_list.interactor.LoadAllThugSongsInteractor;
import com.franciscoalfacemartin.thuglife.features.songs_list.interactor.LoadAllThugSongsInteractorImpl;
import com.franciscoalfacemartin.thuglife.features.songs_list.MainActivityPresenter;
import com.franciscoalfacemartin.thuglife.features.songs_list.MainActivityPresenterImpl;
import com.franciscoalfacemartin.thuglife.ui.ThugLifeActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
@Module
public class ThugLifeActivityModule {

    ThugLifeActivity activity;

    public ThugLifeActivityModule(ThugLifeActivity activity) {
        this.activity = activity;
    }

    @Provides
    MainActivityPresenter providesPresenter(MainActivityPresenterImpl presenter) {
        return presenter;
    }

    @Provides
    LoadAllThugSongsInteractor providesloadAllThugSongInteractor(LoadAllThugSongsInteractorImpl interactor) {
        return interactor;
    }


}
