package homework1;

public class Book {

	public Book(int id, double price, String title, String details) {
		
		this.id = id;
		this.price = price;
		this.title = title;
		this.details = details;
		
	}
		
	private int id ; 
	private double price; 
	private String title; 
	private String details;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
		
}
