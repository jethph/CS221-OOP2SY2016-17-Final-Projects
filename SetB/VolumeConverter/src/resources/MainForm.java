/**
 * @(#)MainForm.java
 *
 * Bryle John Ballon, Jasper Fatalla
 *
 * BSCS-IIB 
 * @version 1.00 2017/3/5
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainForm extends JFrame implements intGlobalVars
{
	public MainForm()
	{
		super("Login");
		setSize(270, 200);
		setResizable(false);
		
		setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("bg.png"))));
		
		setLocation(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel lblUser = new JLabel("Username: ");
		lblUser.setFont(new Font("Arial", Font.BOLD, 16));
		lblUser.setForeground(Color.white);
		JLabel lblPass = new JLabel("Password: ");
		lblPass.setFont(new Font("Arial", Font.BOLD, 16));
		lblPass.setForeground(Color.white);
		
		JTextField txtUser = new JTextField(12);
		JPasswordField txtPass = new JPasswordField(12);
		txtPass.setEchoChar('*');
		
		JButton btnLogin = new JButton("Login");
		JButton btnExit = new JButton("Exit");
		
		setLayout(new FlowLayout());
		
		add(lblUser);
		add(txtUser);
		add(lblPass);
		add(txtPass);
		add(btnLogin);
		add(btnExit);
		
		btnLogin.addActionListener(new ActionListener() 
			{
          		public void actionPerformed(ActionEvent ae) 
          		{
          			try
          			{
          				String tmpUser, tmpPass;
            			tmpUser = txtUser.getText();
            			tmpPass = txtPass.getText();
            			if(tmpUser.equals(Username) && tmpPass.equals(Password))
            			{
            				dispose();
            				MainPage opener = new MainPage();
            				opener.setVisible(true);
            			
            			}
            			else
            			{
            				JOptionPane.showMessageDialog(null,   "Invalid Username or Password!");
            			}
          			}
          			catch(Exception mistake)
          			{
          				System.out.print("Please enter a Username or Password!");
          			}
            		
          		}
			});
			
			btnExit.addActionListener (new ActionListener() 
			{
          		public void actionPerformed(ActionEvent ae) 
          		{
            		int response = JOptionPane.showConfirmDialog(null, "Do you really want to exit?", "Question:", JOptionPane.YES_NO_OPTION);
					if(response == JOptionPane.YES_OPTION)
					{
						dispose();
					}
					else
					{
						//DO NOTHING
					}
            		
            	}
			});
	}

}
