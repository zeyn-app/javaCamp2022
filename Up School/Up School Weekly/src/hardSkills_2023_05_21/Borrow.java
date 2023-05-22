package hardSkills_2023_05_21;
import java.util.ArrayList;
import java.util.List;

import hardSkills_2023_05_21.Book;
import hardSkills_2023_05_21.BookNotFoundException;
import hardSkills_2023_05_21.LimitOfBookExceededException;
import hardSkills_2023_05_21.User;


// ödünç alınan kitapların süresini takip etmeli ve 
// süresi dolan kitaplar için uyarılar göndermeli.

public class Borrow {
	
	public void borrow(List<Book> books, int id) throws BookNotFoundException, LimitOfBookExceededException{
		Book book = find(books, id);
		books.add(book);
	}
	
	public void giveBack(List<Book> books, int id) throws BookNotFoundException {
		Book book = find(books, id);
		books.remove(book);
	}
	
	public Book find(List<Book> books, int id) throws BookNotFoundException{
		for (Book book : books) {
			if(book.getId()==id)
				return book;
		}
		
		throw new BookNotFoundException("Aradığınız kitap bulunamadı");
	}
	
}
