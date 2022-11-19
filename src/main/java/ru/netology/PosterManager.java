package ru.netology;

public class PosterManager {
    private int id;

    public PosterManager(PosterRepository repo){
    }

    public PosterManager(int id, String movieName) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

}