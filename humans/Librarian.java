package humans;


import libraryitems.Book;
import main.Library;
public class Librarian extends Person {

    private Library library;

    public Librarian(String name, String id, Library library) {
        super(name, id);
        this.library = library;
    }

    public void addBook(Book book) {
        library.getBooks().add(book);
    }

    public void removeBook(Book book) {
        library.getBooks().remove(book);
    }

    public void listAllBooks() {
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }

    public String toString() {
        return "Librarian "+ getName() + ". ID: " + getId(); 
    }
}

    

    



    

