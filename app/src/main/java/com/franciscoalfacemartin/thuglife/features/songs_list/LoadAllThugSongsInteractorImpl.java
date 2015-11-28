package com.franciscoalfacemartin.thuglife.features.songs_list;

import com.franciscoalfacemartin.thuglife.callbacks.CollectionDataCallback;
import com.franciscoalfacemartin.thuglife.model.Song;

import java.util.ArrayList;

import javax.inject.Inject;

public class LoadAllThugSongsInteractorImpl implements LoadAllThugSongsInteractor  {

    @Inject
    public LoadAllThugSongsInteractorImpl() {
    }

    @Override
    public void run(Song data, CollectionDataCallback callback) {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("alksdj/lajs","song1"));
        callback.onSuccess(songs);
    }
}
