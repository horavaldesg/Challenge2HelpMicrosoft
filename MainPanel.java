import javax.swing.JPanel;

public class MainPanel extends JPanel{
	private DrawingPanel _dp;
	private ControlPanel _cp;
	
	public MainPanel() {
		_dp = new DrawingPanel();
		_cp = new ControlPanel();
		
		this.add(_dp);
		this.add(_cp);
	}

}
