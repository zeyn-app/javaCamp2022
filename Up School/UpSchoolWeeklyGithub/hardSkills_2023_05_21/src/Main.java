import exceptions.BookNotFoundException;
import exceptions.DeadlineOutOfDateException;
import exceptions.ListIsEmptyException;
import exceptions.LimitOfBookExceededException;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Library library = new Library();
        try{
            // Güncelleme işlemi yapıldıktan sonra kullanıcı listesi güncelenmiyor?
            // kütüphane listesine aynı veriden iki tane ekleniyor?

            // System.out.println("Before give back a book");
            System.out.println("Before update a book");
            user.borrow(7);
            user.borrow(8);
            //user.borrow(2);
            //user.borrow(4);

            user.list();
            System.out.println("\n*************************************");
            library.update(7);
            user.list();
            System.out.println("\n*************************************");
            library.list();

/*
            System.out.println("\nAfter give back a book");
            //user.giveBack(2);
            user.giveBack(8);
            user.list();

            System.out.println("\nAfter give back a book that did not borrow");
            //user.giveBack(2);
            user.giveBack(8);
            user.list();

 */
        }
        catch (BookNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (LimitOfBookExceededException e){
            System.out.println(e.getMessage());
        }
        catch (DeadlineOutOfDateException e){
            System.out.println(e.getMessage());
        }
        catch (ListIsEmptyException e){
            System.out.println(e.getMessage());
        }

    }
}