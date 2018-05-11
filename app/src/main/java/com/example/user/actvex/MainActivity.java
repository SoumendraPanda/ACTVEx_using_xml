package com.example.user.actvex;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView actv=findViewById(R.id.actv);
        String[]values=getResources().getStringArray(R.array.countries);
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_single_choice, values);
        actv.setAdapter(adapter);
        actv.setThreshold(1);

    }

    public void citizen(View view) {
        Intent i=new Intent(this,citizenActivity.class);
        EditText actv=findViewById(R.id.actv);
        i.putExtra("citizen",actv.getText().toString());
        startActivity(i);
    }
}
