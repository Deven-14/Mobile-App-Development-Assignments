package com.example.assignments.Assignment4;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Assignment4Q3Activity extends AppCompatActivity implements View.OnClickListener {

    private Button showSelectedBtn;
    private RadioGroup rgGender;
    private RadioButton rbMale, rbFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment4_q3);

        showSelectedBtn = findViewById(R.id.showSelectedBtn);
        rgGender = findViewById(R.id.rgGender);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);

        showSelectedBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() != R.id.showSelectedBtn) {
            return;
        }

        // make sure by default one is selected

        // here the findViewById() should be converted to radioButton or else we won't .getText() function
        String toastMsg = ((RadioButton)findViewById(rgGender.getCheckedRadioButtonId())).getText().toString();
        Toast.makeText(this, toastMsg, Toast.LENGTH_SHORT).show();
    }
}