package com.example.jhordan.euro_cleanarchitecture.di.modules;


import com.example.jhordan.euro_cleanarchitecture.view.activity.TeamDetailsActivity;
import com.example.jhordan.euro_cleanarchitecture.view.activity.TeamsActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Waheed
 */

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector(modules = FragmentModule.class)
    abstract TeamsActivity contributeTeamsActivity();

    @ContributesAndroidInjector(modules = FragmentModule.class)
    abstract TeamDetailsActivity contributeTeamDetailsActivity();
}
