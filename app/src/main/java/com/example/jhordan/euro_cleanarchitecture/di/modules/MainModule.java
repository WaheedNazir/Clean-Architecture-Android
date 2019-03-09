package com.example.jhordan.euro_cleanarchitecture.di.modules;

import android.content.Context;

import com.example.jhordan.euro_cleanarchitecture.EuroApplication;
import com.example.jhordan.euro_cleanarchitecture.data.repository.Repository;
import com.example.jhordan.euro_cleanarchitecture.data.repository.TeamsRepository;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

@Module
public class MainModule {

    private final EuroApplication euroApplication;

    public MainModule(EuroApplication euroApplication) {
        this.euroApplication = euroApplication;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return euroApplication;
    }

    @Provides
    @Singleton
    Repository provideRepository(TeamsRepository teamsRepository) {
        return teamsRepository;
    }

    @Provides
    @Named("executor_thread")
    Scheduler provideExecutorThread() {
        return Schedulers.io();
    }

    @Provides
    @Named("ui_thread")
    Scheduler provideUiThread() {
        return AndroidSchedulers.mainThread();
    }
}
