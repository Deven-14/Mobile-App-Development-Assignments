package com.example.assignments.Assignment4;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Assignment4Q1Activity extends AppCompatActivity implements View.OnClickListener{

    private Button submitBtn;
    private RadioGroup rgRate;
    private RadioButton rbExcellent, rbGood, rbPoor, rbOkay;
    private CheckBox cbSuggestion1, cbSuggestion2, cbSuggestion3, cbSuggestion4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment4_q1);

        submitBtn = findViewById(R.id.assignment4Q1SubmitBtn);

        rgRate = findViewById(R.id.rateLessonRadioGrp);
        rbExcellent = findViewById(R.id.excellentRadioBtn);
        rbGood = findViewById(R.id.goodRadioBtn);
        rbPoor = findViewById(R.id.poorRadioBtn);
        rbOkay = findViewById(R.id.okayRadioBtn);

        cbSuggestion1 = findViewById(R.id.suggestion1CheckBox);
        cbSuggestion2 = findViewById(R.id.suggestion2CheckBox);
        cbSuggestion3 = findViewById(R.id.suggestion3CheckBox);
        cbSuggestion4 = findViewById(R.id.suggestion4CheckBox);

        submitBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() != R.id.assignment4Q1SubmitBtn) {
            return ;
        }

        // make sure by default one is selected i.e either excellent, good, bad or okay

        // here the findViewById() should be converted to radioButton or else we won't .getText() function

        StringBuilder toast = new StringBuilder();
        toast.append("Selected Radio Button is: " + ((RadioButton)findViewById(rgRate.getCheckedRadioButtonId())).getText() + "\n");
        toast.append("CheckBox Choices: \n");
        toast.append(cbSuggestion1.getText() + ": " + ((cbSuggestion1.isChecked()) ? "YES" : "NO") + "\n");
        toast.append(cbSuggestion2.getText() + ": " + ((cbSuggestion2.isChecked()) ? "YES" : "NO") + "\n");
        toast.append(cbSuggestion3.getText() + ": " + ((cbSuggestion3.isChecked()) ? "YES" : "NO") + "\n");
        toast.append(cbSuggestion4.getText() + ": " + ((cbSuggestion4.isChecked()) ? "YES" : "NO") + "\n");

        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }
}