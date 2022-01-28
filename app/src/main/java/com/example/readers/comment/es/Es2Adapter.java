package com.example.readers.comment.es;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.readers.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class Es2Adapter extends RecyclerView.Adapter<com.example.readers.comment.es.Es2Adapter.ViewHolder> {

    private List<Es2Data> mEs2;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView es2Comment;

        public ViewHolder(View view){
            super(view);
            es2Comment = (TextView) view.findViewById(R.id.comment_tv);

        }
    }

    public Es2Adapter(List<Es2Data> Es2List){
        mEs2 = Es2List;
    }

    @Override
    public com.example.readers.comment.es.Es2Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.comment_item,parent,false);
        com.example.readers.comment.es.Es2Adapter.ViewHolder holder = new com.example.readers.comment.es.Es2Adapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(com.example.readers.comment.es.Es2Adapter.ViewHolder holder, int position){
        Es2Data es2 = mEs2.get(position);
        holder.es2Comment.setText(es2.getCommentes());
    }

    @Override
    public int getItemCount(){
        return mEs2.size();

    }

}