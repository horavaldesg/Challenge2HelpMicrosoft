
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public class StatusButton extends JButton{
	public StatusButton() {
		super("Status");
		this.addActionListener(new StatusListener());
	}
	
	private class StatusListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			SubprocessClient subProcess = new SubprocessClient();
			subProcess.GitStatus();
		}
	}
}
