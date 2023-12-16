import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
 *         Responsibilities: Login class that lets user type in a specific
 *         username to get into the bookstore
 * 
 *
 */
public class Login extends JFrame implements ActionListener {

    //fields
    private JPanel login;
    private JTextField username;
    private JButton loginButton;
    private String PW;

    /**
     * Constructors
     * Checks to see if file with the password on it is present
     */
    public Login() {
        login = new JPanel();
        username = new JTextField(30);
        loginButton = new JButton("Login");

        login.add(username);
        login.add(loginButton);
        this.add(login);

        loginButton.addActionListener(this);
        
        this.setSize(250,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        if (loadPW())  {
        	new Bookstore();
        	this.dispose();
        } else {
        	this.setVisible(true);
        }
    }
    
        /**
         * The file reader goes through the file
         * @return true if the password is the same as the intended password and false if it isn't
         */
   private boolean loadPW() {
    try (BufferedReader reader = new BufferedReader(new FileReader("PW.txt"))) {
    	PW = reader.readLine();
    } catch (IOException e) {
    	e.printStackTrace();
    }
	return false;
    
    }
/**
 * If the username "CISC191" is typed then you enter the bookstore and if it isn't then you don't enter the bookstore and get a message with a hiny
 */
    @Override
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() ==loginButton) {
    		if (username.getText().equals("CISC191")) {
    			new Bookstore();
    			this.dispose();
    		}
    		else {
    			JOptionPane.showMessageDialog(this,"Wrong Password, Hint: Java Class");
    		
    		}
    	}
    }
    /**
     * The main method of the Login
     * @param args
     */

public static void main(String[] args) {
	new Login();
}
}
