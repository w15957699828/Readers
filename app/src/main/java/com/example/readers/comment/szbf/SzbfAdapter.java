package com.example.readers.comment.szbf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.readers.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class SzbfAdapter extends RecyclerView.Adapter<com.example.readers.comment.szbf.SzbfAdapter.ViewHolder> {

    private List<SzbfData> mSzbf;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView szbfComment;

        public ViewHolder(View view){
            super(view);
            szbfComment = (TextView) view.findViewById(R.id.comment_tv);

        }
    }

    public SzbfAdapter(List<SzbfData> szbfList){
        mSzbf = szbfList;
    }

    @Override
    public com.example.readers.comment.szbf.SzbfAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.comment_item,parent,false);
        com.example.readers.comment.szbf.SzbfAdapter.ViewHolder holder = new com.example.readers.comment.szbf.SzbfAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(com.example.readers.comment.szbf.SzbfAdapter.ViewHolder holder, int position){
        SzbfData szbf = mSzbf.get(position);
        holder.szbfComment.setText(szbf.getCommentsz());
    }

    @Override
    public int getItemCount(){
        return mSzbf.size();

    }

}