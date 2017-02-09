package com.dayang.huanxindemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dayang.huanxindemo.R;

public class MainActivity extends AppCompatActivity {

    private View password;
    private View username;
    private Button login;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = findViewById(R.id.password);
        username = findViewById(R.id.username);
        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);
    }
}
