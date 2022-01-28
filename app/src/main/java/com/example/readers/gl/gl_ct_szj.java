package com.example.readers.gl;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.readers.R;
import com.example.readers.comment.szj.SzjAdapter;
import com.example.readers.comment.szj.SzjData;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class gl_ct_szj extends AppCompatActivity {

    private List<SzjData> szjList1 = new ArrayList<>();
    private EditText lysrpl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gl_comment);  //

        LitePal.getDatabase();

        initLunyu();
        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recycler_view3);   //
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        SzjAdapter adapter = new SzjAdapter(szjList1);
        recyclerView.setAdapter(adapter);

        Button buttonlysr = (Button) findViewById(R.id.lysr);
        this.lysrpl = (EditText) findViewById(R.id.Lunyusr);
        buttonlysr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nr;
                nr = lysrpl.getText().toString();
                DataSupport.deleteAll(SzjData.class,"comments = ?",nr);   //
                lysrpl.setText("");

            }
        });


    }
    private void initLunyu() {
        List<SzjData> szjDatas = DataSupport.findAll(SzjData.class);
        for (SzjData szj : szjDatas) {
            Log.d("MainActivity","a" + szj.getComments());
            SzjData lunyu1 = new SzjData(szj.getComments());
            szjList1.add(lunyu1);
        }
    }
}