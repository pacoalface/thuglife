package com.franciscoalfacemartin.thuglife.presenters;

import android.content.Context;
import android.widget.Toast;

import com.franciscoalfacemartin.thuglife.navigation.Router;

import javax.inject.Inject;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
public class MainActivityPresenterImpl implements MainActivityPresenter {

    Context context;

    @Inject
    public MainActivityPresenterImpl(Context context) {
        this.context = context;
    }

    private View view;

    @Inject
    Router router;

    @Override
    public void openSettingsActivity() {
        Toast.makeText(context, "Esto es un error",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

    public interface View {
        void showError(int error);
    }
}
