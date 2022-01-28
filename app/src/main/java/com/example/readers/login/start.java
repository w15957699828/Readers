package com.example.readers.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.readers.MainActivity2;
import com.example.readers.R;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        LitePal.initialize(this);
        //创建数据库
        Connector.getDatabase();
        TextView register = findViewById(R.id.lg_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(start.this, registered.class);
                startActivityForResult(intent, 1);
            }
        });

        //登录
        Button loginButton = findViewById(R.id.lg_login2);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<UserData> users = DataSupport.findAll(UserData.class);
                EditText username = findViewById(R.id.lg_username);
                EditText password = findViewById(R.id.lg_password);

                //账号密码匹配
                for (UserData user : users) {
                    if (user.getUsername().equals(username.getText().toString()) && user.getPassword().equals(password.getText().toString())) {
                        Intent intent = new Intent(start.this, MainActivity2.class);
                        startActivity(intent);
                        onDestroy();
                    } else {
                        Toast.makeText(start.this,"账号或密码错误！", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

   // 接受传回来的账号
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    final EditText loginUsername = findViewById(R.id.lg_username);
                    String returnUsername = data.getStringExtra("username");
                    loginUsername.setText(returnUsername);
                    loginUsername.setSelection(returnUsername.length());
                }
                break;
            default:
        }
    }
}