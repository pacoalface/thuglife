package com.franciscoalfacemartin.thuglife.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import com.franciscoalfacemartin.thuglife.model.Video;

import javax.inject.Inject;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
public class Router {

    private final Context context;

    @Inject
    public Router(Context context) {
        this.context = context;
    }

    public void startVideoActivity(Video video) {
        Intent intent=new Intent( Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v="+video.url));
        intent.addFlags( Intent.FLAG_ACTIVITY_NEW_TASK );
        context.startActivity(intent);
    }
}
