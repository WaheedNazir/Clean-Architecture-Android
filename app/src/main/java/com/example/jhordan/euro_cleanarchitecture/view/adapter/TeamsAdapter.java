package com.example.jhordan.euro_cleanarchitecture.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jhordan.euro_cleanarchitecture.R;
import com.example.jhordan.euro_cleanarchitecture.view.presenter.TeamsPresenter;
import com.example.jhordan.euro_cleanarchitecture.view.viewmodel.TeamViewModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TeamsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final TeamsPresenter presenter;
    private final List<TeamViewModel> teamList;

    public TeamsAdapter(@NonNull TeamsPresenter presenter) {
        this.presenter = presenter;
        teamList = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_row, parent, false);
        return new TeamViewHolder(view, presenter);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        TeamViewHolder teamViewHolder = (TeamViewHolder) holder;
        TeamViewModel team = teamList.get(position);
        teamViewHolder.render(team);
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public void addAll(Collection<TeamViewModel> collection) {
        teamList.addAll(collection);
    }
}
