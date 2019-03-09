package com.example.jhordan.euro_cleanarchitecture.data.repository;

import com.example.jhordan.euro_cleanarchitecture.domain.model.Team;

import java.util.List;

import io.reactivex.Observable;

public interface Repository {

    Observable<List<Team>> teamList();

    Observable<Team> team(final String flag);
}
