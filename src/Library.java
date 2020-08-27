import java.util.*;
public class Library {
	String address;
	static Library firstLibrary;
	static Library secondLibrary;
	static ArrayList <Book> firstLib;
	static ArrayList <Book> secondLib;
	Library(String _address){
		address=_address;
		}
	public static void main(String [] args) {
		firstLibrary= new Library ("Sui Gas Society");
		secondLibrary= new Library ("Walton");
		printDetails();
		firstLib=new ArrayList<Book>();
		firstLib.add(new Book("The Da Vinci Code"));
		firstLib.add(new Book("Le Petit Prince"));
		firstLib.add(new Book("A Tale of Two Cities"));
		firstLib.add(new Book("The Lord of the Rings"));
		secondLib=new ArrayList<Book>();
		booksInFirstLibrary();
		booksInSecondLibrary();
		firstLib.get(0).isBookBorrowed("The Da VinCI Code");
		firstLib.get(0).borrowBook("The Da VinCI Code");
		firstLib.get(3).borrowBook("The Lord of the Rings");
		firstLib.get(3).returned("The Lord of the Rings");
		booksInFirstLibrary();

	}
	static void printDetails() {
		System.out.println("Library Hours are as Follows:");
		System.out.println("Libraries are Open from 9am to 5pm");
		System.out.println("Libraries Addresses are as Follows:");
		System.out.println(firstLibrary.address);
		System.out.println(secondLibrary.address);
	}
	static void booksInFirstLibrary() {
		System.out.println("Available Books in First Library Are as Follows:");
		if(firstLib.size()!=0) {
			for(Book currentBook : firstLib){
				if(!currentBook.borrowed) {
					System.out.println(currentBook.getTitle());
					}
				}
			}
		else {
			System.out.println("There are no Books in this Library");
			}
		}
	static void booksInSecondLibrary() {
		System.out.println("Available Books in Second Library Are as Follows:");
		if(secondLib.size()!=0) {
			for(Book currentBook : secondLib){
				if(!currentBook.borrowed) {
					System.out.println(currentBook.getTitle());
					}
				}
			}
		else {
			System.out.println("There are no Books in this Library");
			}
		}	
	}
 