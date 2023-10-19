import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("Adventure", "star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter Type (A for Adventure, C for Comedy, " + "S for Science Ficktion, or Q to quite");
            String type =s.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie Title ");
            String title = s.nextLine();
            Movie movie =  Movie.getMovie(type, title);
            movie.watchMovie();

        }



    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s %n".repeat(3),
                "bad alien do bad stuff",
                "space guys chase aliens",
                "planet bloss");
    }
}