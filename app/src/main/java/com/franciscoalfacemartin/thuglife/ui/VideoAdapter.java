package com.franciscoalfacemartin.thuglife.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.franciscoalfacemartin.thuglife.R;
import com.franciscoalfacemartin.thuglife.base.callbacks.ItemClickListener;
import com.franciscoalfacemartin.thuglife.model.Video;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    private ArrayList<Video> videos;
    private ItemClickListener listener;

    @Inject
    public VideoAdapter() {
    }



    public void setData( ArrayList<Video> videos, ItemClickListener listener) {
        this.videos = videos;
        this.listener = listener;
    }

    @Override
    public VideoViewHolder onCreateViewHolder( ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.video_item, null, false );
        VideoViewHolder holder = new VideoViewHolder( view );
        return holder;
    }

    @Override
    public void onBindViewHolder( VideoViewHolder holder, int position ) {
        Glide.with( holder.image.getContext() ).load( videos.get( position ).pathImage ).into( holder.image );
        holder.title.setText( videos.get( position ).name );
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    class VideoViewHolder extends RecyclerView.ViewHolder{

        @Bind( R.id.image ) ImageView image;
        @Bind( R.id.title ) TextView title;

        public VideoViewHolder( View itemView ) {
            super( itemView );
            ButterKnife.bind( this,itemView );
        }

        @OnClick(R.id.root_view) public void clickItem(View view) {
            listener.onClickItem( getAdapterPosition() );
        }
    }
}
