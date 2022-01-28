package com.example.readers.taolun.tlt.taol;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.readers.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class TaolunAdapter extends RecyclerView.Adapter<TaolunAdapter.ViewHolder> {

    private List<TaolunData> mtl;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tlComment;

        public ViewHolder(View view){
            super(view);
            tlComment = (TextView) view.findViewById(R.id.comment_tv);

        }
    }

    public TaolunAdapter(List<TaolunData> tlList){
        mtl = tlList;
    }

    @Override
    public TaolunAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tl_item,parent,false);
        TaolunAdapter.ViewHolder holder = new TaolunAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(TaolunAdapter.ViewHolder holder, int position){
        TaolunData tl = mtl.get(position);
        holder.tlComment.setText(tl.getCommenttl());

    }

    @Override
    public int getItemCount(){
        return mtl.size();

    }
    
    //item点击事件
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

}
