package com.franciscoalfacemartin.thuglife.features.songs_list.interactor;

import com.franciscoalfacemartin.thuglife.base.callbacks.CollectionDataCallback;
import com.franciscoalfacemartin.thuglife.base.interactors.Interactor;
import com.franciscoalfacemartin.thuglife.model.Song;

public interface LoadAllThugSongsInteractor extends Interactor<Song,CollectionDataCallback> {
    @Override
    void run(Song data, CollectionDataCallback callback);
}
