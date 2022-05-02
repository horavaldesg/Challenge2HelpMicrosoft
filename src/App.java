
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class App extends JFrame implements ActionListener{
	
	String userUsername;
	String userPassword;
	
	
	Container container = getContentPane();
	JLabel userLabel = new JLabel("Username");
	JLabel passwordLabel = new JLabel("Password");
	JTextField userTextField = new JTextField();
	JTextField passwordTextField = new JTextField();
	
	JButton loginButton = new JButton("LOGIN");
	JButton resetButton = new JButton("RESET");
	JCheckBox showPassword = new JCheckBox("Show Password");
	
	private ControlPanel _cp;
	
	public App() {
		// Makes the name of the panel
		super("Github API");
		
		LayoutManager();
		locationAndSize();
		addComponents();
		addActionEvent();
		
		// sets the frame size
		this.setSize(1280, 720);
		// adds an exit button to the frame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// set the visibility
		this.setVisible(true);
	}
	
	public void LayoutManager()
	{
		container.setLayout(null);
	}
	
	public void locationAndSize()
	{
		userLabel.setBounds(50,150,100,30);
		passwordLabel.setBounds(50, 220, 100, 30);
		userTextField.setBounds(150, 150, 150, 30);
		passwordTextField.setBounds(150, 220, 150, 30);
		loginButton.setBounds(50, 300, 100, 30);
		resetButton.setBounds(200,300,100,30);
	}
	
	public void addComponents()
	{
		container.add(userLabel);
//		container.add(passwordLabel);
		container.add(userTextField);
//		container.add(passwordTextField);
		container.add(showPassword);
		container.add(loginButton);
		container.add(resetButton);
	}
	
	public void addActionEvent()
	{
		loginButton.addActionListener(this);
		resetButton.addActionListener(this);
		showPassword.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == loginButton)
		{
			String userText;
			//String pwdText;
			userText = userTextField.getText();
			//pwdText = passwordTextField.getText();;
			SubprocessClient subProcess = new SubprocessClient();
			subProcess.SetUserName(userText);
			JOptionPane.showMessageDialog(this, "Login Successful");
			
			this.getContentPane().removeAll();
			this.getContentPane().add(new ControlPanel());
			this.revalidate();
			this.pack();
			
		}
		
		if(e.getSource() == resetButton)
		{
			userTextField.setText("");
			passwordTextField.setText("");
		}
		/*
		if(e.getSource() == showPassword)
		{
			if(showPassword.isSelected())
			{
				passwordTextField.setEchoChar((char)0);
			}
		}
		*/
	}
	
	
	// starts the application
	public static void main(String[] args) {
		new App();
	}
}

