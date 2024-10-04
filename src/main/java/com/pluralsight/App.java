package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Book> inventory = new ArrayList<>();
    public static void main(String[] args) {
       /* Book firstBook = new Book(1, "9780439568265", "Goosebumps");
        Book secondBook = new Book(1, "9780439568265", "Diary Of A Wimpy Kid");
        System.out.println("Book title: " + firstBook.getTitle());
        System.out.println("This book is checked out: " + firstBook.isCheckedOut());
        System.out.println(); // this eats the CLRF aka invisible characters but still there
        firstBook.checkedOut("John");
        System.out.println("This is checked out: " + firstBook.isCheckedOut());
        System.out.println("Checked out by: " + firstBook.getCheckedOutTo());
        System.out.println();

        */
        inventory.add(new Book(1, "9780439568265", "Goosebumps"));
        inventory.add(new Book(2, "9781419741852", "Diary Of A Wimpy Kid"));
        inventory.add(new Book(3, "9780142402511", "The Adventures of Captain Underpants"));
        inventory.add(new Book(4, "9780316769488", "Junie B. Jones"));
        inventory.add(new Book(5, "9780061120084", "To Kill a Mockingbird"));
        inventory.add(new Book(6, "9780061120084", "Where the Wild Things"));
        inventory.add(new Book(7, "9780061120084", "Curious George"));
        inventory.add(new Book(8, "9780061120084", "Don't Let the Pigeon Drive the Bus!"));
        inventory.add(new Book(9, "9780061120084", "The Rainbow Fish"));




        displayMenu()''







    }
}
