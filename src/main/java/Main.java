import movies.Movie;
import movies.MovieDAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MovieDAO movieDAO = new MovieDAO();
        Scanner scanner = new Scanner(System.in);

        System.out.println(movieDAO.deleteTable());

//        System.out.println(movieDAO.getAllMovies());
//
//
//        System.out.println("Enter id of movie you would like to delete");
//        int id = scanner.nextInt();
//        movieDAO.deleteMovie(id);
//
//        Movie movie = movieDAO.findMovie(id);
//        movie.title = "Mission: Impossible 1";
//        movie.yearOfRelease = 1997;
//
//        movieDAO.updateMovie(movie);
//
//
//        System.out.println(movieDAO.findMovie(id));




        //System.out.println(movieDAO.createMovie(new Movie("Mission: Impossible", "action", 1996)));
        //System.out.println(movieDAO.createMovie(new Movie("The Godfather", "crime", 1972)));
       // System.out.println(movieDAO.createMovie(new Movie("No time to die", "spy", 2021)));
    }
}
