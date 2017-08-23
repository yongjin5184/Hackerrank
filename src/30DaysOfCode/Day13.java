import java.util.Scanner;

/**
 * Created by yongjin on 2017-08-22.
 * Day 13: Abstract Classes
 */

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book{

    private String title;
    private String author;
    private int price;
    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    MyBook(String title, String author, int price){
        super(title, author);
        this.title = title;
        this.author = author;
        this.price = price;
    }
    /**
     *   Method Name: display
     *
     *   Print the title, author, and price in the specified format.
     **/
    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}

public class Day13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
