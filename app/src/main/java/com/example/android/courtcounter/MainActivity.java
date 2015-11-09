package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int POINTS_FOR_3_POINT_SHOT = 3;
    public static final int POINTS_FOR_2_POINT_SHOT = 2;
    public static final int POINTS_FOR_FREE_THROW = 1;

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 3 points to Team A's score and displays the updated score
     */
    public void threePointsForTeamA(View view) {
        scoreTeamA += POINTS_FOR_3_POINT_SHOT;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 2 points to Team A's score and displays the updated score
     */
    public void twoPointsForTeamA(View view) {
        scoreTeamA += POINTS_FOR_2_POINT_SHOT;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 1 point to Team A's score and displays the updated score
     */
    public void freeThrowForTeamA(View view) {
        scoreTeamA += POINTS_FOR_FREE_THROW;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 3 points to Team B's score and displays the updated score
     */
    public void threePointsForTeamB(View view) {
        scoreTeamB += POINTS_FOR_3_POINT_SHOT;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 2 points to Team B's score and displays the updated score
     */
    public void twoPointsForTeamB(View view) {
        scoreTeamB += POINTS_FOR_2_POINT_SHOT;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 1 point to Team B's score and displays the updated score
     */
    public void freeThrowForTeamB(View view) {
        scoreTeamB += POINTS_FOR_FREE_THROW;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets and displays score for both teams
     */
    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
