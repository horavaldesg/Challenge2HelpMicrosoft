
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class PushButton extends JButton{

	public PushButton() {
		super("Push");
		this.addActionListener(new PushListener());
	}
	
	private class PushListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			SubprocessClient subProcess = new SubprocessClient();
			subProcess.GitPush();
		}
	}

}
