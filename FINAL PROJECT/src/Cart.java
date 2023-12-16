import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Lead Author(s):
 * 
 * @author Fortune Meya References :
 * 
 *         Downey, Allen B. “Think Data Structures: Algorithms and Information
 *         Retrieval in Java.” Green Tea Press, 2016
 *         https://greenteapress.com/thinkdast/html/index.html 
 *         Version date:12/15
 * 
 *         Krzysztof Kowalczyk "Essential Java a free Java programming book. (n.d.)." 
 *         https://www.programming-books.io/essential/java/ 
 *         Version date 12/15
 * 
 *         Responsibilities: The Cart class stores the books and shows that are
 *         adding to the cart as long as it is maximum 10 books
 *
 */
public class Cart extends Account {
private ArrayList<Shows> showList;
private ArrayList <Books>bookList;
private static final int MAX_CART_SIZE =10;
/**
 * Intializing showList and bookList
 */
public Cart() {
	this.showList = new ArrayList<>();
	this.bookList =  new ArrayList<>();
}
/**
 * Adds show
 * @param shows
 */
public void addShow(Shows shows) {
	showList.add(shows);
}
/**
 * Removes show
 * @param shows
 */
public void removeShows(Shows shows) {
	showList.remove(shows);
}
/**
 * Adds books
 * @param book
 * @throws Exception if the cart exceeds the limit of 10 books
 */
public void addBooks(Books book) throws Exception {
		if (bookList.size()>= MAX_CART_SIZE) {
			throw new Exception("Cart Is full");
		}
				bookList.add(book);
			
		
}
/**
 * removes books
 * @param book
 */
		public void removeBooks(Books book)  {

			
			bookList.remove(book);
			
		}
		/**
		 * 
		 * @return Lists of books that are in the cart
		 */
		public List<Books> getBookList() {
			return new ArrayList<>(bookList);
		}
}

	