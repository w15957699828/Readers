package com.example.readers.gl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.readers.R;

import androidx.appcompat.app.AppCompatActivity;

public class registered_gl extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);

        Button re_register = findViewById(R.id.re_register);
        re_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username = findViewById(R.id.re_username);
                EditText password = findViewById(R.id.re_password);
                EditText passwordAffirm = findViewById(R.id.re_affirm);
                String inputUsername = username.getText().toString();
                String inputPassword = password.getText().toString();
                String inputAffirm = passwordAffirm.getText().toString();
                gl_Data user = new gl_Data();
                if (inputAffirm.equals(inputPassword)) {
                    //存储账号密码
                    user.setGLname(inputUsername);
                    user.setGLPassword(inputPassword);
                    user.save();
                    //传回账号
                    Intent intent = new Intent(registered_gl.this, guanliyuan.class);
                    startActivity(intent);
                    intent.putExtra("username", inputUsername);
                    setResult(RESULT_OK, intent);
                    finish();
                } else {
                    Toast.makeText(registered_gl.this,"两次密码不一致", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
