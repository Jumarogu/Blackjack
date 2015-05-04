

public class Player {
	private int saldo;
	private String nombre;
	private boolean perdio;
	private Naipe[] juego;
	
	public Player (String nombre, int saldo){
		this.nombre = nombre;
		this.saldo = saldo;
		this.perdio = false;
		this.juego = new Naipe[11];
	}
	
	public int getTotal(){
		int total = 0;
		for (int i = 0; i < this.juego.length; i++) {
			if(this.juego[i] != null){
				total += this.juego[i].getValor();
			}
		}
		return total;  
	}
	
	public void ganoPartida(int apuesta){
		this.saldo += apuesta*2;
		/*+ ganoPartida( ): void (Este m�todo lo mandan a llamar para indicarle al jugador que gan� esta partida y
		modifica la cantidad de dinero disponible).*/
	}
	
	public void perdioPartida(int apuesta){
		if(this.saldo == 0){
			this.perdio = true;
		}
		/*+ perdioPartida( ) void (Este m�todo lo mandan a llamar para indicarle al jugador que perdi� esta partida
		y modifica la cantidad de dinero disponible).*/
	}
	
	public void empatoPartida(int apuesta){
		this.saldo += apuesta;
		/*+ empat�Partida( ): void (Este m�todo lo mandan a llamar para indicarle al jugador que empat� esta
		partida y modifica la cantidad de dinero disponible).*/
	}
	
	public boolean otraCarta(){
		boolean naipe = false;
		if(this.getTotal() < 21){
			naipe = true;
		}
		return naipe;
	}
	
	public boolean isBlackJack(){
		boolean black = false;
		if(this.getTotal() == 21){
			black = true;
		}
		return black;
	}

	public boolean getPerdio() {
		return this.perdio;
	}
	public String getNombre() {
		return this.nombre;
	}

	public int getSaldo() {
		return this.saldo;
	}

	
}