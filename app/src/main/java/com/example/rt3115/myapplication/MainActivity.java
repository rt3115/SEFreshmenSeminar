package com.example.rt3115.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnCLickListener(){
            @Override
            public void onClick(View v) {

                openactivity_sk_2();
            }
        });

    }


    public void openactivity_sk_2() {

         Intent intent = new Intent ( packageContext: this, Activity2.class);
        startActivity(intent);
    }
}
