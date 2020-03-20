package com.lowik.flashcard_groupb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // add a list
        int[] layouts = new int[] {R.layout.activity_question, R.layout.activity_question1, R.layout.activity_question2};
        // randomly generate the layout
        setContentView(layouts[new Random().nextInt(layouts.length)]);
    }
}
