package com.franciscoalfacemartin.thuglife.interactors;

import com.franciscoalfacemartin.thuglife.callbacks.CollectionDataCallback;
import com.franciscoalfacemartin.thuglife.model.Song;

public interface LoadAllThugSongsInteractor extends Interactor<Song,CollectionDataCallback>  {
    @Override
    void run(Song data, CollectionDataCallback callback);
}
