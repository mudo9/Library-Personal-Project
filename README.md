# Library Management System

## Overview

This project is a simple Library Management System implemented in Java. It includes classes for managing books, users, and librarians. The system allows for adding and removing books, borrowing and returning books, and listing available books and users.

## Project Structure

- **`main/Library.java`**: Contains the `Library` class which manages the collection of books and users. It includes methods for adding and removing users, listing available books, and finding books by title.
- **`humans/Person.java`**: An abstract class that represents a person with a name and ID.
- **`humans/User.java`**: Inherits from `Person` and represents a user who can borrow and return books.
- **`humans/Librarian.java`**: Inherits from `Person` and represents a librarian who can add or remove books from the library.
- **`libraryitems/Book.java`**: Represents a book with properties such as title, author, and availability status.

## Classes

### Library
- **Methods**:
  - `addUser(User user)`: Adds a user to the library.
  - `removeUser(User user)`: Removes a user from the library.
  - `listAvailableBooks()`: Lists all books available in the library.
  - `listAvailableUsers()`: Lists all users of the library.
  - `findBookByTitle(String title)`: Finds a book by its title.

### Person
- **Fields**:
  - `name`: Name of the person.
  - `id`: ID of the person.
- **Methods**:
  - Getters and setters for `name` and `id`.
  - `toString()`: Returns a string representation of the person.

### User
- **Inherits From**: `Person`
- **Fields**:
  - `borrowedBooks`: List of books borrowed by the user.
- **Methods**:
  - `borrowBook(Book book)`: Allows the user to borrow a book.
  - `returnBook(Book book)`: Allows the user to return a borrowed book.
  - `getBorrowedBooks()`: Returns the list of borrowed books.
  - `toString()`: Returns a string representation of the user and their borrowed books.

### Librarian
- **Inherits From**: `Person`
- **Methods**:
  - `addBook(Book book)`: Adds a book to the library's collection.
  - `removeBook(Book book)`: Removes a book from the library's collection.
  - `listAllBooks()`: Lists all books in the library.
  - `toString()`: Returns a string representation of the librarian.

### Book
- **Fields**:
  - `bookId`: Unique ID for the book.
  - `title`: Title of the book.
  - `author`: Author of the book.
  - `isAvailable`: Availability status of the book.
- **Methods**:
  - Getters and setters for fields.
  - `toString()`: Returns a string representation of the book.
  - `borrowBook()`: Indicates that the book has been borrowed (used for demonstration).

## Usage

1. **Compile**: Use `javac` to compile the Java files.
   ```bash
   javac -d bin src/main/Library.java src/humans/Person.java src/humans/User.java src/humans/Librarian.java src/libraryitems/Book.java

2. **Run**: Use `java` to run the `Library` class.
    ```bash
    java -cp bin main.Library

3. **Test**: Test the application by adding users, books, and performing operations like borrowing and returning books.

## License
This project is licensed under the MIT License.