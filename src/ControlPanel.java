
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlPanel extends JPanel{
	 public ControlPanel () {
		 super();
		 
		 this.add(new QuitButton());
		 this.add(new CommitButton());
		 
		JTextField textfield = new JTextField("Enter Text", 16);
		textfield.addKeyListener(new KeyAdapter()
				{
					public void keyReleased(KeyEvent event)
					{
						String content = textfield.getText();
						if(!content.equals(""))
						{
							//button.setEnabled(true);
						}
						else
						{
							
						}
							
					}
				});
		
		this.add(textField());
		
	 }

	private Component textField() {
		JTextField textfield = new JTextField("Enter Text", 16);
		textfield.addKeyListener(new KeyAdapter()
				{
					public void keyReleased(KeyEvent event)
					{
						String content = textfield.getText();
						if(!content.equals(""))
						{
							return;
						}
						else
						{
							
						}
							
					}
				});
		return textfield;
	}
}
