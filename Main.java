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
    System.out.println("4. Delete Book By id");
    System.out.println("5. Exit");
    System.out.println("   ---------------------");
    Scanner myObj = new Scanner(System.in);
    i= myObj.nextLine();
    switch (i){


        case"1":
            int id=-1,year=-1;
            String title=null,author=null;

                System.out.println("please enter book id");
                while(id==-1){
                    try {
                        myObj = new Scanner(System.in);
                        id=myObj.nextInt();
                    } catch (Exception e) {
                        System.out.println("input not valid");
                        System.out.println("please enter an valid input");
                    }
                }


            System.out.println("please enter book title");
                while(title==null) {
                    try {
                        myObj = new Scanner(System.in);
                        title = myObj.nextLine();
                    } catch (Exception e) {
                        System.out.println("input not valid");
                        System.out.println("please enter an valid input");
                    }
                }

            System.out.println("please enter book author");
                while (author==null)
                {
                    try{
                        myObj = new Scanner(System.in);
                        author=myObj.nextLine();
                    } catch (Exception e) {
                        System.out.println("input not valid");
                        System.out.println("please enter an valid input");
                    }

                }

            System.out.println("please enter book year");
                while(year==-1){
                    try {
                        myObj = new Scanner(System.in);
                        year = myObj.nextInt();
                    } catch (Exception e) {
                        System.out.println("input not valid");
                        System.out.println("please enter an valid input");
                    }
                }

            books.AddBook(id,title,author,year);
            System.out.println("book added");
            break;


        case "2":
            books.Display();
            break;

        case "3":
            System.out.println("please enter book title");
            try {
                myObj = new Scanner(System.in);
                books.Search(myObj.nextLine());
            } catch (Exception e) {
                System.out.println("input not valid");
            }
            break;

        case"4":
           int d=-1;
            System.out.println("please enter book id");
            while (d==-1){
                try{
                    myObj = new Scanner(System.in);
                    d=myObj.nextInt();
                    books.Delete(d);
                } catch (Exception e) {
                    System.out.println("input not valid");
                    System.out.println("please enter an valid input");
                }
            }

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

