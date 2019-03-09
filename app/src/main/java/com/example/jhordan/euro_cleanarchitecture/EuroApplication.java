package com.example.jhordan.euro_cleanarchitecture;

import android.app.Activity;
import android.app.Application;

import com.example.jhordan.euro_cleanarchitecture.di.components.DaggerMainComponent;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class EuroApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }

    /**
     * Initialize Dagger
     */
    private void initDagger() {
        DaggerMainComponent.builder().application(this).build().inject(this);
    }

}
