package com.franciscoalfacemartin.thuglife.base.datasource;

import javax.inject.Inject;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class ApiDataSource {

    protected Retrofit generateRetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.googleapis.com/")
                .addConverterFactory( GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}