package com.franciscoalfacemartin.thuglife.features.videos_list.interactor;

import com.franciscoalfacemartin.thuglife.base.callbacks.CollectionDataCallback;
import com.franciscoalfacemartin.thuglife.model.Video;

import java.util.ArrayList;

import javax.inject.Inject;

public class LoadAllThugVideosInteractorImpl implements LoadAllThugVideosInteractor {

    @Inject
    public LoadAllThugVideosInteractorImpl() {
    }

    @Inject

    @Override
    public void run( Video data, CollectionDataCallback callback) {
        ArrayList<Video> songs = new ArrayList<>();
        songs.add(new Video("alksdj/lajs","song1"));
        callback.onSuccess(songs);
    }
}
