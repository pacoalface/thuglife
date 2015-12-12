package com.franciscoalfacemartin.thuglife.base.datasource;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public abstract class ApiDataSource {

    protected Retrofit generateRetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://gdata.youtube.com/")
                .addConverterFactory( GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}