class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        FictionBook fb = new FictionBook("Harry Potter", "J.K. Rowling");
        fb.displayDetails();

        System.out.println();

        NonFictionBook nfb = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        nfb.displayDetails();

        System.out.println();

        TechnicalBook tb = new TechnicalBook("Java Programming", "Herbert Schildt");
        tb.displayDetails();
    }
}
