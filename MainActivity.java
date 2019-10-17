package com.example.project;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity  {
    private enum Operator {none, login, signin,}

    ;
    private Operator optr = Operator.none;
    private EditText username;
    private EditText password_1;
    private Button login_1;
    private Button signin_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_1 = (Button) findViewById(R.id.login);
        login_1.setOnClickListener((View.OnClickListener) MainActivity.this);
        signin_1 = (Button) findViewById(R.id.signin);
        signin_1.setOnClickListener((View.OnClickListener) MainActivity.this);
        username = (EditText)findViewById(R.id.editText_username);
        password_1 = (EditText)findViewById(R.id.editText_password);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public void OnClick(View arg0){
        switch(arg0.getId()){
            case R.id.signin:
                Intent intent_signin = new Intent();
                MainActivity(intent_signin);
                break;
            case R.id.login:
                String user_name = username.getText().toString();
                String password = password_1.getText().toString().trim();

                if(user_name.isEmpty() ){
                    System.out.println("Re-enter the username please");
                }
                if(password.isEmpty()){
                    System.out.println("Re-enter the password please");
                }

                @Override
                        public


                break;


        }

    }







}
