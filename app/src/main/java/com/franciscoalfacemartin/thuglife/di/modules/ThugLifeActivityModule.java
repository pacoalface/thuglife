package com.franciscoalfacemartin.thuglife.di.modules;

import com.franciscoalfacemartin.thuglife.presenters.MainActivityPresenter;
import com.franciscoalfacemartin.thuglife.presenters.MainActivityPresenterImpl;
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
    MainActivityPresenter providesPresenter() {
        return new MainActivityPresenterImpl(activity);
    }
}
