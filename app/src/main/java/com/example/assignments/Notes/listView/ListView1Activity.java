package com.example.assignments.Notes.listView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListView1Activity extends AppCompatActivity {

    private ListView simpleListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view1);

        simpleListView = findViewById(R.id.simpleListView);
        String[] countries = {"India", "Australia", "China", "America"};

//        ArrayAdapter<String> countriesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);
        ArrayAdapter<String> countriesAdapter = new ArrayAdapter<>(this, R.layout.list_view1_item, R.id.txtCountryName, countries);
        simpleListView.setAdapter(countriesAdapter);
    }
}