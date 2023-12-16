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
 * Responsibilities: This Class extends the guide class while adding on getters and setters for producer
 *
 */
public class Shows extends Guide {


		private String producer;	
	
	/**
	 * 
	 * @param title
	 * @param producer
	 * @param genre
	 * @param price
	 */
    public Shows(String title, String producer, String genre, double price)
    {
    	super(title, genre,price);
    	this.producer = producer;
    	
}
    /**
     * gets the producer of the show
     * @return producer
     */
    public String getProducer() {
    	return producer;
    }
    /**
     * sets the producer of the show
     * @param producer
     */
    public void setProducer(String producer) {
    	this.producer= producer;
    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   


    


