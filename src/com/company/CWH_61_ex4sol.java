package com.company;
import java.lang.Math;

class Library {
    String[] books;
    int no_of_books;
    Library() {                       // constructor
        this.books = new String[100];            // 100 here is upper bound or length    //1. created array 'books' (list of books)
        this.no_of_books = 0;                                                            //2. to count no. of books in the library
    }
    void addBook(String book) {                                              //3. method to add new books with book name dynamically initialized as 'book'
        this.books[no_of_books] = book;                                      //4.  arr[i] = element_name (dynamic initialization)
        no_of_books ++;                                                      //5. to automatically update no. of books
        System.out.println(no_of_books + " " + book + " has been added!");
    }
    void showAvailableBooks() {                                            //6. method to show available books
        System.out.print("Available Books are: ");
        for (String booka : this.books) {                                  //7. for each loop to print available books
            if(booka == null) {                                            //8. to avoid showing null for unavailable books
                continue;                                                  //9. to return back to the start of the loop to show next available books
            }
            System.out.print("* " + booka + "; ");
        }
    }
    void issueBook(String booki) {                                        //10. method to show issued books
        for (int i=0; i<this.books.length; i++) {
            if (this.books[i].equals(booki)) {
                System.out.println(booki + " - this book has been issued");
                this.books[i] = null;                                     //11. to list it as unavailable
                return;
            }
        }
        System.out.println("this book does not exist");                 // ??????
    }

    void returnBook (String book) {    // for simplicity
        addBook(book);                 // but has one issue, will count returned books as new books.
    }
}
public class CWH_61_ex4sol {
    public static void main(String[] args) {        // You have to implement a library using Java Class Library.  Methods: addBook, issueBook, returnBook, showAvailableBooks
        Library MAL = new Library();                       //    Properties: Array to store the available books,            Array to store the issued books
        MAL.addBook("Thermodynamics");
        MAL.addBook("CRE");
        MAL.addBook("MT");
        MAL.showAvailableBooks();
        System.out.println("total number of books in MAL: " + MAL.no_of_books);
        MAL.issueBook("CRE");
        MAL.showAvailableBooks();
        System.out.println("total number of books in MAL: " + MAL.no_of_books);
        MAL.returnBook("CRE");
        System.out.println("total number of books in MAL: " + MAL.no_of_books);

    }
}
