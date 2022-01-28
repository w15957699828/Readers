package com.example.readers.comment.ddj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.readers.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class DdjAdapter extends RecyclerView.Adapter<com.example.readers.comment.ddj.DdjAdapter.ViewHolderd> {

    private List<DdjData> mDdj;

    static class ViewHolderd extends RecyclerView.ViewHolder{
        TextView ddjComment;

        public ViewHolderd(View view){
            super(view);
            ddjComment = (TextView) view.findViewById(R.id.comment_tv);

        }
    }

    public DdjAdapter(List<DdjData> DdjList){
        mDdj = DdjList;
    }

    @Override
    public com.example.readers.comment.ddj.DdjAdapter.ViewHolderd onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.comment_item,parent,false);
        com.example.readers.comment.ddj.DdjAdapter.ViewHolderd holder = new com.example.readers.comment.ddj.DdjAdapter.ViewHolderd(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(com.example.readers.comment.ddj.DdjAdapter.ViewHolderd holder, int position){
        DdjData ddj = mDdj.get(position);
        holder.ddjComment.setText(ddj.getCommentd());
    }

    @Override
    public int getItemCount(){
        return mDdj.size();

    }

}