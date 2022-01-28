package com.example.readers.gl.gl_tl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.readers.R;

import androidx.appcompat.app.AppCompatActivity;

public class gl_dushutaolun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gl_dushutaolun);


        Button button_gl1 = (Button) findViewById(R.id.button2);
        button_gl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gl_dushutaolun.this, gl_hs.class);
                startActivity(intent);
            }
        });
        Button button_gl2 = (Button) findViewById(R.id.button6);
        button_gl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gl_dushutaolun.this, gl_gd.class);
                startActivity(intent);
            }
        });
        Button button_gl3 = (Button) findViewById(R.id.button7);
        button_gl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gl_dushutaolun.this, gl_xd.class);
                startActivity(intent);
            }
        });
        Button button_gl4 = (Button) findViewById(R.id.button8);
        button_gl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gl_dushutaolun.this, gl_zy.class);
                startActivity(intent);
            }
        });
    }
}