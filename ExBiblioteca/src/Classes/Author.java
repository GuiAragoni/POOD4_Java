package Classes;
import java.util.ArrayList;

public class Author {
    private String name;
    ArrayList<Book> book = new ArrayList<>();

    public ArrayList<Book> getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book.add(book);
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
