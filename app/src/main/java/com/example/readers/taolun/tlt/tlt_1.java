package com.example.readers.taolun.tlt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.readers.R;
import com.example.readers.taolun.tlt.gd.gd;
import com.example.readers.taolun.tlt.haoshu.haoshu;
import com.example.readers.taolun.tlt.taol.Taolun_MainActivity;
import com.example.readers.taolun.tlt.xd.xd;

import androidx.appcompat.app.AppCompatActivity;

public class tlt_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlt_1);

        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tlt_1.this, haoshu.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tlt_1.this, gd.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tlt_1.this, xd.class);
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tlt_1.this, Taolun_MainActivity.class);
                startActivity(intent);
            }
        });
    }
}