package com.example.final_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAddMovies(View view) {
        Intent intent = new Intent(this, AddMovieActivity.class);
        startActivity(intent);
    }

    public void onClickViewMovies(View view) {
        Intent intent = new Intent(this, ViewMoviesActivity.class);
        startActivity(intent);
    }

}
