import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import javax.swing.border.*;

public class lengthConvert extends JFrame implements ActionListener {

	private JTextField len1Text = new JTextField(6);
	private JPanel lenPanel = new JPanel();
	private JLabel updateLabel = new JLabel();

	public static void main(String[] args) {
		new lengthConvert();
	}
	public lengthConvert(){
		String[] lenStrings = { "Meters to Centimeters", "Meters to Inch", "Meters to Feet", "Meters to Yard", "Meters to Miles",  
								"Centimeters to Meters", "Centimeters to Inch", "Centimeters to Yard", "Centimeters to Feet", "Centimeters to Miles", 
								"Inch to Meters", "Inch to Centimeters", "Inch to Feet", "Inch to Yard", "Inch to Miles", 
								"Feet to Meters", "Feet to Centimeters", "Feet to Inch", "Feet to Yard", "Feet to Miles", 
								"Yard to Meters" , "Yard to Centimeters" , "Yard to Inch" , "Yard to Feet" , "Yard to Miles" , 
								"Miles to Meters" , "Miles to Centimeters" , "Miles to Inch" , "Miles to Feet" , "Miles to Yard"};

		JComboBox<String> lenList = new JComboBox<String>(lenStrings);
		//lenList.setSelectedIndex(4);
		lenList.addActionListener(this);

		lenPanel.setLayout(new BoxLayout(lenPanel, BoxLayout.Y_AXIS));
		lenPanel.add(lenList);
		lenPanel.add(len1Text);
		lenPanel.add(updateLabel);

		add(lenPanel);

		setTitle("Convert Length");
		setLayout(new FlowLayout());
		setSize(320,300);
		setLocation(200,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox)e.getSource();
        String lenName = (String)cb.getSelectedItem();
		double d;
		String s;
		DecimalFormat df = new DecimalFormat("0.000000000");

		if(lenName == "Meters to Centimeters") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 100;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Meters to Inch") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 39.3701;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Meters to Feet") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 3.28084;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Meters to Yard") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 1.09361;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Meters to Miles") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 1609.344;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Centimeters to Meters") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 100;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Centimeters to Inch") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 2.54;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Centimeters to Feet") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 30.48;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Centimeters to Yard") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 91.44;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Centimeters to Miles") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 160934;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Inch to Meter") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 39.3701;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Inch to Centimeters") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 2.54;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Inch to Feet") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 12;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Inch to Yard") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 36;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Inch to Miles") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 63360;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Feet to Meter") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 3.28084;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Feet to Centimeters") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 30.48;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Feet to Inch") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 12;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Feet to Yard") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 3;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Feet to Miles") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 5280;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Yard to Meter") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 1.09361;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Yard to Centimeters") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 91.44;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Yard to Inch") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 36;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Yard to Feet") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 3;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Yard to Miles") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d / 1760;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Miles to Meters") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 1609.344;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Miles to Centimeters") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 160934;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Miles to Inch") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 63360;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Miles to Feet") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 5280;
			s = df.format(d);
			updateLabel.setText(s);
		}

		if(lenName == "Miles to Yard") {
			s = len1Text.getText();
			d = Double.parseDouble(s);
			d = d * 1760;
			s = df.format(d);
			updateLabel.setText(s);
		}
	}
}
