package com.example.readers.gl.gl_tl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.readers.R;
import com.example.readers.taolun.tlt.xd.XdAdapter;
import com.example.readers.taolun.tlt.xd.XdData;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class gl_xd extends AppCompatActivity {

    private List<XdData> xdList1 = new ArrayList<>();
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
        XdAdapter adapter = new XdAdapter(xdList1);
        recyclerView.setAdapter(adapter);

        Button buttonlysr = (Button) findViewById(R.id.lysr);
        this.lysrpl = (EditText) findViewById(R.id.Lunyusr);
        buttonlysr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nr;
                nr = lysrpl.getText().toString();
                DataSupport.deleteAll(XdData.class,"commentxd = ?",nr);
                lysrpl.setText("");

            }
        });


    }
    private void initLunyu() {
        List<XdData> xdDatas = DataSupport.findAll(XdData.class);
        for (XdData xd : xdDatas) {
            XdData lunyu1 = new XdData(xd.getCommentxd());
            xdList1.add(lunyu1);
        }
    }
}