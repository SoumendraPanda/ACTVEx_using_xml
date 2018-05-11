package com.example.user.actvex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class citizenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citizen);
        TextView tv=findViewById(R.id.tv);
        tv.setText("You are a citizen of "+getIntent().getStringExtra("citizen"));
    }
}
