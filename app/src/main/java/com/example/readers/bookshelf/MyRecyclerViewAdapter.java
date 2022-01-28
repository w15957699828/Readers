package com.example.readers.bookshelf;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.readers.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;



public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    private OnItemClickListener onItemClickListener;

    private RecyclerView mRecyclerView;
    private Context mContext;
    private List<String> dataSource;

    private int addDataPosition = -1;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public MyRecyclerViewAdapter(Context mContext, RecyclerView recyclerView) {
        this.mContext = mContext;
        this.dataSource = new ArrayList<>();
        this.mRecyclerView = recyclerView;
    }

    public void setDataSource(List<String> dataSource) {
        this.dataSource = dataSource;
        notifyDataSetChanged();
    }

    /**
     * 创建并且返回 ViewHolder
     */
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false));
    }

    /**
     * 通过 ViewHolder 来绑定数据

     */
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.mIv.setImageResource(getIcon(position));
        holder.mTv.setText(dataSource.get(position));

        /**
         * 只在瀑布流布局中使用随机高度
         */
        if (mRecyclerView.getLayoutManager().getClass() == StaggeredGridLayoutManager.class) {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, getRandomHeight());
            holder.mTv.setLayoutParams(params);
        } else {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            holder.mTv.setLayoutParams(params);
        }

        // 改变 ItemView 背景颜色
        if (addDataPosition == position) {
            holder.mItemView.setBackgroundColor(Color.RED);
        }

        holder.mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(position);
                }
            }
        });
    }

    /**
     * 返回数据数量
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return dataSource.size();
    }

    private int getIcon(int position) {
        switch (position % 4) {
            case 0:
                return R.drawable.lunyu;
            case 1:
                return R.drawable.sanzijing;
            case 2:
                return R.drawable.daodejing;
            case 3:
                return R.drawable.sunzibingfa;
        }
        return 0;
    }

    /**
     * 返回不同的 ItemView 的高度
     * @return
     */
    private int getRandomHeight() {
        return (int) (Math.random() * 1000);
    }

    /**
     * 添加一条数据
     * @param position
     */
    public void addData(int position) {
        addDataPosition = position;
        dataSource.add(position, "插入的数据");
        notifyItemInserted(position);

        notifyItemRangeChanged(position, dataSource.size() - position);
    }

    /**
     * 删除一条数据
     * @param position
     */
    public void removeData(int position) {
        addDataPosition = -1;
        dataSource.remove(position);
        notifyItemRemoved(position);

        notifyItemRangeChanged(position, dataSource.size() - position);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView mIv;
        private TextView mTv;
        private View mItemView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mIv = itemView.findViewById(R.id.iv);
            mTv = itemView.findViewById(R.id.tv);
            mItemView = itemView;
        }
    }

    /**
     * ItemView 点击事件
     */
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}
