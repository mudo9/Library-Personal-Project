package main;
import java.util.*;

import humans.Librarian;
import humans.User;
import libraryitems.Book;
public class Library{

    private List<Book> books;
    private List<User> users;

    public Library(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;
    }

    public List<Book> getBooks(){
        return books;
    }

    public List<User> getUser() {
        return users;
    }


    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    

    public void listAvailableBooks(){
        for (Book books : this.books){
            System.out.println(books);
        }
    }

    public void listAvailableUsers(){
        for (User users : this.users){
            System.out.println(users);
        }
    }

    public void findBookByTitle(String title) {
        boolean bookFound = false;
        for (Book book : books) {
            if(title.trim().equalsIgnoreCase(book.getTitle().trim())) {
                bookFound = true;
                System.out.println(book);
            }
        
        }
        if (bookFound) {
            System.out.println("The book has been found.");
        } else {
            System.out.println("The book was not found.");
        }
    }

   

    


    public static void main(String [] args) {
        List<User> users = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        List<Book> firstBooks = new ArrayList<>();
        List<Book> secondBooks = new ArrayList<>();
        List<Book> thirdBooks = new ArrayList<>();
        
        
        User first = new User("Michael", "AE12", firstBooks);
        User second = new User("Raphael", "B12", secondBooks);
        User third = new User("Jessica", "A315");


        Book book1 = new Book("A213", "DaVinci Code", "Dan Brown", true );
        Book book2 = new Book("A214", "Digital Fortress", "Clark Kent", true );
        Book book3 = new Book("A215", "Inception", "Lex Luthor", true );
        Book book4 = new Book("A216", "Orange tree", "Dan Brown", true );

        
        Library adventure_road = new Library(books, users); 
 
        Librarian mum = new Librarian("Gloria Udo", "GU2001", adventure_road); 
 
        mum.addBook(book1);
        mum.addBook(book2);
        mum.addBook(book3);
        mum.addBook(book4);

        adventure_road.addUser(first);
        adventure_road.addUser(second);
        adventure_road.addUser(third);

        adventure_road.listAvailableBooks();

        //first.borrowBook(book2);
        first.borrowBook(book1);
        first.borrowBook(book3);
        

        third.borrowBook(book2);

        adventure_road.findBookByTitle("digital fortress");
        
        
        /*System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(mum);*/
        
    }
}