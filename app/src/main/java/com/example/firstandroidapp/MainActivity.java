package com.example.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button dec,inc,reset;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dec=(Button) findViewById(R.id.button2);
        reset=(Button) findViewById(R.id.button);
        inc=(Button) findViewById(R.id.button3);
        textView =(TextView) findViewById(R.id.editTextNumber);
//        textView.setText("0");
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=textView.getText().toString();
                int d=Integer.parseInt(s);
                d=d-1;
                textView.setText(Integer.toString(d));
            }
        });
        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i= Integer.parseInt(textView.getText().toString());
                i++;
                textView.setText(Integer.toString(i));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=Integer.parseInt(textView.getText().toString());
                i=0;
                textView.setText(Integer.toString(i));
            }
        });
    }
}