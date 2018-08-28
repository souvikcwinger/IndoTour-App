package com.example.souvik.indotour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class goa extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);

        ViewPager mviewpager = (ViewPager)findViewById(R.id.viewPage4);
        ImageAdapter5 adapterView = new ImageAdapter5(this);
        mviewpager.setAdapter(adapterView);

        Button button1 = findViewById(R.id.button14);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.m.wikipedia.org/wiki/Goa"));
                startActivity(intent);
            }
        });

    }
}
