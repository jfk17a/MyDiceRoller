package com.example.mydiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView dieRoll;
    private TextView rollText;
    MediaPlayer rollSound;
    MediaPlayer sadSound;
    MediaPlayer goodSound;
    private Random roll = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollSound = MediaPlayer.create(this,R.raw.roll_sound);

        dieRoll = findViewById(R.id.direRollf);
        rollText = findViewById(R.id.critFail);
        dieRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollSound.seekTo(0);
                rollSound.start();
                rollDie();
            }
        });
    }

    private void rollDie(){
        int randoRoll = roll.nextInt(20) + 1;

        switch(randoRoll) {
            case 1:
                dieRoll.setText("1");
                rollFail();
                break;
            case 2:
                dieRoll.setText("2");
                rollMeh();
                break;
            case 3:
                dieRoll.setText("3");
                rollMeh();
                break;
            case 4:
                dieRoll.setText("4");
                rollMeh();
                break;
            case 5:
                dieRoll.setText("5");
                rollMeh();
                break;
            case 6:
                dieRoll.setText("6");
                rollMeh();
                break;
            case 7:
                dieRoll.setText("7");
                rollMeh();
                break;
            case 8:
                dieRoll.setText("8");
                rollMeh();
                break;
            case 9:
                dieRoll.setText("9");
                rollMeh();
                break;
            case 10:
                dieRoll.setText("10");
                rollMeh();
                break;
            case 11:
                dieRoll.setText("11");
                rollMeh();
                break;
            case 12:
                dieRoll.setText("12");
                rollMeh();
                break;
            case 13:
                dieRoll.setText("13");
                rollMeh();
                break;
            case 14:
                dieRoll.setText("14");
                rollMeh();
                break;
            case 15:
                dieRoll.setText("15");
                rollMeh();
                break;
            case 16:
                dieRoll.setText("16");
                rollMeh();
                break;
            case 17:
                dieRoll.setText("17");
                rollMeh();
                break;
            case 18:
                dieRoll.setText("18");
                rollMeh();
                break;
            case 19:
                dieRoll.setText("19");
                rollMeh();
                break;
            case 20:
                dieRoll.setText("20");
                rollCrit();
                break;
        }
    }

    private void rollCrit() {
        goodSound = MediaPlayer.create(this, R.raw.good_roll);
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
        sadSound = MediaPlayer.create(this, R.raw.sad_roll);
        rollText.setText("Critical Miss!");
        rollText.setTextColor(getResources().getColor(R.color.red));
        sadSound.seekTo(0);
        sadSound.start();
    }
}
