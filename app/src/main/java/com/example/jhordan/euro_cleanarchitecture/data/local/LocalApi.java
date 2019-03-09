package com.example.jhordan.euro_cleanarchitecture.data.local;

import com.example.jhordan.euro_cleanarchitecture.data.entity.TeamEntity;

import java.util.List;

import io.reactivex.Observable;

public interface LocalApi {

    Observable<List<TeamEntity>> teamEntityList();

    Observable<TeamEntity> teamEntity(final String flag);
}
