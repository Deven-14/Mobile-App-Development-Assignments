package com.example.assignments.Notes.Intent;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImplicitIntentActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        Button button = findViewById(R.id.bmsceLinkBtn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.bmsceLinkBtn) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.bmsce.ac.in/"));
            startActivity(intent);
        }
    }
}