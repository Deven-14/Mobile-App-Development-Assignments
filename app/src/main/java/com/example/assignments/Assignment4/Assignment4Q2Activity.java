package com.example.assignments.Assignment4;

import androidx.appcompat.app.AppCompatActivity;
import com.example.assignments.R;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class Assignment4Q2Activity extends AppCompatActivity implements View.OnClickListener{

    private Button selectTimeBtn, selectDateBtn;
    private EditText editTxtTime, editTxtDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment4_q2);

        editTxtDate = findViewById(R.id.editTxtDate);
        editTxtTime = findViewById(R.id.editTxtTime);
        selectDateBtn = findViewById(R.id.selectDateBtn);
        selectTimeBtn = findViewById(R.id.selectTimeBtn);

        selectDateBtn.setOnClickListener(this);
        selectTimeBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.selectDateBtn:
                selectDate();
                break;
            case R.id.selectTimeBtn:
                selectTime();
                break;
            default:
                Toast.makeText(this, "No function for this button", Toast.LENGTH_SHORT).show();
                return;
        }
    }

    private void selectDate() {

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                editTxtDate.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
            }
        }, year, month, day);
        datePickerDialog.show();
    }

    private void selectTime() {

        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                editTxtTime.setText(hourOfDay + ":" + minute);
            }
        }, hour, min, true);
        timePickerDialog.show();

    }
}