package com.franciscoalfacemartin.thuglife.base.datasource;

import com.franciscoalfacemartin.thuglife.base.network.LoggingInterceptor;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Inject;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class ApiDataSource {

    protected Retrofit generateRetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .client( generateOkHttpClient() )
                .baseUrl("https://www.googleapis.com/")
                .addConverterFactory( GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    private OkHttpClient generateOkHttpClient() {
        OkHttpClient client = new OkHttpClient();
        client.interceptors().add(new LoggingInterceptor());
        return client;
    }
}