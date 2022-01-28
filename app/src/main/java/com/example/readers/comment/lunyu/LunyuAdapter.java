package com.example.readers.comment.lunyu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.readers.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class LunyuAdapter extends RecyclerView.Adapter<LunyuAdapter.ViewHolder> {

    private List<LunyuData> mLunyu;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView lunyuComment;

        public ViewHolder(View view){
            super(view);
            lunyuComment = (TextView) view.findViewById(R.id.comment_tv);

        }
    }

    public LunyuAdapter(List<LunyuData> lunyuList){
        mLunyu = lunyuList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.comment_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        LunyuData lunyu = mLunyu.get(position);
        holder.lunyuComment.setText(lunyu.getCommently());
    }

    @Override
    public int getItemCount(){
        return mLunyu.size();

    }

}
