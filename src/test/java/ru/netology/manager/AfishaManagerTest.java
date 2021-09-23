package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AfishaManagerTest {
    @Mock
    private AfishaRepository repository = Mockito.mock(AfishaRepository.class);
    @InjectMocks
    private AfishaManager manager = new AfishaManager(repository);
    Movie first = new Movie(1, 1, "first", "1", "1");
    Movie second = new Movie(2, 2, "second", "1", "1");
    Movie third = new Movie(3, 3, "third", "1", "1");
    Movie fourth = new Movie(4, 4, "fourth", "1", "1");


    @Test
    public void shouldGetAllInRevers() {
        Movie[] returned = {fourth, third, second, first};
        doReturn(returned).when(repository).findAll();

        Movie[] expected = new Movie[]{fourth, third, second, first};
        Movie[] actual = manager.findAll();
        assertEquals(expected, actual);

    }
}
