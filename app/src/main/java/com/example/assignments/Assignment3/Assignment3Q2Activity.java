package com.example.assignments.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.assignments.R;

public class Assignment3Q2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3_q2);

        Toast.makeText(this, "Dog", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Cat", Toast.LENGTH_SHORT).show();
    }
}