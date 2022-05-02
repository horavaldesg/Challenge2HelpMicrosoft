import javax.swing.JFrame;

public class guiApp
{
    public guiApp()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new appPanel());

        frame.setVisible(true);
        frame.pack();
    }
}