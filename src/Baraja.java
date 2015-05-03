import java.util.*;
public class Baraja {
	
	
	private Naipe baraja[], carta;
	private int posicion = 0;
	private int carta1,carta2;
	
	public Baraja () {
		for(int i = 0; i<4; i++){
			for(int j = 0; j < 13; j++){
				baraja[posicion] = new Naipe(i,j);
				posicion ++;
			}
		}
		
	}
	
	public void mezclar(){
		int i = 0;
		
		
		while (i<52){
			
			carta1= (int)Math.floor(Math.random()*(53-1))+ 1;
			carta2= (int)Math.floor(Math.random()*(53-1))+ 1;
			
			baraja[carta1] = carta;
			baraja[carta1]= baraja[carta2];
			baraja[carta2] = carta;
			
			i++;
		}
		posicion = -1;
	}
		
	public Naipe next(){
		posicion++;
		return baraja[posicion];			
	}
}