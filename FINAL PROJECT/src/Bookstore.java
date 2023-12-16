import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Lead Author(s):
 * 
 * @author Fortune Meya References :
 * 
 *         Downey, Allen B. “Think Data Structures: Algorithms and Information
 *         Retrieval in Java.” Green Tea Press, 2016
 *         https://greenteapress.com/thinkdast/html/index.html Version
 *         date:12/15
 * 		   
 *         Krzysztof Kowalczyk "Essential Java a free Java programming book. (n.d.)."
 *         https://www.programming-books.io/essential/java/ 
 *         Version date 12/15
 *         Responsibilities: Bookstore class that creates a GUI to place the
 *         information of the books
 * 
 *
 */
public class Bookstore {
	private JComboBox<String> bookComboBox;
	private ArrayList<Books> bookList;

	private JButton Add, Remove;
	private Cart cart;

	/***
	 * Creating a 650 x 650 Bookstore GUI.
	 */
	public Bookstore() {
		JFrame frame = new JFrame("Bookstore");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650, 650);

		bookList = new ArrayList<>();
		cart = new Cart();
		// Adding book titles through Arraylist.
		bookList.add(new Books("In Search Of Lost time", "Marcel Proust", "Drama", 57.48));
		bookList.add(new Books("Ulysses", "James Joyce", "Drama", 57.48));
		bookList.add(new Books("Breaking Bad", "Vance Gilligan", "Drama", 57.48));
		bookList.add(new Books("Don Quixote", "Miguel de Cervantes", "Drama", 57.48));
		bookList.add(new Books("One Hundred Years Of Solitude", "abriel Garcia Marquez", "Drama", 57.48));
		bookList.add(new Books("The Great Gatsby", "F. Scott Fitzgerald", "Drama", 57.48));
		bookList.add(new Books("Moby Dick", "Herman Melville", "Drama", 57.48));
		bookList.add(new Books("War and Peace", "Leo Tolstoy", "Drama", 57.48));
		bookList.add(new Books("Hamlet", "David Simon", "Drama", 57.48));
		bookList.add(new Books("the Odyssey", "Homer", "Drama", 57.48));
		bookList.add(new Books("Madame Bovary", "Gustave Flaubert", "Drama", 57.48));
		bookList.add(new Books("The Divine Comedy", "Dante Alighieri", "Drama", 57.48));

		// Array that will be useful when adding the information into the JComboBox
		String[] bookInfo = new String[bookList.size()];
		for (int i = 0; i < bookList.size(); i++) {
			Books book = bookList.get(i);
			bookInfo[i] = book.getTitle() + "-" + book.getAuthor() + "-" + book.getGenre() + "-$" + book.getPrice();
		}
		// Creating JCombox and getting the adding the information of the books from the
		// bookInfo Array
		bookComboBox = new JComboBox<>(bookInfo);
		Add = new JButton("Add To Cart");
		Remove = new JButton("Remove from Cart");

		// Making it fancy with colors and size
		Add.setBackground(Color.GREEN);
		Remove.setBackground(Color.RED);
		Add.setOpaque(true);
		Remove.setOpaque(true);

		Dimension buttonSize = new Dimension(100, 100);
		Add.setPreferredSize(buttonSize);
		Remove.setPreferredSize(buttonSize);

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(Add);
		buttonPanel.add(Remove);

		JPanel filterPanel = new JPanel();
		JLabel genreLabel = new JLabel("Genre");

		// Adding my filterPanel and genrePanel
		frame.setLayout(new BorderLayout());
		frame.add(filterPanel, BorderLayout.NORTH);
		frame.add(buttonPanel, BorderLayout.CENTER);
		frame.add(bookComboBox, BorderLayout.SOUTH);
		frame.setVisible(true);

		// Adding an ActionListener for the Add JButton that adds the book that is
		// selected from the JComboBox
		// Utilizes exception handling when the max number of book is reached and
		// returns an error message
		Add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = bookComboBox.getSelectedIndex();
				Books selectedBook = bookList.get(selectedIndex);
				try {
					cart.addBooks(selectedBook);
					System.out.println("Book has been added:" + selectedBook.getTitle() + selectedBook.getPrice());
				} catch (Exception toomany) {
					System.out.println("Error:" + toomany.getMessage());
				}

			}
		});
//Adding an ActionListener for the Remove button that removes the selected book in the JComboxBox
		Remove.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = bookComboBox.getSelectedIndex();
				Books selectedBook = bookList.get(selectedIndex);

				cart.removeBooks(selectedBook);

				System.out.println("Book has been removed:" + selectedBook.getTitle());

			}
		});

	}

	/**
	 * The main method Catches exception
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		try {
			new Bookstore();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
