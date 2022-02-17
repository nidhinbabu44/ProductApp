package com.example.productappmzc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchPageActivity extends AppCompatActivity {
EditText e1,e2,e3;
AppCompatButton b1,b2;
String getpcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);
        e1=(EditText) findViewById(R.id.pdcode);
        e2=(EditText) findViewById(R.id.pdname);
        e3=(EditText) findViewById(R.id.price);
        b1=(AppCompatButton) findViewById(R.id.search);
        b2=(AppCompatButton) findViewById(R.id.menu);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
getpcode=e1.getText().toString();
                Toast.makeText(getApplicationContext(),"success", Toast.LENGTH_SHORT).show();
            }
        });



    }
}