package homework1;

public class Main {

	public static void main(String[] args) {

		//Ozellik nesnesi olarak tanımladığımızı düşündüğünüz 2 örnek veriniz.
		
		Book book1 = new Book(1,50.00,"Fareler ve Insanlar","Duygu yüklü bir roman");
		Book book2 = new Book(2,40.00,"Oblomov","Miskin bir rus memurun hikayesi");
		
		Person person1 = new Person(1,"Murat","Okçu",22,"Male","757421223");
		Person person2 = new Person(1,"Ivan","Goncharov",52,"Male","757211223");
		
		
		Book[] bookArr = new Book[] {book1,book2};
		Person[] personArr = new Person[] {person1,person2};
		
		for (Book book : bookArr) {
			System.out.println(book.getId());
			System.out.println(book.getPrice());
			System.out.println(book.getTitle());
			System.out.println(book.getDetails());
			System.out.println("******************************");
		}
		
	
		for (Person person : personArr) {
			System.out.println(person.getId());
			System.out.println(person.getFirstName());
			System.out.println(person.getLastName());
			System.out.println(person.getAge());
			System.out.println(person.getGender());
			System.out.println(person.getIdNumber());
			System.out.println("******************************");
		}
		
			BookManager bookmanager = new BookManager();
			bookmanager.addStudentDiscount(book1);
			bookmanager.readTitleOfBook(book2);
	}

}
