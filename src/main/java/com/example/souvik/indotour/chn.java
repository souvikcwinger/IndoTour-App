package com.example.souvik.indotour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class chn extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chn);

        ViewPager mviewpager = (ViewPager)findViewById(R.id.viewPage2);
        ImageAdapter3 adapterView = new ImageAdapter3(this);
        mviewpager.setAdapter(adapterView);

        Button button1 = findViewById(R.id.button12);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.m.wikipedia.org/wiki/Chennai"));
                startActivity(intent);
            }
        });

    }
}
