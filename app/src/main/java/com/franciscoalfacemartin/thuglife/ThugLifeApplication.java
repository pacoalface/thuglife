package com.franciscoalfacemartin.thuglife;

import android.app.Application;

import com.franciscoalfacemartin.thuglife.di.components.ApplicationComponent;
import com.franciscoalfacemartin.thuglife.di.components.DaggerApplicationComponent;
import com.franciscoalfacemartin.thuglife.di.modules.ApplicationModule;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
public class ThugLifeApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override public void onCreate() {
        super.onCreate();
        this.initializeInjector();
    }

    private void initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }
}
