package com.example.readers.taolun.tlt.xd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.readers.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class XdAdapter extends RecyclerView.Adapter<com.example.readers.taolun.tlt.xd.XdAdapter.ViewHolder> {

    private List<XdData> mxd;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView xdComment;

        public ViewHolder(View view){
            super(view);
            xdComment = (TextView) view.findViewById(R.id.comment_tv);

        }
    }

    public XdAdapter(List<XdData> xdList){
        mxd = xdList;
    }

    @Override
    public com.example.readers.taolun.tlt.xd.XdAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.comment_item,parent,false);
        com.example.readers.taolun.tlt.xd.XdAdapter.ViewHolder holder = new com.example.readers.taolun.tlt.xd.XdAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(com.example.readers.taolun.tlt.xd.XdAdapter.ViewHolder holder, int position){
        XdData xd = mxd.get(position);
        holder.xdComment.setText(xd.getCommentxd());

    }

    @Override
    public int getItemCount(){
        return mxd.size();

    }

}