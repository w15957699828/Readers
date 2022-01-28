package com.example.readers.gl.gl_tl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.readers.R;
import com.example.readers.taolun.tlt.gd.GdAdapter;
import com.example.readers.taolun.tlt.gd.GdData;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class gl_gd extends AppCompatActivity {

    private List<GdData> gdList1 = new ArrayList<>();
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
        GdAdapter adapter = new GdAdapter(gdList1);
        recyclerView.setAdapter(adapter);

        Button buttonlysr = (Button) findViewById(R.id.lysr);
        this.lysrpl = (EditText) findViewById(R.id.Lunyusr);
        buttonlysr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nr;
                nr = lysrpl.getText().toString();
                DataSupport.deleteAll(GdData.class,"commentgd = ?",nr);
                lysrpl.setText("");

            }
        });


    }
    private void initLunyu() {
        List<GdData> gdDatas = DataSupport.findAll(GdData.class);
        for (GdData gd : gdDatas) {
            GdData lunyu1 = new GdData(gd.getCommentgd());
            gdList1.add(lunyu1);
        }
    }
}
