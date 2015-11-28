package com.franciscoalfacemartin.thuglife.callbacks;

import java.util.List;

/**
 * Created by franciscoalfacemartin on 28/11/15.
 */
public interface CollectionDataCallback<D> {
    void onSuccess(List<D> result);
    void onError(int error);
}
