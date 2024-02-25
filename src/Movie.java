public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public static Movie getMovie(String type, String title){

        return switch(type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.printf("%s is a %s film\n", title, instanceType);
    }
}



class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant scene",
                "Scary music",
                "something bad happens");
    }

    public void watchAdventure(){
        System.out.println("Watching adventure");
    }
}



class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }

    public void watchComedy(){
        System.out.println("Watching comedy");
    }

}



class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad aliens do bad stuff",
                "Space guys chase aliens",
                "Planet blows up");
    }

    public void watchScienceFiction(){
        System.out.println("Watching Science fiction");
    }
}

