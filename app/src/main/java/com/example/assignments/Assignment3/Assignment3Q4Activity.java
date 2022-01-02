package com.example.assignments.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.assignments.R;

public class Assignment3Q4Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton imgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3_q4);

        imgBtn = findViewById(R.id.imgBtn);
        imgBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Dog", Toast.LENGTH_LONG).show();
    }
}