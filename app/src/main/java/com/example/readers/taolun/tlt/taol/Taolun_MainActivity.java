package com.example.readers.taolun.tlt.taol;

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

public class Taolun_MainActivity extends AppCompatActivity {

    private List<TaolunData> tlList1 = new ArrayList<>();
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
        TaolunAdapter adapter = new TaolunAdapter(tlList1);
        recyclerView.setAdapter(adapter);

        Button buttonlysr = (Button) findViewById(R.id.lysr);
        this.lysrpl = (EditText) findViewById(R.id.Lunyusr);
        buttonlysr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nr;
                nr = lysrpl.getText().toString();
                TaolunData Tl = new TaolunData();
                Tl.setIdtl(3);
                Tl.setCommenttl(nr);
                Tl.save();
                lysrpl.setText("");

            }
        });



    }
    private void initLunyu() {
        List<TaolunData> tlDatas = DataSupport.findAll(TaolunData.class);
        for (TaolunData tl : tlDatas) {
            TaolunData lunyu1 = new TaolunData(tl.getCommenttl());
            tlList1.add(lunyu1);
        }
    }
}