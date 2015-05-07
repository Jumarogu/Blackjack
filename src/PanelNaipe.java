import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelNaipe extends JPanel{

	private Blackjack bj;
	public PanelNaipe(Blackjack bj){
		super();
		this.setSize(new Dimension(500, 500));
		this.bj = bj;
		
	}
	public void paint(Graphics g){
		super.paint(g);
		this.imprimeTablero(g);
		for (int i = 0; i < 26 ; i++) {
			g.drawImage(bj.getBaraja().next().getImage(), i+5, i+10, null);
			System.out.println("esta es i: " + i);
		}
	}
	public void imprimeTablero(Graphics g){
		g.fillOval(0,0, 100, 100);
	}
}
