package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {
    MovieManager manager = new MovieManager();
    Movie first = new Movie(1, 1, "first", "1", "1");
    Movie second = new Movie(2, 2, "second", "1", "1");
    Movie third = new Movie(3, 3, "third", "1", "1");
    Movie fourth = new Movie(4, 4, "fourth", "1", "1");
    Movie fifth = new Movie(5, 5, "fifth", "1", "1");

    @Test
    public void shouldGetUnderLimit() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetOverLimit() {
        MovieManager manager = new MovieManager(3);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetEmpty() {
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }


}