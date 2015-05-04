import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Image;
public class PanelNaipe extends JPanel{

	private Blackjack bj;
	private Image img;
	public PanelNaipe(Blackjack bj){
		super();
		this.img = new ImageIcon("background.jpg").getImage();
		this.setSize(new Dimension(500, 500));
		this.bj = bj;
		
	}
	public void paint(Graphics g){
		super.paint(g);
		g.drawImage(img, 0, 0, null);
		this.imprimeTablero(g);
		for (int i = 0; i < 4 ; i++) {
			

		}
	}
	public void imprimeTablero(Graphics g){
//		if(this.bj.getPlayer(i) != null){	
//			g.drawString(this.bj.getPlayer(i).getNombre(), 300, 300);
//		}
		g.fillOval(0,0, 100, 100);
	}
}
