package com.example.assignments.Assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.assignments.R;

public class Assignment3Q7Activity extends AppCompatActivity implements View.OnClickListener{

    private ConstraintLayout layout;
    private Button blueBtn, pinkBtn, teal700Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3_q7);

        layout = findViewById(R.id.layout_assignment3_q7);
        teal700Btn = findViewById(R.id.teal700Btn);
        blueBtn = findViewById(R.id.blueBtn);
        pinkBtn = findViewById(R.id.pinkBtn);

        teal700Btn.setOnClickListener(this);
        blueBtn.setOnClickListener(this);
        pinkBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.teal700Btn:
                layout.setBackgroundColor(getResources().getColor(R.color.teal_700));
                break;
            case R.id.blueBtn:
                layout.setBackgroundColor(getResources().getColor(R.color.blue));
                break;
            case R.id.pinkBtn:
                layout.setBackgroundColor(getResources().getColor(R.color.pink));
                break;
            default:
                break;
        }
    }
}