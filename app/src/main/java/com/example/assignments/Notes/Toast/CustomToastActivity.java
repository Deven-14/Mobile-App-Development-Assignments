package com.example.assignments.Notes.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class CustomToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);

        LayoutInflater inflater = getLayoutInflater(); // or LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.custom_toast_item, (ViewGroup) findViewById(R.id.customToastLayout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(view);
        toast.show();
    }
}