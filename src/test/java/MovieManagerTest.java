import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.films.MovieManager;

public class MovieManagerTest {
    @Test
    public void add0() {
        MovieManager manager = new MovieManager();

        manager.findall();

        String[] expected = {};
        String[] actual = manager.findall();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add1() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");
        manager.findall();

        String[] expected = {"Film 1"};
        String[] actual = manager.findall();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add10() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");
        manager.findall();

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findall();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast1() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");

        manager.findLast();

        String[] expected = {"Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast3() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");

        manager.findLast();

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");

        manager.findLast();

        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10Limit7() {
        MovieManager manager = new MovieManager(7);

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");

        manager.findLast();

        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4",};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10Limit3() {
        MovieManager manager = new MovieManager(3);

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");

        manager.findLast();

        String[] expected = {"Film 10", "Film 9", "Film 8"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}