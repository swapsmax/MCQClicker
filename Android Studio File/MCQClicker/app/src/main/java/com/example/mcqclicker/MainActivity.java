package com.example.mcqclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.activity_main_usernameEditText);
        passwordEditText = findViewById(R.id.activity_main_passwordEditText);
        loginButton = findViewById(R.id.activity_main_loginButton);

        /*loginButton.setOnClickListener(new View.OnClickListener() {
            //@Override
             public void onClick(View v) {
                if (usernameEditText.getText().length() == 7 && passwordEditText.getText().length() == 5) {
                    String toastMessage = "Login Successful";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                } else {
                    String toastMessage = "Username or Password Incorrect";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }


    public void btnLoginHandler(View view) {

        if (usernameEditText.getText().length() == 7 && passwordEditText.getText().length() == 8) {
            // Create an Intent to start the second activity called "OptionPage"
            Intent intent = new Intent(this, Homepage.class);

            String toastMessage = "Login Successful";
            Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
            // Start the intended activity
            startActivity(intent);
        } else {
            String toastMessage = "Username or Password Incorrect";
            Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
        }
    }

    public void btnRegistrationHandler(View view) {
        // Create an Intent to start the second activity called "OptionPage"
        Intent intent = new Intent(this, Register.class);
        // Start the intended activity
        startActivity(intent);
    }
}