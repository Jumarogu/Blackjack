

public class Player {
	private int saldo;
	private String nombre;
	private boolean perdio;
	private Naipe[] juego;
	private int numeroCartas = 0;
	
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
	
	}
	
	public void perdioPartida(int apuesta){
		if(this.saldo == 0){
			this.perdio = true;
		}
		
	}
	
	public void empatoPartida(int apuesta){
		this.saldo += apuesta;
		
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
	public Naipe[] getJuego(){
		return this.juego;
	}

	public void recibirCartas(Naipe n1){
		
		if(numeroCartas < 11){
			juego[numeroCartas] = n1;
			numeroCartas++;
		}
		
	}
	
	public void borrarCartas(){
		this.juego = new Naipe[11];
	}
	
}