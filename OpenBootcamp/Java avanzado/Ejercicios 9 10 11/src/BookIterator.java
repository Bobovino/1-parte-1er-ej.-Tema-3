import java.util.ArrayList;
import java.util.Iterator;


public class BookIterator implements Iterator {
    private int position=0;
    private ArrayList<Book> BookCollection=new ArrayList<Book>();

    public void create(Book book){
        BookCollection.add(book);
    }

    @Override
    public Book next() {
        Book book=this.BookCollection.get(position);
        position++;
        return book;
    }


    @Override
    public boolean hasNext() {
        return position < this.BookCollection.size();
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    public void reset(){
        position=0;
    }
}
