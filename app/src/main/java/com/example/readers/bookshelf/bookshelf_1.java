package com.example.readers.bookshelf;

import android.os.Bundle;
import android.view.View;

import com.bifan.txtreaderlib.ui.HwTxtPlayActivity;
import com.example.readers.R;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class bookshelf_1 extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookshelf_1);

        mRecyclerView = findViewById(R.id.recycler_view);

        // 线性布局
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(linearLayoutManager);
        mAdapter = new MyRecyclerViewAdapter(this, mRecyclerView);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mAdapter.setOnItemClickListener(new MyRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                if(position == 0) HwTxtPlayActivity.loadTxtFile(bookshelf_1.this,"/storage/emulated/0/lunyu.txt");
                if(position == 1) HwTxtPlayActivity.loadTxtFile(bookshelf_1.this,"/storage/emulated/0/sanzijing.txt");
                if(position == 2) HwTxtPlayActivity.loadTxtFile(bookshelf_1.this,"/storage/emulated/0/daodejing.txt");
                if(position == 3) HwTxtPlayActivity.loadTxtFile(bookshelf_1.this,"/storage/emulated/0/sunzibingfa.txt");
            }
        });
    }

    /**
     * 添加数据
     */
    public void onAddDataClick(View v) {
        List<String> data = new ArrayList<>();
            String lun = "论语";
            data.add(lun);
            String san = "三字经";
            data.add(san);
            String dao = "道德经";
            data.add(dao);
            String sun = "孙子兵法";
            data.add(sun);



        mAdapter.setDataSource(data);
    }
}