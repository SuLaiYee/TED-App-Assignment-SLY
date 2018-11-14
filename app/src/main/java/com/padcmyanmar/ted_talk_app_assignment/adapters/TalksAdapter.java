package com.padcmyanmar.ted_talk_app_assignment.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.ted_talk_app_assignment.Delegate.NewsDelegate;
import com.padcmyanmar.ted_talk_app_assignment.R;
import com.padcmyanmar.ted_talk_app_assignment.viewholders.TalksViewHolder;

public class TalksAdapter extends RecyclerView.Adapter {

    NewsDelegate mNewsDelegate;
    public TalksAdapter(NewsDelegate newsDelegate){
        this.mNewsDelegate = newsDelegate;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.viewholder_talks, parent, false);
        return new TalksViewHolder(view, mNewsDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
