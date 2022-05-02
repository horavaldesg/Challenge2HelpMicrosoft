
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public class FetchAll extends JButton {
	public FetchAll() {
		super("Fetch");
		this.addActionListener(new FetchListener());
	}
	
	private class FetchListener implements ActionListener {
		public void actionPerformed(ActionEvent e)
		{
			SubprocessClient subProcess = new SubprocessClient();
			subProcess.GitFetch();
		}
	}
}
