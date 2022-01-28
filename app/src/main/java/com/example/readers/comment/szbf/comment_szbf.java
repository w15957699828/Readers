package com.example.readers.comment.szbf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.readers.R;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class comment_szbf extends AppCompatActivity {

    private List<SzbfData> szbfList1 = new ArrayList<>();
    private EditText lysrpl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_lunyu);

        LitePal.getDatabase();

        initLunyu();
        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recycler_view2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        SzbfAdapter adapter = new SzbfAdapter(szbfList1);
        recyclerView.setAdapter(adapter);

        Button buttonlysr = (Button) findViewById(R.id.lysr);
        this.lysrpl = (EditText) findViewById(R.id.Lunyusr);
        buttonlysr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nr;
                nr = lysrpl.getText().toString();
                SzbfData LD = new SzbfData();
                LD.setIdsz(3);
                LD.setCommentsz(nr);
                LD.save();
                lysrpl.setText("");

            }
        });


    }
    private void initLunyu() {
        List<SzbfData> szbfDatas = DataSupport.findAll(SzbfData.class);
        for (SzbfData szbf : szbfDatas) {
            SzbfData lunyu1 = new SzbfData(szbf.getCommentsz());
            szbfList1.add(lunyu1);
        }
    }
}