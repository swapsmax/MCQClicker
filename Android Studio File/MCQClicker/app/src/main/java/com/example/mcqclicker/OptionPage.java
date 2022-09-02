package com.example.mcqclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.os.AsyncTask;
import android.net.Uri;
import android.widget.Toast;

public class OptionPage extends AppCompatActivity {

    private WebView webView;  // for displaying web contents
    private EditText txtURL;
    static int questionnumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_page);
        webView = (WebView) findViewById(R.id.webView);
        txtURL = (EditText) findViewById(R.id.txtURL);
    }

    public void btnTerminateHandler(View view) {
        // Create an Intent to start the second activity called "OptionPage"
        Intent intent = new Intent(this, Homepage.class);
        // Start the intended activity
        startActivity(intent);
    }

    public void btnGoHandler(View view) {
        String qnNo = Integer.toString(questionnumber);
        webView.loadUrl("http://10.0.2.2:9999/clicker/studentcomment?question=" + qnNo + "&comment=" + txtURL.getText().toString());  // URL hardcoded
    }

    public void btnpressA(View view) {
        String qnNo = Integer.toString(questionnumber);
        webView.loadUrl("http://10.0.2.2:9999/clicker/select?choice=a&question=" + qnNo);  // URL hardcoded

        String toastMessage = "You selected A.";
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();

        questionnumber++;

        if (questionnumber <= 10){
            Intent intent = new Intent(this, WaitNextQuestion.class);
            // Start the intended activity
            startActivity(intent);
        }

        if (questionnumber == 11){
            Intent intent = new Intent(this, EndOfQuiz.class);
            // Start the intended activity
            startActivity(intent);
        }

    }

    public void btnpressB(View view) {
        String qnNo = Integer.toString(questionnumber);
        webView.loadUrl("http://10.0.2.2:9999/clicker/select?choice=b&question=" + qnNo);  // URL hardcoded

        String toastMessage = "You selected B.";
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();

        questionnumber++;

        if (questionnumber <10){
            Intent intent = new Intent(this, WaitNextQuestion.class);
            // Start the intended activity
            startActivity(intent);
        }

        if (questionnumber == 11){
            Intent intent = new Intent(this, EndOfQuiz.class);
            // Start the intended activity
            startActivity(intent);
        }
    }

    public void btnpressC(View view) {
        String qnNo = Integer.toString(questionnumber);
        webView.loadUrl("http://10.0.2.2:9999/clicker/select?choice=c&question=" + qnNo);  // URL hardcoded

        String toastMessage = "You selected C.";
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();

        questionnumber++;

        if (questionnumber <10){
            Intent intent = new Intent(this, WaitNextQuestion.class);
            // Start the intended activity
            startActivity(intent);
        }

        if (questionnumber == 11){
            Intent intent = new Intent(this, EndOfQuiz.class);
            // Start the intended activity
            startActivity(intent);
        }
    }

    public void btnpressD(View view) {
        String qnNo = Integer.toString(questionnumber);
        webView.loadUrl("http://10.0.2.2:9999/clicker/select?choice=d&question=" + qnNo);  // URL hardcoded

        String toastMessage = "You selected D.";
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();

        questionnumber++;

        if (questionnumber <10){
            Intent intent = new Intent(this, WaitNextQuestion.class);
            // Start the intended activity
            startActivity(intent);
        }

        if (questionnumber == 11){
            Intent intent = new Intent(this, EndOfQuiz.class);
            // Start the intended activity
            startActivity(intent);
        }
    }
}

