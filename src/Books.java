import java.util.ArrayList;

public class Books extends Guide {


		private String author;	
		
	
    public Books(String title, String author, String genre, double price)
    {
    	super(title, genre,price);
    	this.author = author;
    	
}
    public String getAuthor() {
    	return author;
    }
    
    public void setAuthor(String Author) {
    	this.author= Author;
    }
   
    
    public class Mainm{
     public static void main(String[] args) {
     	Cart carts = new Cart();
     	ArrayList<Books> BooksList = new ArrayList<>();
     	BooksList.add(new Books("The Wire", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("The Sopranos", "David Chase", "Drama", 57.48 ));
     	BooksList.add(new Books("Breaking Bad", "Vance Gilligan", "Drama", 57.48 ));
     	BooksList.add(new Books("Snowfall", "Nicolas Stern", "Drama", 57.48 ));
     	BooksList.add(new Books("The Boondocks", "", "Drama", 57.48 ));
     	BooksList.add(new Books("Avatar:Last Airbender", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("Miami Vice", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("Survivor", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("Big Brother", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("Planet Earth", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("Chenobyl", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("Stranger Things", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("Dark", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("Lost", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("The Twilight Zone", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("Suits", "David Simon", "Drama", 57.48 ));
     	
     	for (int i =0; i < BooksList.size(); i++) {
     		Books book =  BooksList.get(i);
     	
     	carts.addBooks(book);
     	carts.removeBooks(book);
     }
    }
    }
 }



