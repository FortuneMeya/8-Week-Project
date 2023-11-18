import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Bookstore {
private JComboBox<String> bookComboBox;
private ArrayList<Books>bookList;



private JButton Add,Remove;


public  Bookstore() {
	JFrame frame = new JFrame("Bookstore");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(650,650);
	
	bookList = new ArrayList<>();
 	bookList.add(new Books("In Search Of Lost time", "Marcel Proust", "Drama", 57.48 ));
 	bookList.add(new Books("Ulysses", "James Joyce", "Drama", 57.48 ));
 	bookList.add(new Books("Breaking Bad", "Vance Gilligan", "Drama", 57.48 ));
 	bookList.add(new Books("Don Quixote", "Miguel de Cervantes", "Drama", 57.48 ));
 	bookList.add(new Books("One Hundred Years Of Solitude", "abriel Garcia Marquez", "Drama", 57.48 ));
 	bookList.add(new Books("The Great Gatsby", "F. Scott Fitzgerald", "Drama", 57.48 ));
 	bookList.add(new Books("Moby Dick", "Herman Melville", "Drama", 57.48 ));
 	bookList.add(new Books("War and Peace", "Leo Tolstoy", "Drama", 57.48 ));
 	bookList.add(new Books("Hamlet", "David Simon", "Drama", 57.48 ));
 	bookList.add(new Books("the Odyssey", "Homer", "Drama", 57.48 ));
 	bookList.add(new Books("Madame Bovary", "Gustave Flaubert", "Drama", 57.48 ));
 	bookList.add(new Books("The Divine Comedy", "Dante Alighieri", "Drama", 57.48 ));
 	bookList.add(new Books("1984", "George Orwell", "Drama", 57.48 ));
 	bookList.add(new Books("The Lord Of The Rings", "J.R.R Tolkien", "Drama", 57.48 ));
 	bookList.add(new Books("The Catcher In the Rye", "J.D Salinger", "Drama", 57.48 ));
 	bookList.add(new Books("Catch-22", "Joseph heller", "Drama", 57.48 ));
 	bookList.add(new Books("The Grapes Of Wrath", "John Steinbeck", "Drama", 57.48 ));
 	bookList.add(new Books("Possession", "A.S Byatt", "Drama", 57.48 ));
 	bookList.add(new Books("Harry potter and the Deathly Hallows", "J.K Rowling", "Drama", 57.48 ));
 	bookList.add(new Books("The Da Vinci Code", "Dan Moore", "Drama", 57.48 ));
 	bookList.add(new Books("The Alchemist", "", "Drama", 57.48 ));
 	bookList.add(new Books("The Ginge", "", "Drama", 57.48 ));
 	bookList.add(new Books("Wolf Hall", "Hilary Mantel", "Drama", 57.48 ));
 	bookList.add(new Books("Gilead", "Marilyne Robinson", "Drama", 57.48 ));
 	
 	String[] bookInfo = new String[bookList.size()];
 	for (int i = 0; i < bookList.size(); i++) {
 		Books book = bookList.get(i);
 		bookInfo[i] = book.getTitle() +"-"+ book.getAuthor() + "-" + book.getGenre() + "-$"+ book.getPrice();
 	}
bookComboBox = new JComboBox<>(bookInfo);
	Add = new JButton("Add To cart");
	Remove = new JButton("Remove from Cart");
	
	frame.add(Add);
	frame.add(Remove);
	frame.add(bookComboBox);
	frame.setVisible(true);
}
public static void main(String[] args) {
	new Bookstore();

	
}
}
