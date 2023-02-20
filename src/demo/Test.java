package demo;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Thor", 2011, "ABC", 59, 4.3f));
        movies.add(new Movie("Iron man 3", 2013, "DEF", 79, 4.5f));
        movies.add(new Movie("Ant man", 2015, "MNO", 75, 4.5f));
        movies.add(new Movie("Captain Marvel", 2019, "GHI", 59, 4.7f));
        movies.add(new Movie("Avengers: Infinity War", 2018, "ONL", 50, 4.8f));
        movies.add(new Movie("Avengers: End game", 2019, "XYZ", 99, 4.9f));
        Collections.sort(movies,new SortByYear());
        showMovies(movies);
    }

    private static void showMovies(ArrayList<Movie> movies) {
        System.out.printf("%-25s%-10s%-10s%-10s%-10s\n",
                "Tên phim", "Năm SX", "Đạo diễn", "giá vé", "Số sao");
        for (var movie : movies) {
            System.out.printf("%-25s%-10d%-10s%-10.2f%-10.2f\n",
                    movie.getName(), movie.getYear(), movie.getDirector(),
                    movie.getPrice(), movie.getStar());
        }
    }
}
