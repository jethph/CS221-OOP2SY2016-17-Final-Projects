import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import javax.swing.border.*;

public class lengthConvert extends JFrame implements ActionListener {

	private JTextField cmText = new JTextField(6);
	private JLabel cmLabel = new JLabel("Cm");
	private JButton cmToInchButton = new JButton(" Convert --> ");
	private JButton inchToCmButton = new JButton(" <-- Convert ");
	private JPanel cmInchButtons = new JPanel();
	private JTextField inchText = new JTextField(6);
	private JLabel inchLabel = new JLabel("Inches");
	private JPanel cmInchPanel = new JPanel();

	private JTextField mText = new JTextField(6);
	private JLabel mLabel = new JLabel("Meters");
	private JButton mTofTButton = new JButton(" Convert --> ");
	private JButton fTTomButton = new JButton(" <-- Convert ");
	private JPanel fTmButtons = new JPanel();
	private JTextField fTText = new JTextField(6);
	private JLabel fTLabel = new JLabel("Feet"); 
	private JPanel fTmPanel = new JPanel();

	private JTextField kmText = new JTextField(6);
	private JLabel kmLabel = new JLabel("Km");
	private JButton kmToMileButton = new JButton(" Convert --> ");
	private JButton mileToKmButton = new JButton(" <-- Convert ");
	private JPanel mileKmButtons = new JPanel();
	private JTextField mileText = new JTextField(6);
	private JLabel mileLabel = new JLabel("Miles "); 
	private JPanel mileKmPanel = new JPanel();

	public static void main(String[] args) {
		new lengthConvert();
	}

	public lengthConvert() {
		cmInchButtons.setLayout(new BorderLayout());
		cmInchButtons.add("North", cmToInchButton);
		cmInchButtons.add("South", inchToCmButton);
		cmInchPanel.add(cmText);
		cmInchPanel.add(cmLabel);
		cmInchPanel.add(cmInchButtons);
		cmInchPanel.add(inchText);
		cmInchPanel.add(inchLabel);

		fTmButtons.setLayout(new BorderLayout());
		fTmButtons.add("North", mTofTButton);
		fTmButtons.add("South", fTTomButton);
		fTmPanel.add(mText);
		fTmPanel.add(mLabel);
		fTmPanel.add(fTmButtons);
		fTmPanel.add(fTText);
		fTmPanel.add(fTLabel);

		mileKmButtons.setLayout(new BorderLayout());
		mileKmButtons.add("North", kmToMileButton);
		mileKmButtons.add("South", mileToKmButton);
		mileKmPanel.add(kmText);
		mileKmPanel.add(kmLabel);
		mileKmPanel.add(mileKmButtons);
		mileKmPanel.add(mileText);
		mileKmPanel.add(mileLabel);

		add(cmInchPanel);
		add(fTmPanel);
		add(mileKmPanel);

		cmToInchButton.setBorder(new BevelBorder(BevelBorder.RAISED));
		inchToCmButton.setBorder(new BevelBorder(BevelBorder.RAISED));
		mTofTButton.setBorder(new BevelBorder(BevelBorder.RAISED));
		fTTomButton.setBorder(new BevelBorder(BevelBorder.RAISED));
		kmToMileButton.setBorder(new BevelBorder(BevelBorder.RAISED));
		mileToKmButton.setBorder(new BevelBorder(BevelBorder.RAISED));

		cmToInchButton.addActionListener(this);
		inchToCmButton.addActionListener(this);
		mTofTButton.addActionListener(this);
		fTTomButton.addActionListener(this);
		kmToMileButton.addActionListener(this);
		mileToKmButton.addActionListener(this);

		setTitle("Convert Length");
		setLayout(new FlowLayout());
		setSize(320,300);
		setLocation(200,200);
		setVisible(true);
		}
	public void actionPerformed(ActionEvent e) {
		double d;
		String s;
		DecimalFormat df = new DecimalFormat("0.000");

		if(e.getSource() == cmToInchButton) {
			s = cmText.getText();
			d = Double.parseDouble(s);
			d = d / 2.54;
			s = df.format(d);
			inchText.setText(s);
		}
		if (e.getSource() == inchToCmButton){
			s = new String(inchText.getText());
			d = Double.parseDouble(s);
			d = d * 2.54;
			s = df.format(d);
			cmText.setText(s);
		}
		if (e.getSource() == mTofTButton){
			s = new String(mText.getText());
			d = Double.parseDouble(s);
			d = d / 0.3048;
			s = df.format(d);
			fTText.setText(s);
		}
		if (e.getSource() == fTTomButton){
			s = new String(fTText.getText());
			d = Double.parseDouble(s);
			d = d * 0.3048;
			s = df.format(d);
			mText.setText(s);
		}
		if (e.getSource() == kmToMileButton){
			s = new String(kmText.getText());
			d = Double.parseDouble(s);
			d = d / 1.609;
			s = df.format(d);
			mileText.setText(s);
		}
		if (e.getSource() == mileToKmButton){
			s = new String(mileText.getText());
			d = Double.parseDouble(s);
			d = d * 1.609;
			s = df.format(d);
			kmText.setText(s);
		}
	}
}
