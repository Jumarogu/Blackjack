import javax.swing.JOptionPane;


public class Player {
	private int saldo;
	private String nombre;
	private boolean perdio;
	private Naipe juego[];
	
	public Player (){
		nombre = JOptionPane.showInputDialog("Introduce the name of the player");
		saldo = 1000;
		perdio = false;
		
		
	}
	
	public int getTotal(){
		return 1;  
	}
	
	public void ganoPartida(){
		/*+ ganoPartida( ): void (Este método lo mandan a llamar para indicarle al jugador que ganó esta partida y
		modifica la cantidad de dinero disponible).*/
		
		
		
		
	}
	
	public void perdioPartida(){
		
		/*+ perdioPartida( ) void (Este método lo mandan a llamar para indicarle al jugador que perdió esta partida
		y modifica la cantidad de dinero disponible).*/
		
		
	}
	
	public void empatoPartida(){
		/*+ empatóPartida( ): void (Este método lo mandan a llamar para indicarle al jugador que empató esta
		partida y modifica la cantidad de dinero disponible).*/
		
		
		
	}
	
	public boolean otraCarta(){
		return false;
		
	}
	
	public boolean isBlackJack(){
		return true;
	}

	public boolean getPerdio() {
		return perdio;
	}

	
	public String getNombre() {
		return nombre;
	}

	

	public int getSaldo() {
		return saldo;
	}

	
}