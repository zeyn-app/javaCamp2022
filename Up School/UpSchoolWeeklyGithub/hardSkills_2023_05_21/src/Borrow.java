// ödünç alınan kitapların süresini takip etmeli ve 
// süresi dolan kitaplar için uyarılar göndermeli.

import exceptions.BookNotFoundException;
import exceptions.DeadlineOutOfDateException;
import exceptions.InvalidRequestException;
import java.util.List;

public class Borrow {

    private final int maxborrowDuration = 30;
    // private LocalDate borrowDate, giveBackDate;
    private int borrowDate;//, giveBackDate;
    //private int extendingDeadLineCount = 0;
    //private int extendingDeadLineAmount = 7;

    public Borrow(){
        //setGiveBackDate(borrowDuration);
        setBorrowDate(0);
    }

    public Borrow(int borrowDate){
        setBorrowDate(borrowDate);
    }

    /*public void setGiveBackDate(int extendDate){
        giveBackDate = borrowDate + extendDate;
    }*/
    private void setBorrowDate(int borrowDate){
        this.borrowDate = borrowDate;
    }


    /*public void extendDeadline() throws InvalidRequestException {
        if(extendingDeadLineCount >= 2)
            throw new InvalidRequestException("Ödünç süresi daha fazla uzatılamaz");
        setGiveBackDate(extendingDeadLineAmount);
    }*/


    // Ödünç Alma Sınıfı: Kullanıcıların kitap ödünç alma ve iade etme işlemlerini yönetecek. DONE
    // Bu sınıf, ödünç alınan kitapların süresini takip etmeli ve süre dolan kitaplar için uyarılar göndermeli.

    // kitap ödünç alırken eğer daha önce süresi dolan kitap varsa, ödünç verme işlemi gerçekleşmesin? veya
    // kitabı iade ederken bir kitap veya ilgili kitabın süresi geçmişse hata versin?
    public void borrow(List<Book> libraryBooks, int id, List<Book> userBooks) throws BookNotFoundException, DeadlineOutOfDateException {
        Book book = find(libraryBooks, id);
        for (Book book_: userBooks) {
            isOutOfDate(book_);
        }
        userBooks.add(book);
    }

    public void giveBack(List<Book> userBooks, int id) throws BookNotFoundException, DeadlineOutOfDateException {
        for (Book book_: userBooks) {
            isOutOfDate(book_);
        }
        Book book = find(userBooks, id);
        userBooks.remove(book);
    }

    public Book find(List<Book> books, int id) throws BookNotFoundException{
        for (Book book : books) {
            if(book.getId()==id)
                return book;
        }

        throw new BookNotFoundException("Aradığınız kitap bulunamadı");
    }

    public boolean isOutOfDate(Book book) throws DeadlineOutOfDateException{
        if(maxborrowDuration < book.getBorrowedDate())
            throw new DeadlineOutOfDateException("Listenizde teslim süresi gecikmiş kitap bulunmaktadır.");
        return false;
    }
}