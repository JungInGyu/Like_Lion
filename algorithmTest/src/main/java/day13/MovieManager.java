package day13;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie>{
    String movieName;
    int releaseYear;
    int rating;

    public Movie(String movieName, int releaseYear, int rating) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    @Override
    public int compareTo(Movie o) {
        return 0;
    }
}

// Comparator 인터페이스 구현
class RatingComparator{
}

public class MovieManager {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
//        movies.add(new Movie("The Shawshank Redemption", 1994, 9.3));
//        movies.add(new Movie("The Godfather", 1972, 9.2));
//        movies.add(new Movie("The Dark Knight", 2008, 9.0));

        // 제목 기준 정렬 (Comparable)
        Collections.sort(movies);
        System.out.println("Sorted by title:");
        movies.forEach(System.out::println);

        // 평점 기준 정렬 (Comparator)
//        Collections.sort(movies, new RatingComparator());
        System.out.println("Sorted by rating:");
        movies.forEach(System.out::println);

        // 출시 연도 기준 정렬 (Comparator)
//        Collections.sort(movies, new ReleaseYearComparator());
        System.out.println("Sorted by release year:");
        movies.forEach(System.out::println);
    }
}
