package com.example.mcqclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

    }

    public void btnBeginHandler(View view) {
        EditText txtURL;
        txtURL = (EditText) findViewById(R.id.txtURL);

            if (txtURL.length() == 6){
                // Create an Intent to start the second activity called "OptionPage"
                Intent intent = new Intent(this, OptionPage.class);
                // Start the intended activity
                startActivity(intent);
            }
            else {
                String toastMessage = "Session Has Not Begun Yet";
                Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
            }
        }


    public void btnLogoutHandler(View view) {
        // Create an Intent to start the second activity called "OptionPage"
        Intent intent = new Intent(this, MainActivity.class);
        // Start the intended activity
        startActivity(intent);
    }
}