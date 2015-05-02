import java.awt.Image;

import javax.swing.ImageIcon;


public class PruebaNaipe {
	private String[] valores;
	private String[] figuras;
	private ImageIcon[] naipesImg;
	private int figura;
	private int valor;
	
	public PruebaNaipe(){
		this.naipesImg = new ImageIcon[52];
		this.figuras = new String[3];
		this.figura = 0;
		for (int i = 0; i < this.naipesImg.length; i++) {
			int j = 1;
			if(this.figura == 0){
				this.naipesImg[i] = new ImageIcon("Cartas/Corazones/"+j+".png");
				j++;
				if(j>13){
					this.figuras[0] = "Corazones";
					this.figura+=1;
				}
			}
			else if(this.figura == 1){
				j = 1;
				this.naipesImg[i] = new ImageIcon("Cartas/Diamante/"+j+".png");
				j++;
				if(j>13){
					this.figuras[1] = "Diamante";
					this.figura+=1;
				}
			}
			else if(this.figura == 2){
				j = 1;
				this.naipesImg[i] = new ImageIcon("Cartas/Trebol/"+j+".png");
				j++;
				if(j>13){
					this.figuras[2] = "Trebol";
					this.figura+=1;
				}
			}
			else if(this.figura == 3){
				j = 1;
				this.naipesImg[i] = new ImageIcon("Cartas/Picas/"+j+".png");
				j++;
				if(j>13){
					this.figuras[3] = "Picas";
					this.figura+=1;
				}
			}
		}
	}
	public String toString(){
		
		return "";
	}
	public ImageIcon getImage(){
		return this.naipesImg[1];
	}
	public int getValor(){
		return 1;
	}
}
