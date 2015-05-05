import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelNaipe extends JPanel{

	private Baraja b;
	public PanelNaipe(Baraja n){
		super();
		this.setSize(new Dimension(500, 500));
		this.b = n;
		
	}
	public void paint(Graphics g){
		super.paint(g);
		for (int i = 0; i < 52; i++) {
			//g.drawImage(b.next().getImage(), i+5, i+10, null);
			System.out.println(i);
		}
	}
}
