import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Library Management System Started");

        Library lib = new Library();
        Member m1 = new StudentMember(9081, "Debarghya", "CSE-IOT");
        m1.displayMember();
        
        Book b1 = new Book(1, "Java Basics", "Author A");
        Book b2 = new Book(2, "OOP Concepts", "Author B");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayBooks();

        try {
            lib.issueBook(1);
            lib.returnBook(1);
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
