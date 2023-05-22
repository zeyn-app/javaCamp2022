import exceptions.BookNotFoundException;
import exceptions.DeadlineOutOfDateException;
import exceptions.ListIsEmptyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// kitapların eklenmesi, silinmesi ve güncellenmesi gibi işlemleri gerçekleştirecek.
// Ayrıca kütüphanede bulunan kitapları listeleme,
//ödünç alma ve iade etme gibi işlemleri de yapabilecek.

public class Library {

    private List<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private Borrow borrow = new Borrow(31);

    public Library() {
        init();
    }

    public void add(Book book) {
        books.add(book);
    }

    public boolean remove(int id) throws BookNotFoundException {
        Book book = borrow.find(books, id);
        return books.remove(book);
    }


    public void update(int id) throws BookNotFoundException {
        Book book = borrow.find(books, id);
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Author: ");
        String author = scanner.next();
        System.out.println("Publisher: ");
        String publisher = scanner.next();
        System.out.println("PublishedYear: ");
        String publishedYear = scanner.next();

        book.setName(name);
        book.setAuthor(author);
        book.setPublishedYear(publishedYear);
        book.setPublisher(publisher);

        books.set(id, book);
    }

    public void list() throws ListIsEmptyException {
        if (books.isEmpty())
            throw new ListIsEmptyException("Listeniz boş şu anda.");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrow(int id, User user) throws BookNotFoundException, DeadlineOutOfDateException {
        borrow.borrow(books, id, user.getBooks());
    }

    public void giveBack(int id, User user) throws BookNotFoundException, DeadlineOutOfDateException {
        borrow.giveBack(user.getBooks(), id);
    }

    public void init() {
        Book book1 = new Book(1, "A", "A", "A", "aaaa");
        Book book2 = new Book(2, "B", "B", "B", "bbbb");
        Book book3 = new Book(3, "C", "C", "C", "cccc");
        Book book4 = new Book(4, "D", "D", "D", "dddd");
        Book book5 = new Book(5, "E", "E", "E", "eeee");
        Book book6 = new Book(6, "F", "F", "F", "ffff");
        Book book7 = new Book(7, "G", "G", "G", "gggg");
        Book book8 = new Book(8, "H", "H", "H", "hhhh");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
    }


}
