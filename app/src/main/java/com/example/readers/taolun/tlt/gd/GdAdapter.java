package com.example.readers.taolun.tlt.gd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.readers.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class GdAdapter extends RecyclerView.Adapter<com.example.readers.taolun.tlt.gd.GdAdapter.ViewHolder> {

    private List<GdData> mgd;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView gdComment;

        public ViewHolder(View view){
            super(view);
            gdComment = (TextView) view.findViewById(R.id.comment_tv);

        }
    }

    public GdAdapter(List<GdData> gdList){
        mgd = gdList;
    }

    @Override
    public com.example.readers.taolun.tlt.gd.GdAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.comment_item,parent,false);
        com.example.readers.taolun.tlt.gd.GdAdapter.ViewHolder holder = new com.example.readers.taolun.tlt.gd.GdAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(com.example.readers.taolun.tlt.gd.GdAdapter.ViewHolder holder, int position){
        GdData hs = mgd.get(position);
        holder.gdComment.setText(hs.getCommentgd());

    }

    @Override
    public int getItemCount(){
        return mgd.size();

    }

}