public class Main {
    public static void main(String[] args) {
        Movie theMovie = new Adventure("Stars Wars");
        theMovie.watchMovie();
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