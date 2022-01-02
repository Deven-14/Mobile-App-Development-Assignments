package com.example.assignments.Assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.assignments.R;

public class Assignment2Activity extends AppCompatActivity implements View.OnClickListener{

    Button btnQ1, btnQ2, btnQ3;

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnQ1:
                Intent intent1 = new Intent(this, Assignment2Q1Activity.class);
                startActivity(intent1);
                break;
            case R.id.btnQ2:
                Intent intent2 = new Intent(this, Assignment2Q2Activity.class);
                startActivity(intent2);
                break;
            case R.id.btnQ3:
                Intent intent3 = new Intent(this, Assignment2Q3Activity.class);
                startActivity(intent3);
                break;
            default:
                Toast.makeText(this, "No Function for this button", Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment2);

        btnQ1 = findViewById(R.id.btnQ1);
        btnQ2 = findViewById(R.id.btnQ2);
        btnQ3 = findViewById(R.id.btnQ3);

        btnQ1.setOnClickListener(this);
        btnQ2.setOnClickListener(this);
        btnQ3.setOnClickListener(this);
    }
}