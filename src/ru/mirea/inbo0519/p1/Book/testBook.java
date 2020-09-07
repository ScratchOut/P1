package ru.mirea.inbo0519.p1.Book;

public class testBook {
    public static void main(String[] args) {
        Book b1 = new Book("Pervai Naychnai Istoria", 1000, "Evgeniy Panasenkov", "Genius");
        Book b2 = new Book("BCEPOD", 322, "Rybnikov", "Science");
        Book b3 = new Book("Miatnaiy Ckazka(fairytale)", 100000, "Alex Polyrnui");
        System.out.println(b3);
        b3.setPlot("BRUH");
        System.out.println(b3);

        System.out.println(b1);
        System.out.println(b2);
    }
}
