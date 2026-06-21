public class DependencyInjectionDemo {

    public static void main(String[] args) {

        // Injecting dependency
        MovieRepository repository =
                new MovieRepositoryImpl();

        MovieService service =
                new MovieService(repository);

        service.displayMovie(1);
        service.displayMovie(2);
    }
}
