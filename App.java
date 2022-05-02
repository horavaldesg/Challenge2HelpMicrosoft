import javax.swing.JFrame;

public class App extends JFrame {
	public App() {
		// Makes the name of the panel
		super("Github API");
		// sets the frame size
		this.setSize(1280, 720);
		// adds an exit button to the frame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// adds the panels to the frame
		this.add(new MainPanel());

		// set the visibility
		this.setVisible(true);
	}
	// starts the application
	public static void main(String[] args) {
		new App();
	}
}

