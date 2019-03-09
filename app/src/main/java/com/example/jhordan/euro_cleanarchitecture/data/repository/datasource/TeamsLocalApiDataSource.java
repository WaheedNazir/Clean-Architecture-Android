package com.example.jhordan.euro_cleanarchitecture.data.repository.datasource;

import com.example.jhordan.euro_cleanarchitecture.data.entity.TeamEntity;
import com.example.jhordan.euro_cleanarchitecture.data.local.LocalApi;

import java.util.List;

import io.reactivex.Observable;

public class TeamsLocalApiDataSource implements DataSource {

    private final LocalApi localApi;

    public TeamsLocalApiDataSource(LocalApi localApi) {
        this.localApi = localApi;
    }

    @Override
    public Observable<List<TeamEntity>> teamEntityList() {
        return this.localApi.teamEntityList();
    }

    @Override
    public Observable<TeamEntity> teamEntity(String flag) {
        return this.localApi.teamEntity(flag);
    }
}
