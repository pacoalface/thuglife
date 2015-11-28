package com.franciscoalfacemartin.thuglife.interactors;

/**
 * Created by franciscoalfacemartin on 28/11/15.
 */
public interface Interactor<D,C> {
    void run(D data, C callback);
}
