package mig;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import net.miginfocom.swing.*;

public class FormLogin {
	JFrame j = new JFrame();
	JLabel lblUsername = new JLabel("Username:");
	JLabel lblPassword = new JLabel("Password");
	JTextField txtUsername = new JTextField(20);
	JPasswordField txtPassword = new JPasswordField(20);
	JButton btnLogin = new JButton("Login");
	
	JPanel panelUsername = new JPanel();
	JPanel panelPassword = new JPanel();
	JPanel panelLogin = new JPanel();
	public FormLogin() {
		j.setTitle("Form Login");
		j.setSize(260, 110);
		j.setResizable(false);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setLayout(new MigLayout());
		
		//User name
		j.add(lblUsername);
		j.add(txtUsername, "wrap");
		//User password
		j.add(lblPassword);
		j.add(txtPassword, "wrap");
		//Login button
		j.add(btnLogin);
		
		j.setVisible(true);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		FormLogin app = new FormLogin();
	}

}
