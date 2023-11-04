import java.util.ArrayList;
import java.util.List;

public class Cart extends Account {

private Account account;
private List<Books>Books;
private List<Shows>shows;
private ArrayList Shows;

public Cart(Account account) {
	this.account = account;
	this.Books = new ArrayList<>();
	this.shows = new ArrayList<>();
	
}
	public void removeBook(Books book) {
		Books.remove(book);
	}

}
