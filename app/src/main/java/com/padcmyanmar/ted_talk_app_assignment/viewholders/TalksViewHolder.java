package com.padcmyanmar.ted_talk_app_assignment.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmar.ted_talk_app_assignment.Delegate.NewsDelegate;

public class TalksViewHolder extends RecyclerView.ViewHolder {
    NewsDelegate newsDelegate;
    public TalksViewHolder(View itemView, final NewsDelegate newsDelegate) {
        super(itemView);
        this.newsDelegate = newsDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newsDelegate.onTapTalks();
            }
        });
    }
}
