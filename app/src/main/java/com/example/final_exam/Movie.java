package com.example.final_exam;

public class Movie {
    /**
     * Movie class for representing movies as database objects.
     */

    public String title;
    public String description;
    public String imdbLink;

    public Movie() {
        /**
         * Default Movie constructor required for realtime database updates.
         */
        this.title = "none";
        this.description = "none";
        this.imdbLink = "https://www.imdb.com/";
    }

    public Movie(String title, String description, String imdbLink) {
        /**
         * Custom Movie constructor.
         */
        this.title = title;
        this.description = description;
        this.imdbLink = imdbLink;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImdbLink() {
        return imdbLink;
    }

}
