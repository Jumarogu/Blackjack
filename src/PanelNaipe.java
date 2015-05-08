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
		this.pintaCarta(g);
	}
	public void pintaCarta(Graphics g){
		int j = 0;
		int aumento = 20;
		for (int i = 0; i < 4; i++) {
			if(bj.getPlayer(i) != null){
				if(i == 0){
					j = 0;
					for (int k = 0; k < this.bj.getPlayer(i).getJuego().length; k++) {
						if(this.bj.getPlayer(i).getJuego()[k] != null){
							g.drawImage(this.bj.getPlayer(i).getJuego()[j].getImage(), 205 + aumento, 407, null);
							aumento += 10;
							j++;
						}
					}
					aumento = 20;
				}
				else if(i == 1){
					j = 0;
					for (int k = 0; k < this.bj.getPlayer(i).getJuego().length; k++) {
						if(this.bj.getPlayer(i).getJuego()[k] != null){
							g.drawImage(this.bj.getPlayer(i).getJuego()[j].getImage(), 489 + aumento, 456, null);
							aumento += 10;
							j++;
						}
					}
					aumento = 20;
				}
				else if(i == 2){
					j = 0;
					for (int k = 0; k < this.bj.getPlayer(i).getJuego().length; k++) {
						if(this.bj.getPlayer(i).getJuego()[k] != null){
							g.drawImage(this.bj.getPlayer(i).getJuego()[j].getImage(), 811 + aumento, 468, null);
							aumento += 10;
							j++;
						}
					}
					aumento = 20;
				}
				else if(i == 3){
					j = 0;
					for (int k = 0; k < this.bj.getPlayer(i).getJuego().length; k++) {
						if(this.bj.getPlayer(i).getJuego()[k] != null){
							g.drawImage(this.bj.getPlayer(i).getJuego()[j].getImage(), 1116 + aumento, 410, null);
							aumento += 10;
							j++;
						}
					}
					aumento = 20;
				}
			}
			j = 0;
			for (int k = 0; k < this.bj.getPlayer(i).getJuego().length; k++) {
				if(this.bj.getPlayer(i).getJuego()[k] != null){
					g.drawImage(this.bj.getDealer().getJuego()[j].getImage(), 681 + aumento, 173, null);
					aumento += 10;
					j++;
				}
			}
			aumento = 20;
		}
	}
}
