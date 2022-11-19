package ru.netology;


public class PosterRepository {
    private PosterManager[] movies = new PosterManager[0];


    public void save(PosterManager movie) {
        PosterManager[] tmp = new PosterManager[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public void removeById(int id) {
        PosterManager[] tmp = new PosterManager[movies.length - 1];
        int copyToIndex = 0;
        for (PosterManager movie : movies) {
            if (movie.getId() != id) {
                tmp[copyToIndex] = movie;
                copyToIndex++;
            }
        }
        movies = tmp;
    }

    public void removeAll() {
        PosterManager[] tmp = new PosterManager[]{null};
        movies = tmp;
    }

    public void findById(int id) {
        PosterManager[] tmp = new PosterManager[1];
        int copyToIndex = 0;
        for (PosterManager movie : movies) {
            if (movie.getId() == id) {
                tmp[copyToIndex] = movie;
                copyToIndex++;
            }
        }
        movies = tmp;
    }

    public PosterManager[] findAll() {
        return movies;
    }
}


