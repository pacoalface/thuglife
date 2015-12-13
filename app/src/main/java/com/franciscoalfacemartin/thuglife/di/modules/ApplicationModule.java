package com.franciscoalfacemartin.thuglife.di.modules;

import com.franciscoalfacemartin.thuglife.ThugLifeApplication;
import com.franciscoalfacemartin.thuglife.navigation.Router;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */

@Module
public class ApplicationModule {

    private ThugLifeApplication application;

    public ApplicationModule( ThugLifeApplication application ) {
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
        return new Router( application.getApplicationContext() );
    }

}
