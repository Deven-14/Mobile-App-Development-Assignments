package com.example.assignments.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.assignments.R;

public class Assignment3Q5Activity extends AppCompatActivity implements View.OnClickListener{

    private Button submitBtn;
    private ToggleButton toggleBtn1, toggleBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3_q5);

        submitBtn = findViewById(R.id.submitBtn);
        toggleBtn1 = findViewById(R.id.toggleBtn1);
        toggleBtn2 = findViewById(R.id.toggleBtn2);

        submitBtn.setOnClickListener(this); // THERE IS ON CLICK FOR TOGGLE BUTTON ALSO
        toggleBtn1.setOnClickListener(this);
        toggleBtn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String toast;
        switch(v.getId())
        {
            case R.id.submitBtn:
                toast = "ToggleButton1: " + toggleBtn1.getText().toString() + "\nToggleButton2: " + toggleBtn2.getText().toString();
                break;
            case R.id.toggleBtn1:
                toast = "ToggleButton1 turned " + toggleBtn1.getText().toString();
                break;
            case R.id.toggleBtn2:
                toast = "ToggleButton2 turned " + toggleBtn2.getText().toString();
                break;
            default:
                return;
        }
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }
}