package entidade;

public class Movie {
    private String title;
    private int age;

    public Movie(String title, int age) {
        this.title = title;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
