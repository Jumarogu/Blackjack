
public class Blackjack {
	private Player[] p;
	private Dealer d;
	private int[] apuesta;
	
	public Blackjack(Player[] p, int[] apuesta){
		this.p = p;
		this.d = new Dealer();
		this.apuesta = apuesta;
	
	}
	
}

/*
 * BlackJack
+ guardar( ): Guarda la partida actual.
+ abrir( ): Permite abrir una partida previamente guardada.
+ main: En esta clase se implementa la logica del juego y se instancian las clases anteriores.
 */
