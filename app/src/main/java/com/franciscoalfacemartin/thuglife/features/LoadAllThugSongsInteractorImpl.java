package com.franciscoalfacemartin.thuglife.features;

import com.franciscoalfacemartin.thuglife.callbacks.CollectionDataCallback;
import com.franciscoalfacemartin.thuglife.model.Song;

import javax.inject.Inject;

public class LoadAllThugSongsInteractorImpl implements LoadAllThugSongsInteractor  {

    @Inject
    public LoadAllThugSongsInteractorImpl() {
    }

    @Override
    public void run(Song data, CollectionDataCallback callback) {
        callback.onError(1);
    }
}
