package com.example.final_exam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddMovieActivity extends AppCompatActivity {

    private DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_movie);

        database = FirebaseDatabase.getInstance().getReference();
    }

    public void onClickAddButton(View view) {
        EditText movieTitleHolder = findViewById(R.id.movieTitle);
        String movieTitle = movieTitleHolder.getText().toString();
        EditText movieDescHolder = findViewById(R.id.movieDescription);
        String movieDesc = movieDescHolder.getText().toString();
        EditText movieImdbHolder = findViewById(R.id.movieImdbLink);
        String movieImdb = movieImdbHolder.getText().toString();
        Movie newMovie = new Movie(movieTitle, movieDesc, movieImdb);

        DatabaseReference newMovieLocation = database.push();
        newMovieLocation.setValue(newMovie);
    }

    public void onClickBackButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
