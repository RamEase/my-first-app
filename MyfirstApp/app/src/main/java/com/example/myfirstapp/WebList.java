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

public class WebList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_list);
        Toast.makeText(this, "Couch potato", Toast.LENGTH_LONG).show();
        final ListView srcLV= (ListView) findViewById(R.id.LV);
        final Button srcbackBut = (Button) findViewById(R.id.backBut);
        final WebView srcWv = (WebView) findViewById(R.id.webView);
        final TextView srcTV = (TextView) findViewById(R.id.TV);
        final ArrayAdapter<CharSequence> AdapWeb = ArrayAdapter.createFromResource(this, R.array.Shows, android.R.layout.simple_list_item_1);
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
                        srcWv.setWebViewClient(new WebViewClient());
                        srcWv.loadUrl("https://www.wikipedia.org/wiki/Euphoria_(American_TV_series)");
                        break;
                    case 1:
                        srcbackBut.setVisibility(View.VISIBLE);
                        srcWv.setVisibility(View.VISIBLE);
                        srcWv.loadUrl("https://www.wikipedia.org/wiki/Chernobyl_(miniseries)");
                        break;
                    case 2:
                        srcbackBut.setVisibility(View.VISIBLE);
                        srcWv.setVisibility(View.VISIBLE);
                        srcWv.loadUrl("https://www.wikipedia.org/wiki/The_Purge");
                        break;
                    case 3:
                        srcbackBut.setVisibility(View.VISIBLE);
                        srcWv.setVisibility(View.VISIBLE);
                        srcWv.loadUrl("https://www.wikipedia.org/wiki/Breaking_Bad");
                        break;
                    case 4:
                        srcbackBut.setVisibility(View.VISIBLE);
                        srcWv.setVisibility(View.VISIBLE);
                        srcWv.loadUrl("https://www.wikipedia.org/wiki/F_is_for_Family");
                        break;
                    case 5:
                        srcbackBut.setVisibility(View.VISIBLE);
                        srcWv.setVisibility(View.VISIBLE);
                        srcWv.loadUrl("https://www.wikipedia.org/wiki/Final_Space");
                        break;
                    case 6:
                        srcbackBut.setVisibility(View.VISIBLE);
                        srcWv.setVisibility(View.VISIBLE);
                        srcWv.loadUrl("https://www.wikipedia.org/wiki/Disenchantment_(TV_series)");
                        break;

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