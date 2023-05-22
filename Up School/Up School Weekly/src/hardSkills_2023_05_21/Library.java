package hardSkills_2023_05_21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

	private List<Book> books = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private Borrow borrow;

	public void add(Book book) {
		books.add(book);
	}

	public boolean delete(int id) throws BookNotFoundException {
		Book book = find(id);
		return books.remove(book);
	}

	
	public Book update(int id) throws BookNotFoundException{
		Book book = find(id);
		System.out.println("Name: ");
		String name = scanner.next();
		System.out.println("Author: ");
		String author = scanner.next();
		System.out.println("Publisher: ");
		String publisher = scanner.next();
		System.out.println("PublishedYear: ");
		String publishedYear = scanner.next();
		
		book.setName(name); book.setAuthor(author);book.setPublishedYear(publishedYear);book.setPublisher(publisher);
		
		return book;
	}
	
	public Book find(int id) throws BookNotFoundException{
		for (Book book : books) {
			if(book.getId() == id)
				return book;
		}
		
		throw new BookNotFoundException("Aranılan kitap bulunamadı.");
	}
	
	public void list() throws LibraryNotFoundException{
		if(books.isEmpty())
			throw new LibraryNotFoundException("Listeniz boş şu anda.");
		
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	public void borrow(int id, User user) throws BookNotFoundException, LimitOfBookExceededException{
		Book book = find(id);
		user.borrow(book);
	}
	
	public void giveBack(int id, User user) throws BookNotFoundException {
		Book book = find(id);
		
		//user.delete(book);
	}
	
	
	
}
