package com.franciscoalfacemartin.thuglife.base.callbacks;

/**
 * Created by franciscoalfacemartin on 28/11/15.
 */
public interface SimpleDataCallback<D> {
    void onSuccess(D result);
    void onError(int error);
}