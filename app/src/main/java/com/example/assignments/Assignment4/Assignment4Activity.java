package com.example.assignments.Assignment4;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Assignment4Activity extends AppCompatActivity implements View.OnClickListener{

    private Button question1, question2, question3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment4);

        question1 = findViewById(R.id.question1);
        question2 = findViewById(R.id.question2);
        question3 = findViewById(R.id.question3);

        question1.setOnClickListener(this);
        question2.setOnClickListener(this);
        question3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.question1:
                intent = new Intent(this, Assignment4Q1Activity.class);
                break;
            case R.id.question2:
                intent = new Intent(this, Assignment4Q2Activity.class);
                break;
            case R.id.question3:
                intent = new Intent(this, Assignment4Q3Activity.class);
                break;
            default:
                Toast.makeText(this, "No function for Selected Button", Toast.LENGTH_SHORT).show();
                return;
        }
        startActivity(intent);
    }
}