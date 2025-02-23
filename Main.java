import java.util.Scanner;
public class Main {
public static void main (String []args){
    Library books=new Library();
    String i;
    boolean a=true;
while (a){
    System.out.println("please enter your option :");
    System.out.println("1. Add Book");
    System.out.println("2. Show All Books");
    System.out.println("3. Search Book by Title");
    System.out.println("4. Delete Book");
    System.out.println("5. Exit");
    Scanner myObj = new Scanner(System.in);
    i= myObj.nextLine();
    switch (i){


        case"1":
            int id,year;
            String title,author;

            System.out.println("please enter book id");
            myObj = new Scanner(System.in);
            id=myObj.nextInt();
            System.out.println("please enter book title");
            myObj = new Scanner(System.in);
            title=myObj.nextLine();
            System.out.println("please enter book author");
            myObj = new Scanner(System.in);
            author=myObj.nextLine();
            System.out.println("please enter book year");
            myObj = new Scanner(System.in);
            year=myObj.nextInt();
            books.AddBook(id,title,author,year);
            System.out.println("book added");
            break;


        case "2":
            books.Display();
            break;

        case "3":
            System.out.println("please enter book title");
            myObj = new Scanner(System.in);
            books.Search(myObj.nextLine());
            break;

        case"4":
            System.out.println("please enter book id");
            myObj = new Scanner(System.in);
            books.Delete(myObj.nextInt());
            break;

        case"5":
            a=false;
            System.out.println("thanks");
            break;

        default:System.out.println("the input not valid");

    }
}
}
}

