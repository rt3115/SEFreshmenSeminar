package com.example.rt3115.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class activity_sk_2 extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sk_2);

        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnCLickListener() {
            @Override
            public void onClick (View v) {

                openMainActivity();
            }
        });

    }


    public void openMainActivity() {

        Intent intent = new Intent (packageContext: this, MainActivity.class);
        startActivity(intent);
    }
}
