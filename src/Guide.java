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
 * Responsibilities:Abstract Guide class that shows the relationship between a Guide for Shows and Books
 *
 */


public abstract class Guide {

	private String title;  
	private String genre;
	private double price;

	/**
	 * Constructors for title, genre and price
	 * @param title
	 * @param genre
	 * @param price
	 */
	
	
	
	public Guide(String title, String genre, double price) {
		this.title = title;
		this.genre = genre;
		this.price = price;
	}
	/**
	 * Gets the title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Sets the title
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Gets the guide
	 * @return genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * sets the genre
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * get price
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * sets price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
}

