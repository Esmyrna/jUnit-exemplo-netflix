package services;

import entidade.Movie;

import java.util.ArrayList;
import java.util.List;

public class NetflixService {
    List<Movie> favoriteList = new ArrayList<>();

    public void addMovie(Movie movie) {
         favoriteList.add(movie);
    }

    public void removeMovie(Movie movie) {
        favoriteList.remove(movie);
    }

    public boolean containsMovie(Movie movie) {
      return  favoriteList.contains(movie);
    }

    public int getMovieCount() {
        return favoriteList.size();
    }
}
