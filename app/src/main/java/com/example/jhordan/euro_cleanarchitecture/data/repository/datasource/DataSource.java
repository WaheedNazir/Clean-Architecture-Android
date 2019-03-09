package com.example.jhordan.euro_cleanarchitecture.data.repository.datasource;

import com.example.jhordan.euro_cleanarchitecture.data.entity.TeamEntity;

import java.util.List;

import io.reactivex.Observable;

public interface DataSource {

    Observable<List<TeamEntity>> teamEntityList();

    Observable<TeamEntity> teamEntity(final String flag);
}
