package com.example.readers.gl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.readers.R;
import com.example.readers.comment.ddj.DdjAdapter;
import com.example.readers.comment.ddj.DdjData;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class gl_ct_ddj extends AppCompatActivity {

    private List<DdjData> ddjList1 = new ArrayList<>();
    private EditText lysrpl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gl_comment);

        LitePal.getDatabase();

        initLunyu();
        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recycler_view3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        DdjAdapter adapter = new DdjAdapter(ddjList1);
        recyclerView.setAdapter(adapter);

        Button buttonlysr = (Button) findViewById(R.id.lysr);
        this.lysrpl = (EditText) findViewById(R.id.Lunyusr);
        buttonlysr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nr;
                nr = lysrpl.getText().toString();
                DataSupport.deleteAll(DdjData.class,"commentd = ?",nr);   //
                lysrpl.setText("");

            }
        });


    }
    private void initLunyu() {
        List<DdjData> ddjDatas = DataSupport.findAll(DdjData.class);
        for (DdjData ddj : ddjDatas) {
            DdjData lunyu1 = new DdjData(ddj.getCommentd());
            ddjList1.add(lunyu1);
        }
    }
}