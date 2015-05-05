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
		for (int i = 0; i < 4; i++) {
			
			g.drawImage(bj.getBaraja().next().getImage(), i+5, i+10, null);
			if(this.bj.getPlayer(i) != null){	
				g.drawString(this.bj.getPlayer(i).getNombre(), 300, 300);
			}
			System.out.println(i);
		}
	}
	public void imprimeTablero(Graphics g){
		g.fillOval(0, this.getHeight(), this.getWidth(), this.getWidth());
	}
}
