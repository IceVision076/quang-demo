package demo;

public class Movie implements Comparable<Movie> {
    private String name;
    private Integer year;
    private String director;
    private float price;
    private float star;

    public Movie() {
    }

    public Movie(String name, Integer year,
                 String director, float price, float star) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.price = price;
        this.star = star;
    }

    //...
    public int compareTo(Movie o) {
        return year.compareTo(o.year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getStar() {
        return star;
    }

    public void setStar(float star) {
        this.star = star;
    }
}
