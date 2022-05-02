
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	private DrawingPanel _dp;
	private ControlPanel _cp;
	private FileChooser _fc;
	
	public MainPanel() {
		
		this.setSize(1280, 720);
		_dp = new DrawingPanel();
		_cp = new ControlPanel();
		_fc = new FileChooser();
		this.add(_dp);
		this.add(_cp);
	}

}
