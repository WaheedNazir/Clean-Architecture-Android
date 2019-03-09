package com.example.jhordan.euro_cleanarchitecture.di.components;

import android.content.Context;

import com.example.jhordan.euro_cleanarchitecture.di.modules.MainModule;
import com.example.jhordan.euro_cleanarchitecture.view.activity.TeamDetailsActivity;
import com.example.jhordan.euro_cleanarchitecture.view.activity.TeamsActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(TeamsActivity activity);

    void inject(TeamDetailsActivity activity);

    Context context();
}
