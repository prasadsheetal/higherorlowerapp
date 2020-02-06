package com.example.higherorlower;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void generateRandomNumber() {

        Random run = new Random();

        randomNumber = run.nextInt(20) + 1;

    }

    public void guess(View view) {

        EditText UserNumber = findViewById(R.id.number);

        int guessValue = Integer.parseInt(UserNumber.getText().toString());

        String message;

        if (guessValue > randomNumber) {

            message = "Go Lower!";

        } else if (guessValue < randomNumber) {

            message = "Go Higher!";

        } else {

            message = "That's right !! Wanna try again ?";

            generateRandomNumber();

        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Log.i("Entered Value", UserNumber.getText().toString());

        Log.i("Random Number", Integer.toString(randomNumber));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}