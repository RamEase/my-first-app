package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
public class audioAct extends AppCompatActivity {

    MediaPlayer aud1, aud2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        Switch srcLoop = (Switch) findViewById(R.id.loop);
        final Button srcplayBut1 = (Button) findViewById(R.id.playBut1);
        final Button srcplayBut2 = (Button) findViewById(R.id.playBut2);
        aud1 = MediaPlayer.create(this, R.raw.smktht);
        aud2 = MediaPlayer.create(this, R.raw.lonely);
        final Button srcyes1 = (Button) findViewById(R.id.yes1);
        final Button srcno1 = (Button) findViewById(R.id.no1);
        final TextView srcsecTV = (TextView) findViewById(R.id.secTV);
        final Button srcyes2= (Button) findViewById(R.id.yes2);
        final Button srcno2= (Button) findViewById(R.id.no2);
        Button srcpause = (Button) findViewById(R.id.pauseBut);
        final TextView srcthirdTV = (TextView) findViewById(R.id.thirdTV);
        final TextView srcfirstTV = (TextView) findViewById(R.id.firstTV);

        srcplayBut2.setVisibility(View.GONE);
        srcsecTV.setVisibility(View.GONE);
        srcyes2.setVisibility(View.GONE);
        srcno2.setVisibility(View.GONE);
        srcthirdTV.setVisibility(View.GONE);



        srcLoop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                aud1.setLooping(b);
                aud2.setLooping(b);
            }
        });

        srcplayBut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aud1.start();
                if (aud2.isPlaying())
                    aud2.pause();
            }
        });
        srcplayBut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aud2.start();
                if (aud1.isPlaying())
                    aud1.pause();
            }
        });
        srcyes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                srcplayBut1.setVisibility(View.GONE);
                srcfirstTV.setVisibility(View.GONE);
                srcyes1.setVisibility(View.GONE);
                srcno1.setVisibility(View.GONE);
                srcyes2.setVisibility(View.VISIBLE);
                srcno2.setVisibility(View.VISIBLE);
                srcplayBut2.setVisibility(View.VISIBLE);
                srcsecTV.setVisibility(View.VISIBLE);
                srcthirdTV.setVisibility(View.VISIBLE);
            }
        });
        srcno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                srcplayBut1.setVisibility(View.GONE);
                srcfirstTV.setVisibility(View.GONE);
                srcyes1.setVisibility(View.GONE);
                srcno1.setVisibility(View.GONE);
                srcyes2.setVisibility(View.VISIBLE);
                srcno2.setVisibility(View.VISIBLE);
                srcplayBut2.setVisibility(View.VISIBLE);
                srcsecTV.setVisibility(View.VISIBLE);
                srcthirdTV.setVisibility(View.VISIBLE);
            }
        });
        srcpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aud1.isPlaying())
                {aud1.pause();}
               if(aud2.isPlaying())
                {aud2.pause();}
            }
        });
        srcyes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), ILU.class);
                startActivity(i);
            }
        });
        srcno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), BISLY.class);
                startActivity(i);
            }
        });


    }


}