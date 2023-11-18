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
     	BooksList.add(new Books("In Search Of Lost time", "Marcel Proust", "Drama", 57.48 ));
     	BooksList.add(new Books("Ulysses", "James Joyce", "Drama", 57.48 ));
     	BooksList.add(new Books("Breaking Bad", "Vance Gilligan", "Drama", 57.48 ));
     	BooksList.add(new Books("Don Quixote", "Miguel de Cervantes", "Drama", 57.48 ));
     	BooksList.add(new Books("One Hundred Years Of Solitude", "abriel Garcia Marquez", "Drama", 57.48 ));
     	BooksList.add(new Books("The Great Gatsby", "F. Scott Fitzgerald", "Drama", 57.48 ));
     	BooksList.add(new Books("Moby Dick", "Herman Melville", "Drama", 57.48 ));
     	BooksList.add(new Books("War and Peace", "Leo Tolstoy", "Drama", 57.48 ));
     	BooksList.add(new Books("Hamlet", "David Simon", "Drama", 57.48 ));
     	BooksList.add(new Books("the Odyssey", "Homer", "Drama", 57.48 ));
     	BooksList.add(new Books("Madame Bovary", "Gustave Flaubert", "Drama", 57.48 ));
     	BooksList.add(new Books("The Divine Comedy", "Dante Alighieri", "Drama", 57.48 ));
     	BooksList.add(new Books("1984", "George Orwell", "Drama", 57.48 ));
     	BooksList.add(new Books("The Lord Of The Rings", "J.R.R Tolkien", "Drama", 57.48 ));
     	BooksList.add(new Books("The Catcher In the Rye", "J.D Salinger", "Drama", 57.48 ));
     	BooksList.add(new Books("Catch-22", "Joseph heller", "Drama", 57.48 ));
     	BooksList.add(new Books("The Grapes Of Wrath", "John Steinbeck", "Drama", 57.48 ));
     	BooksList.add(new Books("Possession", "A.S Byatt", "Drama", 57.48 ));
     	BooksList.add(new Books("Harry potter and the Deathly Hallows", "J.K Rowling", "Drama", 57.48 ));
     	BooksList.add(new Books("The Da Vinci Code", "Dan Moore", "Drama", 57.48 ));
     	BooksList.add(new Books("The Alchemist", "", "Drama", 57.48 ));
     	BooksList.add(new Books("The Ginge", "", "Drama", 57.48 ));
     	BooksList.add(new Books("Wolf Hall", "Hilary Mantel", "Drama", 57.48 ));
     	BooksList.add(new Books("Gilead", "Marilyne Robinson", "Drama", 57.48 ));


  


 

     	
     	//carts.addBooks(book);
     	//carts.removeBooks(book);
     }
    }
    }
 



