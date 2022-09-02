package com.example.mcqclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private WebView webView;  // for displaying web contents
    private EditText txtURL, txtURL2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        webView = (WebView) findViewById(R.id.webView);
        txtURL = (EditText) findViewById(R.id.txtURL);
        txtURL2 = (EditText) findViewById(R.id.txtURL2);
    }

    public void btnRegisterHandler(View view) {
        webView.loadUrl("http://10.0.2.2:9999/clicker/register?uname=" + txtURL.getText().toString() + "&pword=" + txtURL2.getText().toString() + "");  // URL hardcoded

        String toastMessage = "Registration Successful";
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }

    public void btnExitHandler(View view) {
        // Create an Intent to start the second activity called "OptionPage"
        Intent intent = new Intent(this, MainActivity.class);
        // Start the intended activity
        startActivity(intent);
    }
}