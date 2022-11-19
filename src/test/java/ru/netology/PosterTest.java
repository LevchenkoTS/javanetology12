package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class PosterTest {
    PosterRepository repo = new PosterRepository();
    PosterManager manager = new PosterManager(repo);
    PosterManager manager1 = new PosterManager(1, "movie1");
    PosterManager manager2 = new PosterManager(2, "movie2");
    PosterManager manager3 = new PosterManager(3, "movie3");
    PosterManager manager4 = new PosterManager(4, "movie4");

    @BeforeEach
    public void setup(){
        repo.save(manager1);
        repo.save(manager2);
        repo.save(manager3);
        repo.save(manager4);
    }


    @Test
    public void testSave() {
        PosterRepository repo = Mockito.mock(PosterRepository.class);
        PosterManager[] movies ={manager1, manager2, manager3, manager4};
        doReturn(movies).when(repo).findAll();


        PosterManager[] expected = {manager1, manager2, manager3, manager4};
        PosterManager[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testRemoveById() {

        PosterRepository repo = new PosterRepository();
        
        repo.save(manager1);
        repo.save(manager2);
        repo.save(manager3);
        repo.save(manager4);

        repo.removeById(manager3.getId());

        PosterManager[] expected = {manager1, manager2, manager4};
        PosterManager[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindById() {

        PosterRepository repo = new PosterRepository();

        repo.save(manager1);
        repo.save(manager2);
        repo.save(manager3);
        repo.save(manager4);

        repo.findById(manager2.getId());

        PosterManager[] expected = {manager2};
        PosterManager[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveAll() {
        PosterRepository repo = new PosterRepository();

        repo.save(manager1);
        repo.save(manager2);
        repo.save(manager3);
        repo.save(manager4);

        repo.removeAll();

        PosterManager[] expected = {null};
        PosterManager[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


}


