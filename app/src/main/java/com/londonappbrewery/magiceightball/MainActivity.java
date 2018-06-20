package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linking Button and Image from XML to Java File
        final Button myButton = findViewById(R.id.askButton);
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        // Creating Image array
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magic-8-ball","\n\nThe Button is Pressed");

                // Generating a Random Number
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                Log.d("magic-8-ball", "The Random Number is: " + number);

                // Updating the Image
                ballDisplay.setImageResource(ballArray[number]);

            }
        });
    }
}
