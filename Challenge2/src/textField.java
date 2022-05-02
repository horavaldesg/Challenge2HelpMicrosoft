package Challenge2.src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class textField implements ActionListener
{
	static JTextField t;
	
	static JFrame f;
	
	static JButton b;
	
	static JLabel l;
	

	public textField() 
	{
	}
	
	public static void main(String[] args)
	{
		f = new JFrame("Text Field");
		
		l = new JLabel("Nothing Entered");
		
		b = new JButton("Submit");
		
		textField value = new textField();
		
		b.addActionListener(value);
		
		t = new JTextField("Enter the Text", 16);
		
		JPanel p = new JPanel();
		
		p.add(t);
		p.add(b);
		p.add(l);
		
		f.add(p);
		
		f.setSize(300, 300);
		
		f.show();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("submit"))
		{
			l.setText(t.getText());
			
			t.setText("  ");
		}
	}
	
	
	

}
