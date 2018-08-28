package com.example.souvik.indotour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NextActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next2);
        Button b11 = (Button) findViewById(R.id.button6);


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NextActivity.class);
                startActivity(intent);
            }
        });

        Button b22 = (Button) findViewById(R.id.button7);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton ib = (ImageButton)findViewById(R.id.imageButton4);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),delhi.class);
                startActivity(i);
            }
        });
        ImageButton ib1 = (ImageButton)findViewById(R.id.imageButton5);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),goa.class);
                startActivity(i);
            }
        });
        ImageButton ib2 = (ImageButton)findViewById(R.id.imageButton6);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),port.class);
                startActivity(i);
            }
        });
    }
}
