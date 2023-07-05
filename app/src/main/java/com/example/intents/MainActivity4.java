package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       //textView=findViewById(R.id.textView);
       // Intent intentThatStartedThis=getIntent();//to get access of result
        // String name =intentThatStartedThis.getStringExtra("result");
        // textView.setText(name);

    }
}