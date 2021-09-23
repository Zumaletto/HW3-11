package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AfishaRepositoryTest {
    AfishaRepository repo = new AfishaRepository();
    Movie first = new Movie(1, 1, "first", "1", "1");
    Movie second = new Movie(2, 2, "second", "1", "1");
    Movie third = new Movie(3, 3, "third", "1", "1");
    Movie fourth = new Movie(4, 4, "fourth", "1", "1");
    Movie fifth = new Movie(5, 5, "fifth", "1", "1");

    @Test
    void shouldSaveMovie() {
        repo.save(first);
        repo.save(third);
        repo.save(fifth);

        Movie[] actual = repo.findAll();
        Movie[] expected = new Movie[]{first, third, fifth};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindMovieByNoExistId() {
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(fourth);
        repo.save(fifth);

        int id = 8;
        repo.findById(id);
        Movie[] actual = repo.findAll();
        Movie[] expected = new Movie[]{null};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindMovieById() {
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(fourth);
        repo.save(fifth);

        int id = 4;
        repo.findById(id);
        Movie[] actual = repo.findAll();
        Movie[] expected = new Movie[]{fourth};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(fourth);
        repo.save(fifth);

        int id = 2;
        repo.removeById(id);
        Movie[] actual = repo.findAll();
        Movie[] expected = new Movie[]{first, third, fourth, fifth};
        assertArrayEquals(expected, actual);
    }

     @Test
    void shouldRemoveAll() {
        repo.save(first);
        repo.save(third);
        repo.save(fifth);

        repo.removeAll();
        Movie[] actual = repo.findAll();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }
}