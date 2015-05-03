import java.awt.Image;

import javax.swing.ImageIcon;


public class Naipe{
	
	private String[] valores = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
	private String[] figuras = {"Corazon", "Diamante", "Trebol", "Picas"};
	private Image[][] naipesImg = new Image[3][12];
	private Image naipe;
	private int figura;
	private int valor;
	
	public Naipe(int figura, int valor){
		this.valor = valor;
		this.naipe = new ImageIcon("/Cartas/Corazones/1.png").getImage();
		this.figura = figura;
		for (int i = 0; i < naipesImg.length; i++) {
			for (int j = 0; j < naipesImg[i].length; j++) {
				if(i == 0){
					String v = "Cartas ";
					
					this.naipesImg[i][j] = new ImageIcon(j+1+"c.png").getImage();
				}
				else if(i == 1){
					this.naipesImg[i][j] = new ImageIcon(j+1+"d.png").getImage();
				}
				else if(i == 1){
					this.naipesImg[i][j] = new ImageIcon(j+1+"t.png").getImage();
				}
				else if(i == 1){
					this.naipesImg[i][j] = new ImageIcon(j+1+"p.png").getImage();
				}
			}
		}
	}
	public String toString(){	
		String v = "Carta " +this.valores[this.valor] + " " + this.figuras[this.figura];
		return v;
	}
	public Image getImage(){
		return this.naipesImg[this.figura][this.valor];
	}
	public int getValor(){
		int j = 0;
		if(this.valor == 0){
			j = 11;
		}
		else if(this.valor < 10){
			j = this.valor + 1;
		}
		else if(this.valor >= 10){
			j = 10;
		}
		return j;
	}
}