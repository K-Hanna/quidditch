package com.example.android.quidditch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void score_team_a (View view) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    public void snitch_team_a (View view) {
        scoreTeamA = scoreTeamA + 50;
        displayForTeamA (scoreTeamA);
        String message = "The game is finished.";
        displayMessage(message);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }

    public void score_team_b (View view) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    public void snitch_team_b (View view) {
        scoreTeamB = scoreTeamB + 50;
        displayForTeamB (scoreTeamB);
        String message = "The game is finished.";
        displayMessage(message);
    }

    public void reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        String message = "Play fair!";
        displayMessage(message);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.message);
        priceTextView.setText(message);
    }
}
