package com.franciscoalfacemartin.thuglife.di.components;

import android.app.Activity;

import com.franciscoalfacemartin.thuglife.ThugLifeApplication;
import com.franciscoalfacemartin.thuglife.di.modules.ApplicationModule;
import com.franciscoalfacemartin.thuglife.navigation.Router;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(Activity activity);
    ThugLifeApplication application();
    Router provideNavigator();
}
