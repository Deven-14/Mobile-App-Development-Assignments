package com.example.assignments.Notes.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteTextPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        String[] places = {
                "Pondicherry",
                "Param",
                "Ponama Bridge",
                "pala",
                "Pastatestates"
        };
        autoCompleteTextPlaces = findViewById(R.id.autoCompleteTextPlaces);

        ArrayAdapter<String> placesAdapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, places);
        autoCompleteTextPlaces.setThreshold(2); // at least 2 characters should be entered for the predictions
        autoCompleteTextPlaces.setAdapter(placesAdapter);
    }
}