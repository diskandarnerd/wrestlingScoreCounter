package com.example.android.wrestlingscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scorePersonA = 0;
    int scorePersonB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Person A.
     */
    public void displayForPersonA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Person A by 2 point.
     */

    public void addTwoForPersonA(View v) {
        scorePersonA = scorePersonA + 2;
        displayForPersonA(scorePersonA);
    }

    /**
     * Increase the score for Person A by 5 points.
     */
    public void addFiveForPersonA(View v) {
        scorePersonA = scorePersonA + 5;
        displayForPersonA(scorePersonA);
    }

    /**
     * Increase the score for Person A by 10 points.
     */
    public void addTenForPersonA(View v) {
        scorePersonA = scorePersonA + 10;
        displayForPersonA(scorePersonA);
    }

    /**
     * Decrease the score for Person A by 5 points.
     */
    public void minusFiveForPersonA(View v) {
        scorePersonA = scorePersonA - 5;
        displayForPersonA(scorePersonA);
    }



    public void displayForPersonB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Person A by 1 point.
     */

    public void addTwoForPersonB(View v) {
        scorePersonB = scorePersonB + 2;
        displayForPersonB(scorePersonB);
    }

    /**
     * Increase the score for Person A by 2 points.
     */
    public void addFiveForPersonB(View v) {
        scorePersonB = scorePersonB + 5;
        displayForPersonB(scorePersonB);
    }

    /**
     * Increase the score for Person A by 3 points.
     */
    public void addTenForPersonB(View v) {
        scorePersonB = scorePersonB + 10;
        displayForPersonB(scorePersonB);
    }

    /**
     * Decrease the score for Person B by 5 points.
     */
    public void minusFiveForPersonB(View v) {
        scorePersonB = scorePersonB - 5;
        displayForPersonB(scorePersonB);
    }


    /**
     * to reset all score back to zero and display them.
     */
    public void resetToZero(View v) {
        scorePersonA = 0;
        scorePersonB = 0;
        displayForPersonA(scorePersonA);
        displayForPersonB(scorePersonB);
    }
}