package com.example.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     int scoreLatestNew = 0;
    int scoreLatestNewB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private void scoreForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
                scoreView.setText(String.valueOf(score));
    }
    private void scoreForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void threeMorePoints(View view){
        scoreLatestNew = scoreLatestNew + 3;
        scoreForTeamA(scoreLatestNew);

    }
    public void twoMorePoints(View view){
        scoreLatestNew = scoreLatestNew + 2;
        scoreForTeamA(scoreLatestNew);

    }
    public void freeMorePoints(View view){
        scoreLatestNew = scoreLatestNew + 1;
        scoreForTeamA(scoreLatestNew);

    }
    public void threeMorePointsB(View view){
        scoreLatestNewB = scoreLatestNewB + 3;
        scoreForTeamB(scoreLatestNewB);

    }
    public void twoMorePointsB(View view){
        scoreLatestNewB = scoreLatestNewB + 2;
        scoreForTeamB(scoreLatestNewB);

    }
    public void freeMorePointsB(View view){
        scoreLatestNewB = scoreLatestNewB + 1;
        scoreForTeamB(scoreLatestNewB);

    }
    public void resetScore(View view){
        scoreLatestNew = 0;
        scoreLatestNewB = 0;
        scoreForTeamA(scoreLatestNew);
        scoreForTeamB(scoreLatestNewB);
    }
}