package com.example.assignments.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.assignments.R;

public class Assignment3Q1Activity extends AppCompatActivity implements View.OnClickListener {

    TextView txtHelloName;
    EditText editTxtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3_q1);

        txtHelloName = findViewById(R.id.txtHelloName);
        editTxtName = findViewById(R.id.editTxtName);

        editTxtName.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = editTxtName.getText().toString();
        String greeting = "Hello " + name;
        Toast.makeText(this, greeting, Toast.LENGTH_SHORT).show();
        txtHelloName.setText(greeting);
    }

}