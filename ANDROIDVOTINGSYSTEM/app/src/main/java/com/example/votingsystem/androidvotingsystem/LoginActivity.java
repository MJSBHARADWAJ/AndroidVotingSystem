package com.example.votingsystem.androidvotingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class LoginActivity extends AppCompatActivity {

    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent = new Intent(LoginActivity.this,LoginActivity2.class);
                startActivity(intent);


            }

        });

        button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent = new Intent(LoginActivity.this,voterlogin.class);
                startActivity(intent);


            }

        });
    }
}
