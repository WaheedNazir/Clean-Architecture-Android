package com.example.jhordan.euro_cleanarchitecture.data.repository.datasource;

import android.content.Context;
import android.support.annotation.NonNull;

import com.example.jhordan.euro_cleanarchitecture.data.local.LocalImpl;
import com.example.jhordan.euro_cleanarchitecture.data.repository.datasource.mapper.TeamEntityJsonMapper;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TeamDataSourceFactory {

    private final Context context;

    @Inject
    public TeamDataSourceFactory(@NonNull Context context) {
        this.context = context;
    }

    public DataSource createDataSource() {
        TeamEntityJsonMapper teamEntityJsonMapper = new TeamEntityJsonMapper();
        LocalImpl local = new LocalImpl(context, teamEntityJsonMapper);
        return new TeamsLocalApiDataSource(local);
    }
}
