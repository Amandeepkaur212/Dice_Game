package com.example.dice_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView Computerdice,Playerdice;
    Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Computerdice = findViewById(R.id.computer_dice);
        Playerdice = findViewById(R.id.Player_dice);
        button = findViewById(R.id.button_left);
        button2 = findViewById(R.id.button_right);
        int [] diceArray ={R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rand = new Random();

                int randNumtop = rand.nextInt(6);
                int randNumdown = rand.nextInt(6);


                Computerdice.setImageResource(diceArray[randNumtop]);
                Playerdice.setImageResource(diceArray[randNumdown]);
                if (randNumtop<randNumdown) {
                    TextView textView= findViewById(R.id.textView);
                    textView.setText("  USER WIN !");
                }
                else if(randNumtop>randNumdown){
                    TextView textView= findViewById(R.id.textView);
                    textView.setText("COMPUTER WIN !");
                }
                else {
                    TextView textView= findViewById(R.id.textView);
                    textView.setText("  IT'S A TIE !!");
                }

            }
        });


      button2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              Random rand = new Random();

              int randNumtop = rand.nextInt(6);
              int randNumdown= rand.nextInt(6);


              Computerdice.setImageResource(diceArray[randNumtop]);
              Playerdice.setImageResource(diceArray[randNumdown]);
              if (randNumtop>randNumdown) {
                  TextView textView= findViewById(R.id.textView);
                  textView.setText("  USER WIN !");
              }
              else if(randNumtop<randNumdown){
                  TextView textView= findViewById(R.id.textView);
                  textView.setText("COMPUTER WIN !");
              }
              else {
                  TextView textView= findViewById(R.id.textView);
                  textView.setText("  IT'S TIE !!");
              }

          }
      });


    }
}