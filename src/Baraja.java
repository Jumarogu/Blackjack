import java.util.*;
public class Baraja {
	
	private Naipe baraja[], carta;
	private int posicion, carta1,carta2;
	
	public Baraja (){
		baraja = new Naipe [52];
		posicion = 0;
		
		
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
		
		
		
	}
	
	public Naipe next(){
		
	}
}


/*Baraja
- baraja: Naipe[ ]
- posicion: int (indica cuál carta de la baraja se está dando)
+ Constructor default
+ mezclar( ): void
+ next( ): Naipe*/
