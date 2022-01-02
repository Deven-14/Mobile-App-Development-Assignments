package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Assignment1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment1);

        Toast.makeText(this, "Dog", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Cat", Toast.LENGTH_SHORT).show();
    }
}