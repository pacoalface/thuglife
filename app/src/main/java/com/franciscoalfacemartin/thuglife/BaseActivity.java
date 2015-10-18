package com.franciscoalfacemartin.thuglife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.franciscoalfacemartin.thuglife.di.components.ApplicationComponent;
import com.franciscoalfacemartin.thuglife.di.modules.RootModule;

/**
 * Created by franciscoalfacemartin on 17/10/15.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getApplicationComponent().inject(this);
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((ThugLifeApplication)getApplication()).getApplicationComponent();
    }

    protected RootModule getActivityModule() {
        return new RootModule(this);
    }

}
