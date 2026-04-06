import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Library Management System Started");

        Library lib = new Library();
        Member m1 = new StudentMember(9081, "Debarghya", "CSE-IOT");
        m1.displayMember();

        try {
            lib.issueBook(1);
            lib.returnBook(1);
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
