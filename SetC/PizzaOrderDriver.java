import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
  
public class PizzaOrderDriver
{  
 
   public static void main(String[] args)        
   {  
    
      JCheckBox show1;
      JLabel label1;
      JFrame frame = new JFrame();
      JPanel container = new JPanel();
      frame.add(container);
      frame.setTitle("Pizza Order");
 
      String labels[] = { "10 Inch", "12 Inch", "14 Inch", "16 Inch"};
      JLabel firstLabel = new JLabel("Size");
      JComboBox comboBox1 = new JComboBox(labels);
      container.add(firstLabel);
      container.add(comboBox1);
       
      String labels2[] = { "Hand-Tossed", "Deep-Dish", "Thin-Crust"};
      JLabel secondLabel = new JLabel("Type of Crust");
      JComboBox comboBox2 = new JComboBox(labels2);
      container.add(secondLabel);
      container.add(comboBox2);
 
      JLabel thirdLabel = new JLabel("Toppings:                                                                        ");
      container.add(thirdLabel);
      final JRadioButton oneRadio = new JRadioButton("1 Topping");    
      container.add(oneRadio);
      final JRadioButton twoRadio = new JRadioButton("2 Toppings");
      container.add(twoRadio);
      final JRadioButton threeRadio = new JRadioButton("3 Toppings"); 
      container.add(threeRadio);
      final JRadioButton fourRadio = new JRadioButton("4 Toppings");
      container.add(fourRadio);
      final JRadioButton fiveRadio = new JRadioButton("5 Toppings");    
      container.add(fiveRadio);
      ButtonGroup group = new ButtonGroup();
      group.add(oneRadio);
      group.add(twoRadio);
      group.add(threeRadio);
      group.add(fourRadio);
      group.add(fiveRadio);
       
      JLabel fourth1Label = new JLabel("Enter Which Toppings (Seperated By Comma)");
      JTextField Name1 = new JTextField(25);
      container.add(fourth1Label);
      container.add(Name1);
       
      JLabel fourthLabel = new JLabel("Name");
      JTextField Name = new JTextField(25);
      container.add(fourthLabel);
      container.add(Name);
       
      JButton button = new JButton("Submit");
      container.add(button);
       
      JButton button1 = new JButton("Reset");
      container.add(button1);
       
      JPanel southPanel = new JPanel();
      final JLabel label = new JLabel("Your total price");
      southPanel.add(label);
      frame.add(label, BorderLayout.SOUTH);
 
 
      frame.setSize(325, 500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
class Listener implements ActionListener
{
    public void actionPerformed(ActionEvent e) 
    {
      Object selected = comboBox1.getSelectedItem();
         if (selected.toString().equals("10 Inch"))
            {
               double price1 = 10.79;
               System.out.println("pop");
            }
             
         else  if (selected.toString().equals("12 Inch"))
            {
               double price1 = 12.79;
            }
             
         else  if (selected.toString().equals("14 Inch"))
            {
               double price1 = 14.79;
            }
          
         else  if (selected.toString().equals("16 Inch"))
            {
               double price1 = 16.79;
            }
             
      Object selected1 = comboBox2.getSelectedItem();
         if (selected1.toString().equals("Deep-Dish"))
            {
               String crust = "Deep-Dish";
            }
         else if(selected1.toString().equals("Hand-Tossed"))
            {
               String crust = "Hand-Tossed";
            }         
         else if(selected1.toString().equals("Thin-Crust"))
            {
               String crust = "Thin-Crust";
            }
       
 class ClickListener implements ActionListener 
      {
         public void actionPerformed(ActionEvent event)
         {  
 
          if(oneRadio.isSelected())
            {
               double price = 1.75;
               label.setText("Freshman");
                
            }
          else if(twoRadio.isSelected())
            {
               double price = 3.50;
            }
          else if(threeRadio.isSelected())
            {
               double price = 5.25;
            }
          else if(fourRadio.isSelected())
            {
               double price = 7.00;
            }
          else if(fiveRadio.isSelected())
            {
               double price = 8.75;
            }
    
    }
    }
    ActionListener listener = new ClickListener(); 
    button.addActionListener(listener);  
       
    } 
 
      
}
}
}