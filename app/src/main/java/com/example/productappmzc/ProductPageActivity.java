package com.example.productappmzc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ProductPageActivity extends AppCompatActivity {
EditText e1,e2,e3;
AppCompatButton b1;
String getpcode,getpname,getprice;
DataBaseHelper dBhelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_page);
        e1=(EditText) findViewById(R.id.pdcode);
        e2=(EditText) findViewById(R.id.pdname);
        e3=(EditText) findViewById(R.id.price);
        b1=(AppCompatButton) findViewById(R.id.menu);
        dBhelper=new DataBaseHelper(this);
        dBhelper.getWritableDatabase();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               getpcode=e1.getText().toString();
               getpname=e2.getText().toString();
               getprice=e3.getText().toString();

                boolean result= dBhelper.insertData(getpcode,getpname,getprice);
                if (result==true)

                {
                    e1.setText("");
                    e2.setText("");
                    e3.setText("");

                    Toast.makeText(getApplicationContext(), "successfully inserted", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "error occured", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}