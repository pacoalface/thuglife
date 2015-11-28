package com.franciscoalfacemartin.thuglife.navigation;

import android.content.Context;
import android.widget.Toast;

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

    public void startSettingsActivity() {
        Toast.makeText(context, "Abriendo actividad de preferencias",Toast.LENGTH_SHORT).show();
    }
}
