package hardSkills_2023_05_21;

import java.util.ArrayList;
import java.util.List;

public class User {

	private List<Book> books = new ArrayList<>();
	private int limitOfBooks = 3;
	private Library library;

	public void borrow(Book book) throws LimitOfBookExceededException {
		if (books.size() == limitOfBooks)
			throw new LimitOfBookExceededException("Ödünç alma limitiniz dolmuştur.");
		books.add(book);
	}
	
	public void giveBack(int id) {
		books.remove(id);
	}
	
	public void list() throws LibraryNotFoundException{
		library.list();
	}

}