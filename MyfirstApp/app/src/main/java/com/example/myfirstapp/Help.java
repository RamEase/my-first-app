package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Help extends AppCompatActivity {

    EditText srcbodyMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        TextView srcTvLink = (TextView) findViewById(R.id.TVLink);
        srcbodyMail = (EditText) findViewById(R.id.bodyMail);
        Button srcsendBut = (Button) findViewById(R.id.sendBut);
        srcTvLink.setMovementMethod(LinkMovementMethod.getInstance());

        srcsendBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Sbodymail = srcbodyMail.getText().toString();
                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setType("rfc822");
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"jhonnnydoee@gmail.com"});
                i.putExtra(Intent.EXTRA_TEXT, Sbodymail);
                try {
                    startActivity(Intent.createChooser(i, "Send Mail.."));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


}