
public class TestLibrary {
  public static void main(String[] args) {
    Borrower l1 = new Borrower("Rafiq Ahmed", "L001", "librarian");
    Borrower l2 = new Borrower("Nadia Islam", "L002", "librarian");
    Book b1 = new Book("The Time", "ISBN123", "Fiction");
    Book b2 = new Book("End of it", "ISBN456", "Science");
    Book b3 = new Book("Clean Code", "ISBN789", "Tech");
    Book b4 = new Book("The Hobbit", "ISBN001", "Sci-fi");
    System.out.println("============= 1 =============");
    l2.addBook(b1);
    l2.addBook(b2);
    l2.addBook(b3);
    l2.addBook(b4);
    Borrower br1 = new Borrower("Alice", "B101", "borrower");
    Borrower br2 = new Borrower("Bob", "B102", "borrower");
    System.out.println("============= 2 =============");
    br1.borrowBook(b1);
    br1.borrowBook(b3);
    br2.borrowBook(b1);
    br2.borrowBook(b4);
    l1.printDetails();
    l2.printDetails();
    System.out.println("============= 3 =============");
    br1.printDetails();
  }
}