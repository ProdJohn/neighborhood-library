package com.pluralsight;

public class Book {
    public static void main(String[] args) {

    }
        private int id;
        private String isbn;
        private String title;
        private boolean isCheckedOut;
        private String checkedOutTo;
        public Book(int id, String isbn, String title) {
            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = false; //did false because boolean value so nothing checked out yet
            this.checkedOutTo = null; // start off with null because nobody checked out yet
        }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkedOut(String name) {
            if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println(title + " was checked out to: " + name);
            }else{
            System.out.println(title + " is already checked out to " + checkedOutTo + "-");
            }
        }
    public void checkedIn() {
        if (isCheckedOut) {
        System.out.println(title + "has been returned by " + checkedOutTo + ".");
        isCheckedOut = false;
        checkedOutTo = null;
        } else {
            System.out.println(" is not currently checked out. ");
        }
    }

}

