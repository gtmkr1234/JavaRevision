import java.util.Scanner;

public class book {
    int bookid;
    String bookname;
    int pages;
    int price;
    book(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the book id ");
        bookid = s.nextInt();
        System.out.println("Enter the name of the book");
        bookname = s.next();
        System.out.println("Enter the no. of pagers of the book");
        pages = s.nextInt();
        System.out.println("Enter the price of the book");
        price = s.nextInt();
    }

    public void showDetails(){
        System.out.println("Book id is "+ bookid);
        System.out.println("Bookname is " + bookname);
        System.out.println("The book has " + pages + "number of pages");
        System.out.println("the price of the book is " + price);
    }

    public static void main(String[] args) {
    book []arr = new book[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the details of the book number %d",i+1);
            arr[i]= new book();
            System.out.println();
        }

    }
}
