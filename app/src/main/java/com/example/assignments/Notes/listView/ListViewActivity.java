package com.example.assignments.Notes.listView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity implements View.OnClickListener {

    private Button question1, question2, customViewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        question1 = findViewById(R.id.question1);
        question2 = findViewById(R.id.question2);
        customViewBtn = findViewById(R.id.customViewBtn);

        question1.setOnClickListener(this);
        question2.setOnClickListener(this);
        customViewBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.question1:
                intent = new Intent(this, ListView1Activity.class);
                break;
            case R.id.question2:
                intent = new Intent(this, ListView2Activity.class);
                break;
            case R.id.customViewBtn:
                intent = new Intent(this, CustomViewActivity.class);
                break;
            default:
                Toast.makeText(this, "No function for this button", Toast.LENGTH_SHORT).show();
                return;
        }
        startActivity(intent);
    }
}