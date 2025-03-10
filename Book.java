public class Book {
    private int id;
    private String title;
    private String author;
    private int year;

    public Book(){
        setId(-1);
        setAuthor("none");
        setTitle("none");
        setYear(-9999);
    }

    public Book( int id,String title,String author,int year){
        setId(id);
        setAuthor(author);
        setTitle(title);
        setYear(year);
    }
    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setYear(int year){
        this.year=year;
    }



}
