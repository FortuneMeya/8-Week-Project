import java.util.ArrayList;
/**
 * 
 * Lead Author(s):
 * @author Fortune Meya
 * References :
 * 
 *         Downey, Allen B. “Think Data Structures: Algorithms and Information Retrieval in Java.” Green Tea Press, 2016
 *         https://greenteapress.com/thinkdast/html/index.html
 *         Version date:12/15
 * 
 *         Krzysztof Kowalczyk "Essential Java a free Java programming book. (n.d.)."
 *         https://www.programming-books.io/essential/java/ 
 *         Version date 12/15
 * 
 * Responsibilities:Books class that extends Guide class and has information about title, author, and price of books.
 *
 */

public class Books extends Guide {


		private String author;	
		
	/**
	 * 
	 * @param title
	 * @param author
	 * @param genre
	 * @param price
	 */
		
    public Books(String title, String author, String genre, double price)
    {
    	super(title, genre,price);
    	this.author = author;
    	
}
    /**
     * gets the author
     * @return the author
     */
    public String getAuthor() {
    	return author;
    }
    /**
     * sets the author
     * @param Author
     */
    public void setAuthor(String Author) {
    	this.author= Author;
    }
    /**
     * gets the price
     * @return the price 
     */
    public double getPirce() {
    	return super.getPrice();
    }
    
   
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

