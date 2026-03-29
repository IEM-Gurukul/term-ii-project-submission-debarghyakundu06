public class Book {

    // Encapsulation: private variables only
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    // Parameterized Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Getters implementation
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    // Setters Implementation
    public void setIssued(boolean issued) {
        this.isIssued = issued;
    }

    // Display method Calling
    public void displayBook() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + isIssued);
        System.out.println("----------------------");
    }
}
