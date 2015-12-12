package com.franciscoalfacemartin.thuglife.base.repository;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import javax.inject.Inject;

public abstract class Repository {

    @Inject Context context;

    protected boolean haveInternetConnection(){
        ConnectivityManager cm =(ConnectivityManager) context.getSystemService( Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
}
