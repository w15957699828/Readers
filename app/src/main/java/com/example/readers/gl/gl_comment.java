package com.example.readers.gl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.readers.R;
import com.example.readers.bookshelf.MyRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class gl_comment extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_1);

        mRecyclerView = findViewById(R.id.recycler_view1);

        // 线性布局
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(linearLayoutManager);
        mAdapter = new MyRecyclerViewAdapter(this, mRecyclerView);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mAdapter.setOnItemClickListener(new MyRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

                if(position == 0) {
                    Intent intent = new Intent(gl_comment.this, gl_ct_lunyu.class);
                    startActivity(intent);
                }
                if(position == 1) {
                    Intent intent = new Intent(gl_comment.this, gl_ct_szj.class);
                    startActivity(intent);
                }
                if(position == 2) {
                    Intent intent = new Intent(gl_comment.this, gl_ct_ddj.class);
                    startActivity(intent);
                }
                if(position == 3) {
                    Intent intent = new Intent(gl_comment.this, gl_ct_szbf.class);
                    startActivity(intent);
                }
            }
        });
    }

    /**
     * 添加数据
     */
    public void onAddDataClick(View v) {
        List<String> data = new ArrayList<>();
        String lun = "论语评论";
        data.add(lun);
        String san = "三字经评论";
        data.add(san);
        String dao = "道德经评论";
        data.add(dao);
        String sun = "孙子兵法评论";
        data.add(sun);



        mAdapter.setDataSource(data);
    }
}