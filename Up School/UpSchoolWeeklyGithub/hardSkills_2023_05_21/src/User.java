import exceptions.BookNotFoundException;
import exceptions.DeadlineOutOfDateException;
import exceptions.ListIsEmptyException;
import exceptions.LimitOfBookExceededException;

import java.util.ArrayList;
import java.util.List;

// Kullanıcı Sınıfı: Kütüphaneyi kullanan kullanıcıları temsil edecek.
// Kullanıcılar, kitap ödünç alabilir, iade edebilir ve kütüphane kataloğunu görüntüleyebilir.
public class User {

    private List<Book> books = new ArrayList<>();
    private int limitOfBooks = 3;
    private Library library = new Library();

    public List<Book> getBooks(){
        return books;
    }

    public void borrow(int id) throws BookNotFoundException, DeadlineOutOfDateException {
        if (books.size() == limitOfBooks)
            throw new LimitOfBookExceededException("Ödünç alma limitiniz dolmuştur.");
        library.borrow(id, this);
    }

    public void giveBack(int id) throws BookNotFoundException, DeadlineOutOfDateException{
        library.giveBack(id, this);
    }

    public void list() throws ListIsEmptyException{
        if (books.isEmpty())
            throw new ListIsEmptyException("Listeniz boş şu anda.");

        for (Book book : books) {
            System.out.println(book);
        }
    }

}
