import javax.swing.JFrame;

public class guiApp {
    public guiApp() {
        // Makes the name of the panel
        super("Github App");
        // sets the frame size
        this.setSize(1280, 720);
        // adds an exit button to the frame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // set the visibility
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}