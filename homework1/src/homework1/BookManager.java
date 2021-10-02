package homework1;

public class BookManager {

	public void readTitleOfBook(Book book) {
		System.out.println("Title of the book is: " + book.getTitle());
	}
	
	public void addStudentDiscount(Book book) {
		System.out.println("Student discount applied, new price: " + book.getPrice()*70/100);
	}
	
	
}
