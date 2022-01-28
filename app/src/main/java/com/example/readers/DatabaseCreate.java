package com.example.readers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.litepal.LitePal;

import androidx.appcompat.app.AppCompatActivity;

public class DatabaseCreate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_create);
        Button createdatabase = (Button) findViewById(R.id.button_data);
        createdatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LitePal.getDatabase();
            }
        });

//        Button addData = (Button) findViewById(R.id.add_Data);
//        addData.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                LunyuData lunyuData = new LunyuData();
//
//                lunyuData.setIdly(1);
//                lunyuData.setCommently("真是一本优秀的书");
//                lunyuData.save();
//
////                lunyuData.setIdly(2);
////                lunyuData.setCommently("孔子的著作");
////                lunyuData.save();
//
////                lunyuData.setIdly(3);
////                lunyuData.setCommently("伟大的国学");
////                lunyuData.save();
//
//            }
//        });

//        Button queryData = (Button) findViewById(R.id.query_data);
//        queryData.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                List<LunyuData> lunyuData = DataSupport.findAll(LunyuData.class);
//                for(LunyuData lunyuData1 : lunyuData){
//                    Log.d("DatabaseCreate","comment id is" + lunyuData1.getIdly());
//                    Log.d("DatabaseCreate","comment is" + lunyuData1.getCommently());
//                }
//            }
//        });
    }
}