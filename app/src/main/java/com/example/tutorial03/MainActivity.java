package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etn1,etn2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn1 = findViewById(R.id.etnum1);
        etn2 = findViewById(R.id.etnum2);
        Button btn = findViewById(R.id.btnok);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast=Toast.makeText(getApplicationContext(),"ok was selected",Toast.LENGTH_LONG);

                toast.setGravity(Gravity.TOP/Gravity.CENTER,0,0);
                toast.show();

                String n1 = etn1.getText().toString();
                String n2 = etn2.getText().toString();

                Intent i = new Intent(MainActivity.this,MainActivity2.class);

                i.putExtra("EXTRA_1",n1);
                i.putExtra("EXTRA_2",n2);
                startActivity(i);


            }
        });

    }







}