import java.awt.Image;	

import javax.swing.ImageIcon;

public class Naipe{
	
	private static final String[] valores = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
	private static final String[] figuras = {"Corazon", "Diamante", "Trebol", "Picas"};
	private static final Image[][] naipesImg = new Image[4][13];
	private int figura;
	private int valor;
	
	public Naipe(int figura, int valor){
		this.valor = valor;
		this.figura = figura;
		for (int i = 0; i < naipesImg.length; i++) {
			for (int j = 0; j < naipesImg[i].length; j++) {
				if(i == 0){
					this.naipesImg[i][j] = new ImageIcon(j+1+"c.png").getImage();
					//System.out.println(i);
				}
				else if(i == 1){
					this.naipesImg[i][j] = new ImageIcon(j+1+"d.png").getImage();
					//System.out.println(i);
				}
				else if(i == 2){
					this.naipesImg[i][j] = new ImageIcon(j+1+"t.png").getImage();
					//System.out.println(i);
				}
				else if(i == 3){
					this.naipesImg[i][j] = new ImageIcon(j+1+"p.png").getImage();
					//System.out.println(i);
				}
			}
		}
		if(this.valor == 0){
			this.valor = 11;
		}
		else if(this.valor < 10){
			this.valor += 1;
		}
		else if(this.valor >= 10){
			this.valor = 10;
		}
	}
	public String toString(){	
		String v = "Carta " + this.valor + " " + this.figuras[this.figura];
		return v;
	}
	public Image getImage(){
		//System.out.println("Posicion del Naipe " + this.figuras[this.figura] + ", " + this.valor);
		return this.naipesImg[this.figura][this.valor];
	}
	public int getValor(){
		return this.valor;
	}
}