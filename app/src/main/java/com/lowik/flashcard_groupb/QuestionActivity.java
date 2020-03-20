package com.lowik.flashcard_groupb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // add a list
        int[] layouts = new int[] {R.layout.activity_question0, R.layout.activity_question1,
                R.layout.activity_question2, R.layout.activity_question3,
                R.layout.activity_question4, R.layout.activity_question5};
        // randomly generate the layout
        setContentView(layouts[new Random().nextInt(layouts.length)]);
    }
}
