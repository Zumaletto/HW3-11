package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] items = new Movie[0];
    private int limitMovieToGet = 10;

    public MovieManager() {
    }

    public MovieManager(int limitMovieToGet) {
        this.limitMovieToGet = limitMovieToGet;
    }

    public void add(Movie item) {
        int length = items.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Movie[] getAll() {
        int resultLength;
        if (items.length > limitMovieToGet) {
            resultLength = limitMovieToGet;
        } else {
            resultLength = items.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }


}