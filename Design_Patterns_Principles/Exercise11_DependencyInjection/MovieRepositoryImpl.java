public class MovieRepositoryImpl implements MovieRepository {

    @Override
    public String getMovieById(int id) {

        if (id == 1) {
            return "Interstellar";
        }
        else if (id == 2) {
            return "Inception";
        }
        else {
            return "Movie not found";
        }
    }
}
