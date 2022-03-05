package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.assignments.Assignment2.Assignment2Activity;
import com.example.assignments.Assignment3.Assignment3Activity;
import com.example.assignments.Assignment4.Assignment4Activity;
import com.example.assignments.Notes.AndroidActivityLifeCycleActivity;
import com.example.assignments.Notes.Fragment.FragmentLifeCycleActivity;
import com.example.assignments.Notes.Fragment.FragmentQ1Activity;
import com.example.assignments.Notes.Fragment.FragmentQ2Activity;
import com.example.assignments.Notes.Intent.ExplicitIntentActivity;
import com.example.assignments.Notes.Intent.ImplicitIntentActivity;
import com.example.assignments.Notes.Menu.ContextMenuActivity;
import com.example.assignments.Notes.Menu.OptionsMenuActivity;
import com.example.assignments.Notes.Menu.PopupMenuActivity;
import com.example.assignments.Notes.NotesMainActivity;
import com.example.assignments.Notes.SharedPreferences.SharedPreferencesActivity;
import com.example.assignments.Notes.Spinner.SpinnerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button assignment1, assignment2, assignment3, assignment4, notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assignment1 = findViewById(R.id.assignment1);
        assignment2 = findViewById(R.id.assignment2);
        assignment3 = findViewById(R.id.assignment3);
        assignment4 = findViewById(R.id.assignment4);
        notes = findViewById(R.id.notes);

        assignment1.setOnClickListener(this);
        assignment2.setOnClickListener(this);
        assignment3.setOnClickListener(this);
        assignment4.setOnClickListener(this);
        notes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.assignment1:
//                Toast.makeText(this, "Assignment1", Toast.LENGTH_LONG).show();
                intent = new Intent(this, Assignment1Activity.class);
                break;
            case R.id.assignment2:
                intent = new Intent(this, Assignment2Activity.class);
                break;
            case R.id.assignment3:
                intent = new Intent(this, Assignment3Activity.class);
                break;
            case R.id.assignment4:
                intent = new Intent(this, Assignment4Activity.class);
                break;
            case R.id.notes:
                intent = new Intent(this, SpinnerActivity.class);
                break;
            default:
                Toast.makeText(this, "Button onClick Missing", Toast.LENGTH_SHORT).show();
//                break;
                return;
        }
        startActivity(intent);
    }
}