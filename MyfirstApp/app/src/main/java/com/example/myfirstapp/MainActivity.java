package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button srcwelcBut = (Button) findViewById(R.id.welcBut);
        Button srcaudioBut = (Button) findViewById(R.id.audioBut);
        Button srcwebListBut = (Button) findViewById(R.id.webListBut);
        Button srcfreeSitesBut = (Button) findViewById(R.id.freeSitesBut);
        Button srchelpBut = (Button) findViewById(R.id.helpBut);

        srcwelcBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Welcome and thanks to review my app", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void newAct(View v){
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.audioBut:
                intent.setClass(this, audioAct.class);
                startActivity(intent);
                break;

            case R.id.webListBut:
                intent.setClass(this, WebList.class);
                startActivity(intent);
                break;

            case R.id.freeSitesBut:
                intent.setClass(this, FreeSites.class);
                startActivity(intent);
                break;

            case R.id.helpBut:
                intent.setClass(this, Help.class);
                startActivity(intent);
                break;


        }

    }

}