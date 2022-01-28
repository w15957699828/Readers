package com.example.readers.comment.es;

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

public class es2 extends AppCompatActivity {

    private List<Es2Data> es2List1 = new ArrayList<>();
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
        Es2Adapter adapter = new Es2Adapter(es2List1);
        recyclerView.setAdapter(adapter);

        Button buttonlysr = (Button) findViewById(R.id.lysr);
        this.lysrpl = (EditText) findViewById(R.id.Lunyusr);
        buttonlysr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nr;
                nr = lysrpl.getText().toString();
                Es2Data Ess = new Es2Data();
                Ess.setIde(3);
                Ess.setCommentes(nr);
                Ess.save();
                lysrpl.setText("");

            }
        });


    }
    private void initLunyu() {
        List<Es2Data> es2Datas = DataSupport.findAll(Es2Data.class);
        for (Es2Data es2 : es2Datas) {
            Es2Data lunyu1 = new Es2Data(es2.getCommentes());
            es2List1.add(lunyu1);
        }
    }
}