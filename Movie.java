public class Movie {
    String title; //название фильма
    String studio; //студия снявшая фильм
    String rating; //рейтинг фильма
    public Movie (String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie (String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }
    public static void main (String[] args) {
        Movie movie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Главный герой", "20th Century Studios");
        System.out.printf("Название фильма: %s, Название студии: %s, Рейтинг фильма: %s", movie1.title, movie1.studio, movie1.rating);
        System.out.println();
        System.out.printf("Название фильма: %s, Название студии: %s, Рейтинг фильма: %s", movie2.title, movie2.studio, movie2.rating);
    }
}
