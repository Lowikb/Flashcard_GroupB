package com.lowik.flashcard_groupb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Intent intent = getIntent();
        String versionName = intent.getStringExtra("versionName");

        TextView versionNameTextView = findViewById(R.id.versionTextView);
        versionNameTextView.setText("v" + versionName);
    }
}
