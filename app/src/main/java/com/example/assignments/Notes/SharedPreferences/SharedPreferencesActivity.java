package com.example.assignments.Notes.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SharedPreferencesActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button applyText;
    Switch switch2;
    Button saveData;
    private final static String SHARED_PREFS = "sharedPrefs";
    private final static String TEXT = "text";
    private final static String SWITCH2 = "switch2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        applyText = findViewById(R.id.applyTextBtn);
        switch2 = findViewById(R.id.switch2);
        saveData = findViewById(R.id.saveDataBtn);

        applyText.setOnClickListener(v -> {
            textView.setText(editText.getText().toString());
        });
        saveData.setOnClickListener(v -> {
            save();
        });

        load();
    }

    private void save() {
        SharedPreferences sp = getSharedPreferences(SharedPreferencesActivity.SHARED_PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(TEXT, textView.getText().toString());
        editor.putBoolean(SWITCH2, switch2.isChecked());
        editor.apply();
        Toast.makeText(this, "data saved", Toast.LENGTH_SHORT).show();
    }

    private void load() {
        SharedPreferences sp = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        textView.setText(sp.getString(TEXT, ""));
        switch2.setChecked(sp.getBoolean(SWITCH2, false));
    }
}