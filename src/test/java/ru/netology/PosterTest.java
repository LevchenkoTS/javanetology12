package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    @Test

    public void findAll() {

        PosterManager manager = new PosterManager();

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");

        String[] expected = { "movie1", "movie2", "movie3", "movie4", "movie5" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {

        PosterManager manager = new PosterManager();

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");

        String[] expected = { "movie5", "movie4", "movie3", "movie2", "movie1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastIfAnotherLimit() {

        PosterManager manager = new PosterManager(4);
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");

        String[] expected = { "movie5", "movie4", "movie3", "movie2" };
        String [] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}


