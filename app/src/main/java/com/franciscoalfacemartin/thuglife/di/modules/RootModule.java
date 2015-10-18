package com.franciscoalfacemartin.thuglife.di.modules;

import android.app.Activity;

import com.franciscoalfacemartin.thuglife.di.annotations.PerActivity;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */

@Module
public class RootModule {

    private final Activity activity;

    public RootModule(Activity activity) {
        this.activity = activity;
    }

    @Named("ActivityContext")
    @Provides
    @PerActivity
    Activity activity() {
        return this.activity;
    }
}
