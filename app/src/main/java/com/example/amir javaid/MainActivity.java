package com.example.faisalapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View v = findViewById(R.id.Sign_Up);
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.Sign_Up) {
            Intent intent = new Intent(this, sign_in.class);
            this.startActivity(intent);
        }
        if (v.getId() == R.id.sign_in) {
            Intent intent = new Intent(this, mainfront.class);
            this.startActivity(intent);
        }


    }
}

