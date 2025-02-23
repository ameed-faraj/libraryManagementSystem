import java.util.ArrayList;
import java.util.Objects;

public class Library {
    ArrayList<Book> books=new ArrayList<Book>();

    public void AddBook(int id,String title,String author,int year){
        Book newBook=new Book(id,title,author,year);
        books.add(newBook);
    }
    public void Display(){
        for(Book book:books){
            System.out.println(" book id : "+book.getId());
            System.out.println(" book title : "+book.getTitle());
            System.out.println(" book author : "+book.getAuthor());
            System.out.println(" book year : "+book.getYear());
            System.out.println("---------------------------------");
        }

    }
    public void Search(String title){
        for (Book i:books){
            if(Objects.equals(i.getTitle(), title)){
                System.out.println("------the book found------ ");
                return;
            }

        }
        System.out.println("------book not found------");

    }
    public void Delete(int id){
        for (int i =0;i<books.size();i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                System.out.println("------the book Deleted------");
                return;
            }
        }
        System.out.println("------book not found------");

    }



}
