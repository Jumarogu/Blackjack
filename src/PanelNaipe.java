import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


public class PanelNaipe extends JPanel{
	private Naipe n;
	public PanelNaipe(Naipe n){
		super();
		this.setSize(new Dimension(500, 500));
		
		
		this.n = n;
		
	}
	public void paint(Graphics g){
		n.getImage().paintIcon(this, g, 100, 100);
	}
}
