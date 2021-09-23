package ru.netology.manager;

import ru.netology.domain.Movie;
import ru.netology.manager.AfishaRepository;

public class AfishaManager {
    private AfishaRepository repository;

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    public void save(Movie item) {
        repository.save(item);
    }

    public Movie[] findAll() {
        Movie[] items = repository.findAll();
        Movie[] result = new Movie[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void findById(int id) {
        repository.findById(id) ;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public void removeAll() {
        repository.removeAll();
    }

}
