/**
 * @(#)MainPage.java
 *
 * Bryle John Ballon, Jasper Fatalla
 *
 * BSCS-IIB 
 * @version 1.00 2017/3/5
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainPage extends JFrame implements ActionListener
{
	private double initialValue, resultValue;
	private String tmp;
	
	/** Buttons */
	private JButton btnExit = new JButton("Exit");
	private JButton btnConvert = new JButton("Convert");
	private JButton btnClear = new JButton("Clear");
	
	/** Radio Buttons */
	ButtonGroup btnGrp = new ButtonGroup();
	ButtonGroup btnGrp2 = new ButtonGroup();
	
	private JRadioButton rdo1 = new JRadioButton("Milliliters", false);
	private JRadioButton rdo2 = new JRadioButton("Liters", false);
	private	JRadioButton rdo3 = new JRadioButton("Quarts", false);
	private	JRadioButton rdo4 = new JRadioButton("Gallons", false);
	private	JRadioButton rdo5 = new JRadioButton("Milliliters", false);
	private	JRadioButton rdo6 = new JRadioButton("Liters", false);
	private	JRadioButton rdo7 = new JRadioButton("Quarts", false);
	private	JRadioButton rdo8 = new JRadioButton("Gallons", false);
	
	/** TextFields */
	private	JTextField txtInput = new JTextField(12);
	
	/** Labels */
	private JLabel lblCenter1 = new JLabel();
	private JLabel lblCenter2 = new JLabel();
	private JLabel lblResult = new JLabel();
		
	public MainPage()
	{
		
		super("Basic Volume Converter");
		setSize(450, 300);
		setLocation(450, 270);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();

		Dimension dims = new Dimension(80, 30);
		btnClear.setPreferredSize(dims);
		btnExit.setPreferredSize(dims);
		
		
		/** Labels */
		JLabel lblTitle = new JLabel("Conversion Program");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
		lblTitle.setForeground(Color.WHITE);
		Icon icon = new ImageIcon(getClass().getClassLoader().getResource("icn.PNG"));
		JLabel lblIcon = new JLabel();
		lblIcon.setIcon(icon);
		JLabel lblFrom = new JLabel("From: ");
		JLabel lblTo = new JLabel("To: ");
		lblResult.setFont(new Font("Arial", Font.BOLD, 20));
		
		/** Panels */
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.GRAY);
		panel2.setLayout(new FlowLayout());
		panel2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
		panel3.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout());
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new BoxLayout(panel5, BoxLayout.PAGE_AXIS));
		panel5.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(new BoxLayout(panel6, BoxLayout.PAGE_AXIS));
		panel6.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel panel7 = new JPanel();
		panel7.setLayout(new FlowLayout());
		
		
		/** Adding/setting */
		con.setLayout(new BorderLayout());
		con.add(panel2, BorderLayout.NORTH);
		panel2.add(lblIcon);
		panel2.add(lblTitle);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		con.add(panel1, BorderLayout.WEST);
		panel1.add(lblFrom);
		btnGrp.add(rdo1);
		btnGrp.add(rdo2);
		btnGrp.add(rdo3);
		btnGrp.add(rdo4);
		panel1.add(rdo1);
		panel1.add(rdo2);
		panel1.add(rdo3);
		panel1.add(rdo4);
		
		con.add(panel3, BorderLayout.CENTER);
		panel3.add(panel4);
		panel4.add(lblCenter1);
		panel4.add(lblCenter2);
			
		panel3.add(txtInput);
		txtInput.setMaximumSize(txtInput.getPreferredSize());
		panel3.add(Box.createRigidArea(new Dimension(0,5)));
		panel3.add(btnConvert);
		btnConvert.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel3.add(Box.createRigidArea(new Dimension(0,5)));
		
		con.add(panel5, BorderLayout.EAST);
		panel5.add(lblTo);
		btnGrp2.add(rdo5);
		btnGrp2.add(rdo6);
		btnGrp2.add(rdo7);
		btnGrp2.add(rdo8);
		panel5.add(rdo5);
		panel5.add(rdo6);
		panel5.add(rdo7);
		panel5.add(rdo8);
		
		con.add(panel6, BorderLayout.SOUTH);
		panel6.add(lblResult);
		lblResult.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel6.add(panel7);
		panel7.add(btnClear);
		panel7.add(btnExit);
		
		/** Action/Listen Events */
		btnExit.addActionListener(this);
		btnClear.addActionListener(this);
		btnConvert.addActionListener(this);
		rdo1.addActionListener(this);
		rdo2.addActionListener(this);
		rdo3.addActionListener(this);
		rdo4.addActionListener(this);
		rdo5.addActionListener(this);
		rdo6.addActionListener(this);
		rdo7.addActionListener(this);
		rdo8.addActionListener(this);
	}
	
	
		public void actionPerformed(ActionEvent e)
		{	
			Object source = e.getSource();
			if(source == btnExit)
			{
				int reply =JOptionPane.showConfirmDialog(null, "Do you really want to exit?", "Question!", JOptionPane.YES_NO_OPTION);
				if(reply == JOptionPane.YES_OPTION)
				{
					dispose();
				}
				else
				{
					// DO NOTHING
				}
			}
			else if(source == btnClear)
			{
				btnGrp.clearSelection();
				btnGrp2.clearSelection();
				txtInput.setText("");
				lblCenter1.setText("");
				lblCenter2.setText("");
				lblResult.setText("");
				rdo1.setEnabled(true);
				rdo2.setEnabled(true);
				rdo3.setEnabled(true);
				rdo4.setEnabled(true);
				rdo5.setEnabled(true);
				rdo6.setEnabled(true);
				rdo7.setEnabled(true);
				rdo8.setEnabled(true);
			}
			else if(source == rdo1)
			{
				lblCenter1.setText("Milliliters to");
				if(rdo1.isSelected())
				{	
					if(rdo5.isSelected())
					{
						btnGrp2.clearSelection();
						lblCenter2.setText("");
					}
					rdo5.setEnabled(false);
					rdo6.setEnabled(true);
					rdo7.setEnabled(true);
					rdo8.setEnabled(true);
				}
			}
			else if(source == rdo2)
			{
				lblCenter1.setText("Liters to");
				if(rdo2.isSelected())
				{
					if(rdo6.isSelected())
					{
						btnGrp2.clearSelection();
						lblCenter2.setText("");
					}
					rdo5.setEnabled(true);
					rdo6.setEnabled(false);
					rdo7.setEnabled(true);
					rdo8.setEnabled(true);
				}
			}
			else if(source == rdo3)
			{
				lblCenter1.setText("Quarts to");
				if(rdo3.isSelected())
				{
					if(rdo7.isSelected())
					{
						btnGrp2.clearSelection();
						lblCenter2.setText("");
					}
					rdo5.setEnabled(true);
					rdo6.setEnabled(true);
					rdo7.setEnabled(false);
					rdo8.setEnabled(true);
				}
				
			}
			else if(source == rdo4)
			{
				lblCenter1.setText("Gallons to");
				if(rdo4.isSelected())
				{
					if(rdo8.isSelected())
					{
						btnGrp2.clearSelection();
						lblCenter2.setText("");
					}
					rdo5.setEnabled(true);
					rdo6.setEnabled(true);
					rdo7.setEnabled(true);
					rdo8.setEnabled(false);
				}
			}
			else if(source == rdo5)
			{
				lblCenter2.setText("Milliliters");
			}			
			else if(source == rdo6)
			{
				lblCenter2.setText("Liters");
			}
			else if(source == rdo7)
			{
				lblCenter2.setText("Quarts");
			}			
			else if(source == rdo8)
			{
				lblCenter2.setText("Gallons");
			}
			else if(source == btnConvert)
			{
				try
				{
					tmp = txtInput.getText();
					initialValue = Integer.parseInt(tmp);
					/* Conversion From Milliliters to Other Units */
					if(rdo1.isSelected() && rdo6.isSelected())
					{
						resultValue = initialValue * 0.001;
						lblResult.setText("Result: " + resultValue + " Liters");
					}
					else if(rdo1.isSelected() && rdo7.isSelected())
					{
						resultValue = initialValue * 0.000879877;
						lblResult.setText("Result: " + resultValue + " Quarts(Imperial)");
					}
					else if(rdo1.isSelected() && rdo8.isSelected())
					{
						resultValue = initialValue * 0.000219969;
						lblResult.setText("Result: " + resultValue + " Gallons(Imperial)");
					}
					/* Conversion From Liters to Other Units */
					else if(rdo2.isSelected() && rdo5.isSelected())
					{
						resultValue = initialValue * 1000;
						lblResult.setText("Result: " + resultValue + " Milliliters");
					}
					else if(rdo2.isSelected() && rdo7.isSelected())
					{
						resultValue = initialValue * 0.879877;
						lblResult.setText("Result: " + resultValue + " Quarts(Imperial)");
					}
					else if(rdo2.isSelected() && rdo8.isSelected())
					{
						resultValue = initialValue * 0.219969;
						lblResult.setText("Result: " + resultValue + " Gallons(Imperial)");
					}
					/* Conversion From Quarts to Other Units */
					else if(rdo3.isSelected() && rdo5.isSelected())
					{
						resultValue = initialValue * 1136.52;
						lblResult.setText("Result: " + resultValue + " Milliliters");
					}
					else if(rdo3.isSelected() && rdo6.isSelected())
					{
						resultValue = initialValue * 1.13652;
						lblResult.setText("Result: " + resultValue + " Liters");
					}
					else if(rdo3.isSelected() && rdo8.isSelected())
					{
						resultValue = initialValue * 0.25;
						lblResult.setText("Result: " + resultValue + " Gallons(Imperial)");
					}
					/* Conversion From Gallons to Other Units */
					else if(rdo4.isSelected() && rdo5.isSelected())
					{
						resultValue = initialValue * 4546.09;
						lblResult.setText("Result: " + resultValue + " Milliliters");
					}
					else if(rdo4.isSelected() && rdo6.isSelected())
					{
						resultValue = initialValue * 4.54609;
						lblResult.setText("Result: " + resultValue + " Liters");
					}
					else if(rdo4.isSelected() && rdo7.isSelected())
					{
						resultValue = initialValue * 4;
						lblResult.setText("Result: " + resultValue + " Quarts(Imperial)");
					}
				}				
				catch(Exception errors)
				{
					JOptionPane.showMessageDialog(null, "Please enter correct data type.");
				}
					
			}
		}
}
