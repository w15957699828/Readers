package com.example.readers.gl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.readers.R;
import com.example.readers.gl.gl_tl.gl_dushutaolun;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button_glct = (Button) findViewById(R.id.button_comment);
        button_glct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, gl_comment.class);
                startActivity(intent);
            }
        });

        Button button_glct2 = (Button) findViewById(R.id.button_market);
        button_glct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, gl_ershou.class);
                startActivity(intent);
            }
        });

        Button button_glct3 = (Button) findViewById(R.id.button_communicate);
        button_glct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, gl_dushutaolun.class);
                startActivity(intent);
            }
        });
    }
}