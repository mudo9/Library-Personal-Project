package humans;
import java.util.*;


import libraryitems.Book;



public class User extends Person {
    private List<Book> borrowedBooks;

    public User(String name, String id) {
        super(name, id);  
    }

    public User(String name, String id, List<Book> borrowedBooks) {
        super(name, id);
        this.borrowedBooks = borrowedBooks;
    }


    public List<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public void borrowBook(Book book) {
        while (book.getIsAvailable() == true){
            borrowedBooks.add(book);
            book.setIsAvailable(false);
        }
        
    }

    

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setIsAvailable(true);
    }
    
    
    public String toString() {
        return getName() + ", ID: " + getId() + " " + getBorrowedBooks();

    } 

    
}
