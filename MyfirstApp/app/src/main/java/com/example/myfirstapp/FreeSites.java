package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FreeSites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_sites);
        Toast.makeText(this, "Free", Toast.LENGTH_LONG).show();
        final ListView srcLV= (ListView) findViewById(R.id.LV);
        final Button srcbackBut = (Button) findViewById(R.id.backBut);
        final WebView srcWv = (WebView) findViewById(R.id.webView);
        final TextView srcTV = (TextView) findViewById(R.id.TV);
        final ArrayAdapter<CharSequence> AdapWeb = ArrayAdapter.createFromResource(this, R.array.FreeSites, android.R.layout.simple_list_item_1);
        srcLV.setAdapter(AdapWeb);
        srcbackBut.setVisibility(View.GONE);
        srcWv.setVisibility(View.GONE);
    srcLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            srcLV.setVisibility(View.GONE);
            srcTV.setVisibility(View.GONE);
            srcWv.setWebViewClient(new WebViewClient());
            switch (i) {
                case 0:
                    srcbackBut.setVisibility(View.VISIBLE);
                    srcWv.setVisibility(View.VISIBLE);
                    srcWv.loadUrl("https://www.freecodecamp.org");
                    break;
                case 1:
                    srcbackBut.setVisibility(View.VISIBLE);
                    srcWv.setVisibility(View.VISIBLE);
                    srcWv.loadUrl("https//www.netacad.com");
                    break;
                case 2:
                    srcbackBut.setVisibility(View.VISIBLE);
                    srcWv.setVisibility(View.VISIBLE);
                    srcWv.loadUrl("https://www.cybrary.it");
                    break;
                case 3:
                    srcbackBut.setVisibility(View.VISIBLE);
                    srcWv.setVisibility(View.VISIBLE);
                    srcWv.loadUrl("www.coursera.org/promo/guided-projects-free");
                    break;
                case 4:
                    srcbackBut.setVisibility(View.VISIBLE);
                    srcWv.setVisibility(View.VISIBLE);
                    srcWv.loadUrl("https://www.linkedin.com/learning/");
            }
        }
    });
    srcbackBut.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            srcLV.setVisibility(View.VISIBLE);
            srcTV.setVisibility(View.VISIBLE);
            srcbackBut.setVisibility(View.GONE);
            srcWv.setVisibility(View.GONE);
        }
    });
    }
}