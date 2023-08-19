import entidade.Movie;
import services.NetflixService;

public class Main {
    public static void main(String[] args) {
        NetflixService netflixService = new NetflixService();
        Movie Matrix  = new Movie("Matrix", 2010);

        int MovieCount = netflixService.getMovieCount();
        netflixService.addMovie(Matrix);
        System.out.println("A quantidade de filmes na lista de favoritos após adicionar é: " + MovieCount);

        netflixService.removeMovie(Matrix);
        System.out.println("A quantidade de filmes na lista de favoritos após remover é: " + MovieCount);

        Movie movieToCheck = new Movie("As branquelas", 2010);
        boolean containsMovie = netflixService.containsMovie(movieToCheck);
        System.out.println("Minha lista contém o filme das branquelas? : " + containsMovie);
        System.out.println();
    }
}
