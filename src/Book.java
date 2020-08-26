public class Book {
	String title;
	boolean borrowed=false;
	public Book(String bookTitle){
		title= bookTitle;
	}
	public String getTitle() {
			return title;
	}
	public void isBookBorrowed(String bookTitle) {
		if(!borrowed) {
			System.out.println(bookTitle+" is availale in our library");
		}
		else {
			System.out.println(bookTitle+" is already borrowed");
		}
	}
	public void borrowBook(String bookTitle) {
		if(!borrowed) {
	System.out.println("You successfully borrowed "+ bookTitle);
	borrowed=true;
		}
		else {
			System.out.println(bookTitle+" is already borrowed");
		}
	}
	public void returned(String bookTitle) {
		borrowed=false;
		System.out.println("You successfully returned "+ bookTitle);
	}
	
}
