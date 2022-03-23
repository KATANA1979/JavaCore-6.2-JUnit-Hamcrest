public class Main {
    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
            System.out.println(event + "\n");
        }
        for (Event event : getTheatres()) {
            validEvent(event);
            System.out.println(event + "\n");
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[] {
               new Movie("Начало", 2010, 16), 
               new Movie("Аватар", 2009, 10),
               new Movie("Смешарики", 2020, 2) 
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[] {
               new Theatre("Анна Каренина", 2017, 16), 
               new Theatre("Лебединное озеро", 2016, 10),
               new Theatre("Щелкунчик", 2019, 2)
        };
    }

    public static void validEvent(Event event) throws RuntimeException {
        if (event.getAge() == 0 || event.getReleaseYear() == 0 || event.getTitle().isEmpty())
            throw new RuntimeException("Поле не заполнено!");
    }
}
