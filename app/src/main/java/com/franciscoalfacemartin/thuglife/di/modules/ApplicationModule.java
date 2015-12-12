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

    @Provides
    @Singleton
    Cache provideOkHttpCache( ThugLifeApplication application ) {
        int cacheSize = 10 * 1024 * 1024; // 10 MiB
        Cache cache = new Cache( application.getCacheDir(), cacheSize );
        return cache;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy( FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES );
        return gsonBuilder.create();
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient( Cache cache ) {
        OkHttpClient client = new OkHttpClient();
        client.setCache( cache );
        return client;
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit( Gson gson, OkHttpClient okHttpClient ) {
        Retrofit retrofit = new Retrofit.Builder().addConverterFactory( GsonConverterFactory.create( gson ) ).baseUrl( "https://www.googleapis.com/" ).client( okHttpClient ).build();
        return retrofit;
    }
}
