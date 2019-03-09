package com.example.jhordan.euro_cleanarchitecture;

import android.app.Application;

import com.example.jhordan.euro_cleanarchitecture.di.components.DaggerMainComponent;
import com.example.jhordan.euro_cleanarchitecture.di.components.MainComponent;
import com.example.jhordan.euro_cleanarchitecture.di.modules.MainModule;

public class EuroApplication extends Application {

    private MainComponent mainComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        mainComponent = DaggerMainComponent.builder().mainModule(new MainModule(this)).build();
    }

    public MainComponent getMainComponent() {
        return mainComponent;
    }
}
