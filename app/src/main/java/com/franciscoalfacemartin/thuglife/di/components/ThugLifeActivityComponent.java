package com.franciscoalfacemartin.thuglife.di.components;
import com.franciscoalfacemartin.thuglife.di.annotations.PerActivity;
import com.franciscoalfacemartin.thuglife.di.modules.ThugLifeActivityModule;
import com.franciscoalfacemartin.thuglife.interactors.LoadAllThugSongsInteractor;
import com.franciscoalfacemartin.thuglife.presenters.MainActivityPresenterImpl;
import com.franciscoalfacemartin.thuglife.ui.ThugLifeActivity;

import dagger.Component;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ThugLifeActivityModule.class)
public interface ThugLifeActivityComponent {
    void inject(ThugLifeActivity activity);
    MainActivityPresenterImpl getMainActivityPresenter();
    LoadAllThugSongsInteractor providesloadAllThugSongInteractor();
}
