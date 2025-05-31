public class Book {
    private String title;
    private String author;
    private int year;
    private boolean available = true;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isAvailable() { return available; }
    public void borrowBook() {
        if (available) available = false;
    }
    public void returnBook() {
        available = true;
    }
}
