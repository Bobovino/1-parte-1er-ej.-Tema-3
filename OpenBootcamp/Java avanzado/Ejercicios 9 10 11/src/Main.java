
public class Main {
    public static void main(String[] args) {
        BookIterator bookCollection = new BookIterator();
        bookCollection.create(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        bookCollection.create(new Book("Virum cui deformia placent", "Rodrigo Martínez Tabernero", 2023));
        bookCollection.create(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        bookCollection.create(new Book("1984", "George Orwell", 1949));



        while (bookCollection.hasNext()) {
            Book book = bookCollection.next();
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")");
        }

    }
}