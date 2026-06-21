public class MovieService {

    private MovieRepository repository;

    // Constructor Injection
    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public void displayMovie(int id) {
        System.out.println("Recommended Movie: "
                           + repository.getMovieById(id));
    }
}
