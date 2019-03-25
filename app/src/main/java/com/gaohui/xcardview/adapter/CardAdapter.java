package com.gaohui.xcardview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaohui.xcardview.R;
import com.gaohui.xcardview.model.GankBeauty;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter {

    private List<GankBeauty> dataList;


    public void setDataList(List<GankBeauty> list) {
        dataList = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_card_view_item, parent, false);
        return new GankBeautyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }

    static class GankBeautyViewHolder extends RecyclerView.ViewHolder {

        public GankBeautyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
