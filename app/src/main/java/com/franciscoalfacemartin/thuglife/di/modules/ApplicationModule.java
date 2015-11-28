package com.franciscoalfacemartin.thuglife.di.modules;

import com.franciscoalfacemartin.thuglife.ThugLifeApplication;
import com.franciscoalfacemartin.thuglife.navigation.Router;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */

@Module
public class ApplicationModule {
    private ThugLifeApplication application;

    public ApplicationModule(ThugLifeApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    ThugLifeApplication provideApplicationContext() {
        return this.application;
    }

    @Provides
    @Singleton
    Router provideNavigator() {
        return new Router(application.getApplicationContext());
    }
}
