package com.example.readers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.readers.bookshelf.bookshelf_1;
import com.example.readers.comment.comment_1;
import com.example.readers.comment.es.es2;
import com.example.readers.taolun.tlt.tlt_1;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button1 = (Button) findViewById(R.id.button_bookshelf);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, bookshelf_1.class);
                startActivity(intent);

            }
        });

        Button button2 = (Button) findViewById(R.id.button_comment);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, comment_1.class);
                startActivity(intent);

            }
        });

        Button button3 = (Button) findViewById(R.id.button_communicate);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, tlt_1.class);
                startActivity(intent);

            }
        });

        Button button4 = (Button) findViewById(R.id.button_market);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, es2.class);
                startActivity(intent);

            }
        });
    }
}