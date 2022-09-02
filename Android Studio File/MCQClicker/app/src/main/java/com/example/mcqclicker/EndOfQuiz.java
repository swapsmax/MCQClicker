package com.example.mcqclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EndOfQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_of_quiz);
    }

    public void btnTerminateHandler(View view) {
        // Create an Intent to start the second activity called "OptionPage"
        Intent intent = new Intent(this, Homepage.class);
        // Start the intended activity
        startActivity(intent);
    }
}