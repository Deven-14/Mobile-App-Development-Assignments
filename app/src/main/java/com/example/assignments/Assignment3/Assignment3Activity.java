package com.example.assignments.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.assignments.R;

public class Assignment3Activity extends AppCompatActivity implements View.OnClickListener{

    private Button btnQ1, btnQ2, btnQ3, btnQ4, btnQ5, btnQ6, btnQ7, btnQ8;

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.btnQ1:
                intent = new Intent(this, Assignment3Q1Activity.class);
                break;
            case R.id.btnQ2:
                intent = new Intent(this, Assignment3Q2Activity.class);
                break;
            case R.id.btnQ3:
                intent = new Intent(this, Assignment3Q3Activity.class);
                break;
            case R.id.btnQ4:
                intent = new Intent(this, Assignment3Q4Activity.class);
                break;
            case R.id.btnQ5:
                intent = new Intent(this, Assignment3Q5Activity.class);
                break;
            case R.id.btnQ6:
                intent = new Intent(this, Assignment3Q6Activity.class);
                break;
            case R.id.btnQ7:
                intent = new Intent(this, Assignment3Q7Activity.class);
                break;
            case R.id.btnQ8:
                intent = new Intent(this, Assignment3Q8Activity.class);
                break;
            default:
                Toast.makeText(this, "No Function for this button", Toast.LENGTH_LONG).show();
                return; // if not found return
        }
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3);

        btnQ1 = findViewById(R.id.btnQ1);
        btnQ2 = findViewById(R.id.btnQ2);
        btnQ3 = findViewById(R.id.btnQ3);
        btnQ4 = findViewById(R.id.btnQ4);
        btnQ5 = findViewById(R.id.btnQ5);
        btnQ6 = findViewById(R.id.btnQ6);
        btnQ7 = findViewById(R.id.btnQ7);
        btnQ8 = findViewById(R.id.btnQ8);

        btnQ1.setOnClickListener(this);
        btnQ2.setOnClickListener(this);
        btnQ3.setOnClickListener(this);
        btnQ4.setOnClickListener(this);
        btnQ5.setOnClickListener(this);
        btnQ6.setOnClickListener(this);
        btnQ7.setOnClickListener(this);
        btnQ8.setOnClickListener(this);

    }
}