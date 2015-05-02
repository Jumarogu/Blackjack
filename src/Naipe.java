import javax.swing.ImageIcon;


public class Naipe{
	
	private static final String[] valores = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
	private static final String[] figuras = {"Corazon", "Diamante", "Trebol", "Picas"};
	private static final ImageIcon[] naipesImg = new ImageIcon[52];
	private int figura;
	private int valor;
	
	public Naipe(int valor, int figura){
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
		this.valor = valor;
		this.figura = figura;
		
	}
	public String toString(){	
		return "";
	}
	public ImageIcon getImage(){
		if(this.valor < 12){
			
		}
	}
	public int getValor(){
		return 1;
	}
}