import entidade.Movie;
import org.testng.annotations.Test;
import services.NetflixService;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class NetflixServiceTest {

    @Test
    public void testAddMovie() {
        NetflixService netflixService = new NetflixService();
        Movie movie = new Movie("Gossip Girl", 2010);

        netflixService.addMovie(movie);
        assertTrue(netflixService.containsMovie(movie));
    }

    @Test
    public void testRemoveMovie() {
            NetflixService netflixService = new NetflixService();
            Movie movie = new Movie("Black Mirror", 2015);
            netflixService.addMovie(movie);
            netflixService.removeMovie(movie);

            assertFalse(netflixService.containsMovie(movie));

    }

    @Test
    public void testGetMovieCount() {
        NetflixService netflixService = new NetflixService();
        netflixService.addMovie(new Movie("Avengers: Endgame", 2019));
        netflixService.addMovie(new Movie("Black Panther", 2018));

        assertEquals(2, netflixService.getMovieCount());
    }
}
