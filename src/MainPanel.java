
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	private DrawingPanel _dp;
	private ControlPanel _cp;
	private FileChooser _fc;
	private textField _tf;
	
	public MainPanel() {
		_dp = new DrawingPanel();
		_cp = new ControlPanel();
		_tf = new textField();
		_fc = new FileChooser();
		
		this.add(_dp);
		this.add(_cp);
	}

}
