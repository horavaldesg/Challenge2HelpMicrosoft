import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class QuitButton extends JButton{

	public QuitButton() {
		super("Quit");
		this.addActionListener(new QuitListener());
	}
	
	private class QuitListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);  // exit program
		}
	}

}
