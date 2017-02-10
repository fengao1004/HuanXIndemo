package com.dayang.huanxindemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dayang.huanxindemo.R;
import com.hyphenate.chat.EMClient;
import com.hyphenate.exceptions.HyphenateException;

public class LoginActivity extends AppCompatActivity {

    private EditText password;
    private EditText username;
    private Button login;
    private Button register;
    String userName;
    String passWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = (EditText) findViewById(R.id.password);
        username = (EditText) findViewById(R.id.username);
        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName = username.getText().toString().trim();
                passWord = password.getText().toString().trim();
                try {
                    EMClient.getInstance().createAccount(userName, passWord);
                } catch (HyphenateException e) {
                    Toast.makeText(LoginActivity.this.getApplicationContext(), e.toString(), 0).show();
                    e.printStackTrace();
                    return;
                }
                Toast.makeText(LoginActivity.this.getApplicationContext(), "注册成功，请点击登录", 0).show();
            }
        });
    }
}
