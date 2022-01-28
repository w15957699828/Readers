package com.example.readers.taolun.tlt.haoshu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.readers.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class HaoshuAdapter extends RecyclerView.Adapter<com.example.readers.taolun.tlt.haoshu.HaoshuAdapter.ViewHolder> {

    private List<HaoshuData> mhs;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView hsComment;

        public ViewHolder(View view){
            super(view);
            hsComment = (TextView) view.findViewById(R.id.comment_tv);

        }
    }

    public HaoshuAdapter(List<HaoshuData> hsList){
        mhs = hsList;
    }

    @Override
    public com.example.readers.taolun.tlt.haoshu.HaoshuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.comment_item,parent,false);
        com.example.readers.taolun.tlt.haoshu.HaoshuAdapter.ViewHolder holder = new com.example.readers.taolun.tlt.haoshu.HaoshuAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(com.example.readers.taolun.tlt.haoshu.HaoshuAdapter.ViewHolder holder, int position){
        HaoshuData hs = mhs.get(position);
        holder.hsComment.setText(hs.getCommenths());

    }

    @Override
    public int getItemCount(){
        return mhs.size();

    }

}

