package com.library;
import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("Book ID | Title | Author | Quantity");
        for (Book book : books) {
            book.display();
        }
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && book.getQuantity() > 0) {
                book.setQuantity(book.getQuantity() - 1);
                System.out.println("Book issued successfully!");
                return;
            }
        }
        System.out.println("Book not available or out of stock.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                book.setQuantity(book.getQuantity() + 1);
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Invalid book ID.");
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.display();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

