package no.hiof.no.joakimga.Oblig4.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Movie extends Production implements Comparable<Movie>{
    private static ArrayList<Movie> MovieArray = new ArrayList<>();

    public static ArrayList<Movie> getMovieArray() {
        return MovieArray;
    }

    public Movie(String title, int playTime, LocalDate releaseDate, String description){
        super(title,playTime,releaseDate,description);
        MovieArray.add(this);
    }


    @Override
    public int compareTo(Movie movie) {
        int compared = this.getTitle().compareTo(movie.getTitle());
        if (compared < 0) {
            return -1;
        }
        else if (compared > 0){
            return 1;
        }
        return 0;
    }














    @Override
    public String toString() {
        return "Film: " + getTitle() + " sjanger: " + getDescription() + getPlayTime() + getReleaseDate();
    }
}
