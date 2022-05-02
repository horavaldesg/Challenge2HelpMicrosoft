import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class appPanel extends JPanel {
	public Panel() {
		// create a JLabel
		JLabel label = new JLabel("Github API");
		// create a JButton
		JButton button = new JButton("Insert");
		// add the JLabel and JButton to the panel
		this.add(label);
		this.add(button);
		 
		this.add(new QuitButton());
		
	}
}
