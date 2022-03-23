public abstract class Event {

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }

    String title;
    int releaseYear;
    int age;

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    @Override
    public String toString() {
        return title + " " + releaseYear + " года. Ограничение по возрасту: " + age + "+";
    }
}

