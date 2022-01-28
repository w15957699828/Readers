package com.example.readers.comment.lunyu;

import android.os.Bundle;
import android.util.Log;
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

public class comment_lunyu extends AppCompatActivity {


    private List<LunyuData> lunyuList1 = new ArrayList<>();
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
        LunyuAdapter adapter = new LunyuAdapter(lunyuList1);
        recyclerView.setAdapter(adapter);

        Button buttonlysr = (Button) findViewById(R.id.lysr);
        this.lysrpl = (EditText) findViewById(R.id.Lunyusr);
        buttonlysr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nr;
                nr = lysrpl.getText().toString();
                LunyuData LD = new LunyuData();
                LD.setIdly(3);
                LD.setCommently(nr);
                LD.save();
                lysrpl.setText("");

            }
        });


    }
    private void initLunyu() {
        List<LunyuData> lunyuDatas = DataSupport.findAll(LunyuData.class);
        for (LunyuData lunyu : lunyuDatas) {
            Log.d("MainActivity","a" + lunyu.getCommently());
            LunyuData lunyu1 = new LunyuData(lunyu.getCommently());
            lunyuList1.add(lunyu1);
        }
    }


}