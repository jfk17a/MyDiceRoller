package com.example.mydiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class StatsActivity extends AppCompatActivity {

    public static TextView rollNum1, rollNum2, rollNum3, rollNum4, rollNum5, rollNum6, rollNum7, rollNum8, rollNum9, rollNum10, rollNum11, rollNum12, rollNum13, rollNum14, rollNum15, rollNum16, rollNum17, rollNum18, rollNum19, rollNum20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        updateStats();
    }

    public void updateStats() {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        int defaultValue = getResources().getInteger(R.integer.default_value_key);
        rollNum1 = findViewById(R.id.roll1);
        rollNum2 = findViewById(R.id.roll2);
        rollNum3 = findViewById(R.id.roll3);
        rollNum4 = findViewById(R.id.roll4);
        rollNum5 = findViewById(R.id.roll5);
        rollNum6 = findViewById(R.id.roll6);
        rollNum7 = findViewById(R.id.roll7);
        rollNum8 = findViewById(R.id.roll8);
        rollNum9 = findViewById(R.id.roll9);
        rollNum10 = findViewById(R.id.roll10);
        rollNum11 = findViewById(R.id.roll11);
        rollNum12 = findViewById(R.id.roll12);
        rollNum13 = findViewById(R.id.roll13);
        rollNum14 = findViewById(R.id.roll14);
        rollNum15 = findViewById(R.id.roll15);
        rollNum16 = findViewById(R.id.roll16);
        rollNum17 = findViewById(R.id.roll17);
        rollNum18 = findViewById(R.id.roll18);
        rollNum19 = findViewById(R.id.roll19);
        rollNum20 = findViewById(R.id.roll20);
        rollNum1.setText("1 has been rolled " + sharedPref.getInt(getString(R.string.roll_1), defaultValue) + " times!");
        rollNum2.setText("2 has been rolled " + sharedPref.getInt(getString(R.string.roll_2), defaultValue) + " times!");
        rollNum3.setText("3 has been rolled " + sharedPref.getInt(getString(R.string.roll_3), defaultValue) + " times!");
        rollNum4.setText("4 has been rolled " + sharedPref.getInt(getString(R.string.roll_4), defaultValue) + " times!");
        rollNum5.setText("5 has been rolled " + sharedPref.getInt(getString(R.string.roll_5), defaultValue) + " times!");
        rollNum6.setText("6 has been rolled " + sharedPref.getInt(getString(R.string.roll_6), defaultValue) + " times!");
        rollNum7.setText("7 has been rolled " + sharedPref.getInt(getString(R.string.roll_7), defaultValue) + " times!");
        rollNum8.setText("8 has been rolled " + sharedPref.getInt(getString(R.string.roll_8), defaultValue) + " times!");
        rollNum9.setText("9 has been rolled " + sharedPref.getInt(getString(R.string.roll_9), defaultValue) + " times!");
        rollNum10.setText("10 has been rolled " + sharedPref.getInt(getString(R.string.roll_10), defaultValue)+ " times!");
        rollNum11.setText("11 has been rolled " + sharedPref.getInt(getString(R.string.roll_11), defaultValue)+ " times!");
        rollNum12.setText("12 has been rolled " + sharedPref.getInt(getString(R.string.roll_12), defaultValue)+ " times!");
        rollNum13.setText("13 has been rolled " + sharedPref.getInt(getString(R.string.roll_13), defaultValue)+ " times!");
        rollNum14.setText("14 has been rolled " + sharedPref.getInt(getString(R.string.roll_14), defaultValue)+ " times!");
        rollNum15.setText("15 has been rolled " + sharedPref.getInt(getString(R.string.roll_15), defaultValue)+ " times!");
        rollNum16.setText("16 has been rolled " + sharedPref.getInt(getString(R.string.roll_16), defaultValue)+ " times!");
        rollNum17.setText("17 has been rolled " + sharedPref.getInt(getString(R.string.roll_17), defaultValue)+ " times!");
        rollNum18.setText("18 has been rolled " + sharedPref.getInt(getString(R.string.roll_18), defaultValue)+ " times!");
        rollNum19.setText("19 has been rolled " + sharedPref.getInt(getString(R.string.roll_19), defaultValue)+ " times!");
        rollNum20.setText("20 has been rolled " + sharedPref.getInt(getString(R.string.roll_20), defaultValue)+ " times!");
    }

}
