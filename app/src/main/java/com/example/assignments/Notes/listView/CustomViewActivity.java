package com.example.assignments.Notes.listView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CustomViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] countryNames = {"India", "China", "USA"};
    private int[] flags = {
            R.drawable.ic_baseline_check_box_24,
            R.drawable.ic_baseline_check_box_outline_blank_24,
            R.drawable.ic_baseline_radio_button_checked_24,
    };
    private String[] currencies = {
            "Rupees",
            "Abc",
            "Def",
    };
    private ListView countriesCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);

        CustomAdapter countriesAdapter = new CustomAdapter(this, countryNames, flags, currencies);
        countriesCustomView = findViewById(R.id.countriesCustomView);
        countriesCustomView.setAdapter(countriesAdapter);
        countriesCustomView.setOnItemClickListener(this); // *****
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, ((ArrayList<String>)parent.getItemAtPosition(position)).get(0), Toast.LENGTH_SHORT).show();
    }
}