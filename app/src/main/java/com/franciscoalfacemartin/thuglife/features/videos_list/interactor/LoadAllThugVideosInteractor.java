package com.franciscoalfacemartin.thuglife.features.videos_list.interactor;

import com.franciscoalfacemartin.thuglife.base.callbacks.CollectionDataCallback;
import com.franciscoalfacemartin.thuglife.base.interactors.Interactor;
import com.franciscoalfacemartin.thuglife.model.Video;

public interface LoadAllThugVideosInteractor extends Interactor<Video,CollectionDataCallback> {
    @Override
    void run( Video data, CollectionDataCallback callback);
}
