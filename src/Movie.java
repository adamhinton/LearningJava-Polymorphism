public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){

        String instanceType = this.getClass().getSimpleName();

        System.out.printf("title is a %s film", instanceType);


    }

}
