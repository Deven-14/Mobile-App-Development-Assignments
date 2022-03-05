package com.example.assignments.Notes.Intent;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExplicitIntentActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        Button button = findViewById(R.id.implicitActivityBtn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.implicitActivityBtn) {
            Intent intent = new Intent(getApplicationContext(), ImplicitIntentActivity.class);
            startActivity(intent);
        }
    }
}