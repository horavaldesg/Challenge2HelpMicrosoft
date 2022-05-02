


import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.filechooser.FileSystemView;

public class UserLogin 
{
	public UserLogin()
	{
		JLabel lblUName = new JLabel("Username");
		JTextField tfUName = new JTextField(20);
		lblUName.setLabelFor(tfUName);
		JLabel lblPWord = new JLabel("Password");
		JTextField tfPWord = new JTextField(20);
		lblPWord.setLabelFor(tfPWord);
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		panel.add(lblUName);
		panel.add(tfUName);
		panel.add(lblPWord);
		panel.add(tfPWord);
	}

}
