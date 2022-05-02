
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlPanel extends JPanel{
	SubprocessClient subProcess = new SubprocessClient();
	
	 
	private static String status;
	private static String branchName;
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
		this.add(BranchName());
		this.add(textField());
		this.add(new PushButton());
		this.add(new StatusButton());
		this.add(StatusField());
		this.validate();
		this.repaint();
		this.add(new FetchAll());
	 }
	 private Component BranchName() {
		 
		 JLabel branch = new JLabel();
		 branch.setText(branchName);
		 
		 return branch;
	 }
	 private Component StatusField() {
		JLabel label = new JLabel(status);
			label.setText(status);
			label.setSize(label.getPreferredSize());
			label.setLocation(50, 20);
			return label;
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
							SubprocessClient subProcess = new SubprocessClient();
							subProcess.SetMessage(content);
							return;
						}
						else
						{
							
						}
							
					}
				});
		return textfield;
	}
	public void SetStatus(String _status) {
		status = _status;
		System.out.println("Branch: " + status);
	}
	public void SetBranchName(String _branchName){
		branchName = _branchName;
		System.out.println(branchName);
	}
}
