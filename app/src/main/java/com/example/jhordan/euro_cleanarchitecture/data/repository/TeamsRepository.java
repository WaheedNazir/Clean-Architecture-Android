package com.example.jhordan.euro_cleanarchitecture.data.repository;

import android.support.annotation.NonNull;

import com.example.jhordan.euro_cleanarchitecture.data.repository.datasource.DataSource;
import com.example.jhordan.euro_cleanarchitecture.data.repository.datasource.TeamDataSourceFactory;
import com.example.jhordan.euro_cleanarchitecture.data.repository.datasource.mapper.TeamToTeamEntityMapper;
import com.example.jhordan.euro_cleanarchitecture.domain.model.Team;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

@Singleton
public class TeamsRepository implements Repository {

    private final TeamToTeamEntityMapper teamToTeamEntityMapper;
    private final DataSource dataSource;

    @Inject
    TeamsRepository(@NonNull TeamDataSourceFactory teamDataSourceFactory,
                    @NonNull TeamToTeamEntityMapper teamToTeamEntityMapper) {
        this.teamToTeamEntityMapper = teamToTeamEntityMapper;
        this.dataSource = teamDataSourceFactory.createDataSource();
    }

    @Override
    public Observable<List<Team>> teamList() {
        return dataSource.teamEntityList().map(teamToTeamEntityMapper::reverseMap);
    }

    @Override
    public Observable<Team> team(String flag) {
        return dataSource.teamEntity(flag).map(teamToTeamEntityMapper::reverseMap);
    }

}
