package com.example.suraj.snakes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] myDices = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six

    };


public void Roll(View view){

    Random ran = new Random();
    int randomNumber = ran.nextInt(6);

    ImageView dice = findViewById(R.id.dice);

    dice.setImageResource(myDices[randomNumber]);

    dice.animate().rotation(360).start();

    


}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
