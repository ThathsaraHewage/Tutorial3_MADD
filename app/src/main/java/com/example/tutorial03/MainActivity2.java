package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent i =getIntent();
        final String n1 = i.getStringExtra("EXTRA_1");
        final String n2 = i.getStringExtra("EXTRA_2");

        Button btn=findViewById(R.id.add);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Integer i1=Integer.parseInt(n1);
                    Integer i2=Integer.parseInt(n2);

                    String result="";

                    result = n1 + " + " + n2 + " = " + (n1+n2);

                    TextView tv =findViewById(R.id.tvresult);

                    tv.setText(result);
                }
        });


    }



}