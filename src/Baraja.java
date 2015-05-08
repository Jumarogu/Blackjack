
public class Baraja {
	
	private Naipe baraja[], carta;
	private int posicion = 0;
	private int carta1,carta2;
	
	public Baraja () {
		baraja = new Naipe[52];
		for(int i = 0; i<4; i++){
			for(int j = 0; j < 13; j++){
				baraja[posicion] = new Naipe(i,j);
				System.out.println("Naipe " + this.baraja[i].getValor());
				posicion += 1;
			}
		}
		posicion = 0;
	}
	
	public void mezclar(){
		int i = 0;
		while (i<52){
			//System.out.println(i);
			carta1= (int)Math.floor(Math.random()*52);
			carta2= (int)Math.floor(Math.random()*52);
			
			carta = baraja[carta1];
			baraja[carta1]= baraja[carta2];
			baraja[carta2] = carta;

			i++;
		}
	}
		
	public Naipe next(){
		posicion += 1;
		return baraja[posicion - 1];
	}
}