package humans;
import java.util.*;


import libraryitems.Book;



public class User extends Person {
    private List<Book> borrowedBooks;

    public User(String name, String id) {
        super(name, id);  
        this.borrowedBooks = new ArrayList<>();
    }

    public User(String name, String id, List<Book> borrowedBooks) {
        super(name, id);
        this.borrowedBooks = borrowedBooks;
    }


    public List<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.getIsAvailable()){
            borrowedBooks.add(book);
            System.out.println(getName() + " has borrowed " + book.getTitle());
            book.setIsAvailable(false);
        }else{
            System.out.println(book.getTitle() + " is unavailable.");
        }
        
    }

    

    public void returnBook(Book book) {
        if(borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setIsAvailable(true);
        }
        
    }
    
    
    public String toString() {
        return getName() + ", ID: " + getId() + " " + getBorrowedBooks();

    } 

    
}
