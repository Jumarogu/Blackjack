
public class Dealer extends Player {
	
	private int saldo;
	private boolean perdio;
	private Naipe[] juego;
	
	public Dealer(){
		super("Dealer", 100000);
		juego = new Naipe[11];
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
	
	public void perdioPartida(boolean gano){
		this.perdio = gano;
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

	public int getSaldo() {
		return this.saldo;
	}


	
}