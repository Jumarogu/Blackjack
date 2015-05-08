import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Image;
public class PanelNaipe extends JPanel{

	private Blackjack bj;
	private Image img;
	private boolean bool;
	private int aumento;
	public PanelNaipe(Blackjack bj){
		super();
		this.img = new ImageIcon("background.jpg").getImage();
		this.setSize(new Dimension(500, 500));
		this.bj = bj;
		
	}
	public void paint(Graphics g){
		super.paint(g);
		this.nuevoTablero(g);
		this.pintaCarta(g);
	}
	public void nuevoTablero(Graphics g){
		this.aumento = 20;
		g.drawImage(img, 0, 0, null);
	}
	public void pintaCarta(Graphics g){
		int j = 0;
		if(!this.bool){
			this.nuevoTablero(g);
		}
		
		for (int i = 0; i < 4; i++) {
			if(bj.getPlayer(i) != null){
				if(i == 0){
					j = 0;
					for (int k = 0; k < this.bj.getPlayer(i).getJuego().length; k++) {
						if(this.bj.getPlayer(i).getJuego()[k] != null){
							g.drawImage(this.bj.getPlayer(i).getJuego()[j].getImage(), 205 + this.aumento, 407, null);
							this.aumento += 10;
							j++;
						}
					}
					this.aumento = 20;
					j = 0;
					for (int k = 0; k < 4; k++) {
						System.out.println("HOLA");
						if(this.bj.getDealer().getJuego()[j] != null){
							g.drawImage(this.bj.getDealer().getJuego()[j].getImage(), 681 + this.aumento, 173, null);
							this.aumento += 10;
							j++;
						}
					}
					this.aumento = 20;
				}
				else if(i == 1){
					j = 0;
					for (int k = 0; k < this.bj.getPlayer(i).getJuego().length; k++) {
						if(this.bj.getPlayer(i).getJuego()[k] != null){
							g.drawImage(this.bj.getPlayer(i).getJuego()[j].getImage(), 489 + this.aumento, 456, null);
							this.aumento += 10;
							j++;
						}
					}
					this.aumento = 20;
				}
				else if(i == 2){
					j = 0;
					for (int k = 0; k < this.bj.getPlayer(i).getJuego().length; k++) {
						if(this.bj.getPlayer(i).getJuego()[k] != null){
							g.drawImage(this.bj.getPlayer(i).getJuego()[j].getImage(), 811 + this.aumento, 468, null);
							this.aumento += 10;
							j++;
						}
					}
					this.aumento = 20;
				}
				else if(i == 3){
					j = 0;
					for (int k = 0; k < this.bj.getPlayer(i).getJuego().length; k++) {
						if(this.bj.getPlayer(i).getJuego()[k] != null){
							g.drawImage(this.bj.getPlayer(i).getJuego()[j].getImage(), 1116 + this.aumento, 410, null);
							this.aumento += 10;
							j++;
						}
					}
					this.aumento = 20;
				}
			}
		}
	}
	public void setBoolean(boolean t){
		this.bool = t;
	}
}
