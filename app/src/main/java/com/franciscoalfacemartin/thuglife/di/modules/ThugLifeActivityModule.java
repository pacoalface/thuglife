package com.franciscoalfacemartin.thuglife.di.modules;

import android.content.Context;

import com.franciscoalfacemartin.thuglife.features.videos_list.datasources.ThugLifeVideosApiDataSource;
import com.franciscoalfacemartin.thuglife.features.videos_list.datasources.ThugLifeVideosApiDataSourceImpl;
import com.franciscoalfacemartin.thuglife.features.videos_list.interactor.LoadAllThugVideosInteractor;
import com.franciscoalfacemartin.thuglife.features.videos_list.interactor.LoadAllThugVideosInteractorImpl;
import com.franciscoalfacemartin.thuglife.features.videos_list.presenter.MainActivityPresenter;
import com.franciscoalfacemartin.thuglife.features.videos_list.presenter.MainActivityPresenterImpl;
import com.franciscoalfacemartin.thuglife.features.videos_list.repository.ThugVideosRepository;
import com.franciscoalfacemartin.thuglife.features.videos_list.repository.ThugVideosRepositoryImpl;
import com.franciscoalfacemartin.thuglife.ui.ThugLifeActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
@Module
public class ThugLifeActivityModule {

    ThugLifeActivity activity;

    public ThugLifeActivityModule( ThugLifeActivity activity ) {
        this.activity = activity;
    }

    @Provides
    MainActivityPresenter providesPresenter( MainActivityPresenterImpl presenter ) {
        return presenter;
    }

    @Provides
    LoadAllThugVideosInteractor providesloadAllThugSongInteractor( LoadAllThugVideosInteractorImpl interactor ) {
        return interactor;
    }

    @Provides
    ThugVideosRepository providesThugVideosRepository( ) {
        return new ThugVideosRepositoryImpl( (Context) activity,new ThugLifeVideosApiDataSourceImpl(activity) );
    }
}
