package com.example.readers.gl.gl_tl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.readers.R;
import com.example.readers.taolun.tlt.haoshu.HaoshuAdapter;
import com.example.readers.taolun.tlt.haoshu.HaoshuData;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class gl_hs extends AppCompatActivity {

    private List<HaoshuData> hsList1 = new ArrayList<>();
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
        HaoshuAdapter adapter = new HaoshuAdapter(hsList1);
        recyclerView.setAdapter(adapter);

        Button buttonlysr = (Button) findViewById(R.id.lysr);
        this.lysrpl = (EditText) findViewById(R.id.Lunyusr);
        buttonlysr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nr;
                nr = lysrpl.getText().toString();
                DataSupport.deleteAll(HaoshuData.class,"commenths = ?",nr);
                lysrpl.setText("");

            }
        });


    }
    private void initLunyu() {
        List<HaoshuData> hsDatas = DataSupport.findAll(HaoshuData.class);
        for (HaoshuData hs : hsDatas) {
            HaoshuData lunyu1 = new HaoshuData(hs.getCommenths());
            hsList1.add(lunyu1);
        }
    }
}
