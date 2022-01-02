package com.example.assignments.Notes;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignments.Notes.AutoCompleteTextView.AutoCompleteTextViewActivity;
import com.example.assignments.Notes.Spinner.SpinnerActivity;
import com.example.assignments.Notes.Toast.CustomToastActivity;
import com.example.assignments.Notes.listView.ListViewActivity;
import com.example.assignments.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NotesMainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button listViewBtn, autoCompleteTextViewBtn, spinnerBtn, toastBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_main);

        listViewBtn = findViewById(R.id.listViewBtn);
        autoCompleteTextViewBtn = findViewById(R.id.autoCompleteTextViewBtn);
        spinnerBtn = findViewById(R.id.spinnerBtn);
        toastBtn = findViewById(R.id.toastBtn);

        listViewBtn.setOnClickListener(this);
        autoCompleteTextViewBtn.setOnClickListener(this);
        spinnerBtn.setOnClickListener(this);
        toastBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.listViewBtn:
                intent = new Intent(this, ListViewActivity.class);
                break;
            case R.id.autoCompleteTextViewBtn:
                intent = new Intent(this, AutoCompleteTextViewActivity.class);
                break;
            case R.id.spinnerBtn:
                intent = new Intent(this, SpinnerActivity.class);
                break;
            case R.id.toastBtn:
                intent = new Intent(this, CustomToastActivity.class);
                break;
            default:
                Toast.makeText(this, "No function for this button", Toast.LENGTH_LONG).show();
                return;
        }
        startActivity(intent);
    }
}