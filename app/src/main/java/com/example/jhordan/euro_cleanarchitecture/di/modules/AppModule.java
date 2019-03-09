package com.example.jhordan.euro_cleanarchitecture.di.modules;

import android.app.Application;
import android.content.Context;

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
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application.getApplicationContext();
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
