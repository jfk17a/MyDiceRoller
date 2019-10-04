package com.example.mydiceroller;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

    SharedPreferences sharedPref;
    private FloatingActionButton fab;
    private TextView dieRoll;
    private TextView rollText;
    MediaPlayer rollSound;
    MediaPlayer sadSound;
    MediaPlayer goodSound;
    private Random roll = new Random();
    private int randoRoll;
    private Integer roll_1 = 0, roll_2 = 0, roll_3 = 0, roll_4 = 0, roll_5 = 0, roll_6 = 0, roll_7 = 0, roll_8 = 0, roll_9 = 0, roll_10 = 0, roll_11 = 0, roll_12 = 0, roll_13 = 0, roll_14 = 0, roll_15 = 0, roll_16 = 0, roll_17 = 0, roll_18 = 0, roll_19 = 0, roll_20 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollSound = MediaPlayer.create(this,R.raw.roll_sound);
        sadSound = MediaPlayer.create(this, R.raw.sad_roll);
        goodSound = MediaPlayer.create(this, R.raw.good_roll);

        dieRoll = findViewById(R.id.direRollf);
        rollText = findViewById(R.id.critFail);
        fab = findViewById(R.id.fab_button);

        dieRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollSound.seekTo(0);
                rollSound.start();
                rollDie();
            }
        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StatsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void rollDie(){
        randoRoll = roll.nextInt(20) + 1;
        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        switch(randoRoll) {
            case 1:
                dieRoll.setText("1");
                rollFail();
                roll_1++;
                editor.putInt(getString(R.string.roll_1), roll_1);
                editor.apply();
                break;
            case 2:
                dieRoll.setText("2");
                rollMeh();
                roll_2++;
                editor.putInt(getString(R.string.roll_2), roll_2);
                editor.apply();
                break;
            case 3:
                dieRoll.setText("3");
                rollMeh();
                roll_3++;
                editor.putInt(getString(R.string.roll_3), roll_3);
                editor.apply();
                break;
            case 4:
                dieRoll.setText("4");
                rollMeh();
                roll_4++;
                editor.putInt(getString(R.string.roll_4), roll_4);
                editor.apply();
                break;
            case 5:
                dieRoll.setText("5");
                rollMeh();
                roll_5++;
                editor.putInt(getString(R.string.roll_5), roll_5);
                editor.apply();
                break;
            case 6:
                dieRoll.setText("6");
                rollMeh();
                roll_6++;
                editor.putInt(getString(R.string.roll_6), roll_6);
                editor.apply();
                break;
            case 7:
                dieRoll.setText("7");
                rollMeh();
                roll_7++;
                editor.putInt(getString(R.string.roll_7), roll_7);
                editor.apply();
                break;
            case 8:
                dieRoll.setText("8");
                rollMeh();
                roll_8++;
                editor.putInt(getString(R.string.roll_8), roll_8);
                editor.apply();
                break;
            case 9:
                dieRoll.setText("9");
                rollMeh();
                roll_9++;
                editor.putInt(getString(R.string.roll_9), roll_9);
                editor.apply();
                break;
            case 10:
                dieRoll.setText("10");
                rollMeh();
                roll_10++;
                editor.putInt(getString(R.string.roll_10), roll_10);
                editor.apply();
                break;
            case 11:
                dieRoll.setText("11");
                rollMeh();
                roll_11++;
                editor.putInt(getString(R.string.roll_11), roll_11);
                editor.apply();
                break;
            case 12:
                dieRoll.setText("12");
                rollMeh();
                roll_12++;
                editor.putInt(getString(R.string.roll_12), roll_12);
                editor.apply();
                break;
            case 13:
                dieRoll.setText("13");
                rollMeh();
                roll_13++;
                editor.putInt(getString(R.string.roll_13), roll_13);
                editor.apply();
                break;
            case 14:
                dieRoll.setText("14");
                rollMeh();
                roll_14++;
                editor.putInt(getString(R.string.roll_14), roll_14);
                editor.apply();
                break;
            case 15:
                dieRoll.setText("15");
                rollMeh();
                roll_15++;
                editor.putInt(getString(R.string.roll_15), roll_15);
                editor.apply();
                break;
            case 16:
                dieRoll.setText("16");
                rollMeh();
                roll_16++;
                editor.putInt(getString(R.string.roll_16), roll_16);
                editor.apply();
                break;
            case 17:
                dieRoll.setText("17");
                rollMeh();
                roll_17++;
                editor.putInt(getString(R.string.roll_17), roll_17);
                editor.apply();
                break;
            case 18:
                dieRoll.setText("18");
                rollMeh();
                roll_18++;
                editor.putInt(getString(R.string.roll_18), roll_18);
                editor.apply();
                break;
            case 19:
                dieRoll.setText("19");
                rollMeh();
                roll_19++;
                editor.putInt(getString(R.string.roll_19), roll_19);
                editor.apply();
                break;
            case 20:
                dieRoll.setText("20");
                rollCrit();
                roll_20++;
                editor.putInt(getString(R.string.roll_20), roll_20);
                editor.apply();
                break;
        }
    }

    private void rollCrit() {
        rollText.setText("Critical Hit!");
        rollText.setTextColor(getResources().getColor(R.color.green));
        goodSound.seekTo(0);
        goodSound.start();
    }

    private void rollMeh(){
        rollText.setText("Meh... It's Okay");
        rollText.setTextColor(getResources().getColor(R.color.blue));
    }

    private void rollFail(){
        rollText.setText("Critical Miss!");
        rollText.setTextColor(getResources().getColor(R.color.red));
        sadSound.seekTo(0);
        sadSound.start();
    }
}
