package com.example.readers.comment.szj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.readers.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class SzjAdapter extends RecyclerView.Adapter<SzjAdapter.ViewHolder> {

    private List<SzjData> mSzj;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView szjComment;

        public ViewHolder(View view){
            super(view);
            szjComment = (TextView) view.findViewById(R.id.comment_tv);

        }
    }

    public SzjAdapter(List<SzjData> szjList){
        mSzj = szjList;
    }

    @Override
    public com.example.readers.comment.szj.SzjAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.comment_item,parent,false);
        com.example.readers.comment.szj.SzjAdapter.ViewHolder holder = new com.example.readers.comment.szj.SzjAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(com.example.readers.comment.szj.SzjAdapter.ViewHolder holder, int position){
        SzjData szj = mSzj.get(position);
        holder.szjComment.setText(szj.getComments());
    }

    @Override
    public int getItemCount(){
        return mSzj.size();

    }

}