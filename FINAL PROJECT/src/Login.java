import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

    //fields
    private JPanel login;
    private JTextField username;
    private JButton loginButton;

    //constructors
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
        this.setVisible(true);
    }

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

public static void main(String[] args) {
	new Login();
}
}
