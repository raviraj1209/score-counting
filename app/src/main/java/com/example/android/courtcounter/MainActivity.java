package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int scor = 0;
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void inc(View View)
    {
        score = score + 3;
        displayForTeamA(score);
    }

    public void incs(View View)
    {
        score = score + 2;
        displayForTeamA(score);
    }
    public void incss(View View)
    {
        score = score + 1;
        displayForTeamA(score);
    }

    public void displayForTeamB(int scor) {
        TextView scorView = (TextView) findViewById(R.id.team_b_score);
        scorView.setText(String.valueOf(scor));
    }
    public void innc(View View)
    {
        scor = scor + 3;
        displayForTeamB(scor);
    }

    public void inccs(View View)
    {
        scor = scor + 2;
        displayForTeamB(scor);
    }
    public void incsss(View View)
    {
        scor = scor + 1;
        displayForTeamB(scor);
    }
    public void reset(View v){
        scor = score = 0;
        displayForTeamA(score);
        displayForTeamB(scor);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}