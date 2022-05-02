
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	private DrawingPanel _dp;
	private ControlPanel _cp;
	private UserLogin _uc;
	private FileChooser _fc;
	
	public MainPanel() {
		_dp = new DrawingPanel();
		_cp = new ControlPanel();
		_fc = new FileChooser();
		this.add(_dp);
		this.add(_cp);
	}

}
