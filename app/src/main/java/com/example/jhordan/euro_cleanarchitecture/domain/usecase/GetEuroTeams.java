package com.example.jhordan.euro_cleanarchitecture.domain.usecase;

import com.example.jhordan.euro_cleanarchitecture.data.repository.Repository;
import com.example.jhordan.euro_cleanarchitecture.domain.model.Team;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

public class GetEuroTeams extends UseCase<List<Team>> {

    private final Repository repository;

    @Inject
    public GetEuroTeams(@Named("executor_thread") Scheduler executorThread,
                        @Named("ui_thread") Scheduler uiThread, Repository repository) {
        super(executorThread, uiThread);
        this.repository = repository;
    }

    @Override
    public Observable<List<Team>> createObservableUseCase() {
        return this.repository.teamList();
    }
}
