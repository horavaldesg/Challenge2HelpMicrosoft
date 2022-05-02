
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CommitButton extends JButton{

	public CommitButton() {
		super("Commit");
		this.addActionListener(new CommitListener());
	}
	
	private class CommitListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}

}
