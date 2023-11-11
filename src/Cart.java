import java.util.ArrayList;
import java.util.List;

public class Cart extends Account {
private ArrayList<Shows> showList;
private ArrayList <Books>bookList;
public Cart() {
	this.showList = new ArrayList<>();
	this.bookList =  new ArrayList<>();
}
public void addShow(Shows shows) {
	showList.add(shows);
}
public void removeShows(Shows shows) {
	showList.remove(shows);
}
public void removeBooks(Books book) {
	bookList.remove(book);
	
}
public void addBooks(Books book) {
	bookList.add(book);
}

}