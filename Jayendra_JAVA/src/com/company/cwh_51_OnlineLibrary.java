package com.company;
class Library{
    String[] books;
    int noOfBooks;
    Library(){
      this.books= new String[100];
      this.noOfBooks = 0;
    }

    void addBook(String book){
        this.books[noOfBooks]=book;
        noOfBooks++;
        System.out.println(book + " has been added.");
    }

    void showAvailableBooks(){
        System.out.println("Available books are :");
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("*" +book);
        }
    }

    void issueBook(String book){
        for (int i =0; i<this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println("The "+ book+ " book has been issued.");
                this.books[i]=null;
                return;
            }
        }
    }

    void returnBook(String book){
        addBook(book);
        System.out.println( "Thanks for returning the " + book + "book");
    }     /* There is a bug in returnBook Method, it accepts the book if you return which was not in library earlier. */

}

public class cwh_51_OnlineLibrary {
    public static void main(String[] args) {
          /* You have to implement a library using java class Library
        1. Methods: addBook, issueBook, returnBook, showAvailableBooks
        2. Properties: Array to store the available Books , Array to store the issued books
        */

        Library library = new Library();
        library.addBook("BME");
        library.addBook("BCE");
        library.addBook("M1");
        library.addBook("Engineering Graphics");
        library.addBook("Artificial Intelligence");
        library.showAvailableBooks();

        library.issueBook("M1");
        library.showAvailableBooks();

        library.returnBook("M1");
        library.showAvailableBooks();
        /* There is a bug in returnBook Method, it accepts the book if you return which was not in library earlier. */


    }
}
