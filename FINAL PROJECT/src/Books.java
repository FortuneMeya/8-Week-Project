
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
   
    	Books book1 = new Books("Ugly Love", "Colleen Hoover", "Romance", 9.79 );
    	Books book2 = new Books("Bully", "Penelope Douglas", "Romance", 11.29);
    	Books book3 = new Books("It Ends With Us", "Collen Hoover", "Romance",10.39);
		/*
		 * Books book4 = new Books("Ugly Love", "Colleen Hoover", "Romance", 9.79 );
		 * Books book5 = new Books("Ugly Love", "Colleen Hoover", "Romance", 9.79 );
		 * Books book6 = new Books("Ugly Love", "Colleen Hoover", "Romance", 9.79 );
		 * Books book7 = new Books("Ugly Love", "Colleen Hoover", "Romance", 9.79 );
		 * Books book8 = new Books("Ugly Love", "Colleen Hoover", "Romance", 9.79 );
		 * Books book9 = new Books("Ugly Love", "Colleen Hoover", "Romance", 9.79 );
		 */



    	
    }
   }


public static void remove(Books book) {
	// TODO Auto-generated method stub
	
}
}

    


