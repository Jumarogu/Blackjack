
public class Blackjack {
	private Player[] p;
	private Dealer d;
	private int[] apuesta;
	private Baraja b;
	public Blackjack(Player[] p, int[] apuesta, Baraja b){
		this.p = p;
		this.b = b;
		this.d = new Dealer();
		this.apuesta = apuesta;
	
	}
	public Baraja getBaraja(){
		return this.b;
	}
	public Player getPlayer(int i){
		return this.p[i];
	}
	
}

