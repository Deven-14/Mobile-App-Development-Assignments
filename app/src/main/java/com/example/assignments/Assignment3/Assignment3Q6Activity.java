package com.example.assignments.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.example.assignments.R;

public class Assignment3Q6Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn) {
            String toast = "Switch: " + ((switch1.isChecked()) ? switch1.getTextOn().toString() : switch1.getTextOff().toString());
            Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(buttonView.getId() == R.id.switch1) {
            String toast = "Switch turned " + ((isChecked) ? switch1.getTextOn().toString() : switch1.getTextOff().toString());
            Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        }
    }

    private Switch switch1;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3_q6);

        switch1 = findViewById(R.id.switch1);
        btn = findViewById(R.id.btn);

        switch1.setOnCheckedChangeListener(this);
        btn.setOnClickListener(this);
    }
}