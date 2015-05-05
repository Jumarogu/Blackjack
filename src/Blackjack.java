
public class Blackjack {
	private Player[] p;
	private Dealer d;
	private int[] apuesta; // aqui tengo las apuestas de todos los jugadores
	private Baraja b;
	
	public Blackjack(Player[] p, int[] apuesta, Baraja b){
		this.p = p;
		this.b = b;
		this.d = new Dealer();
		this.apuesta = apuesta;
	}
	
	public void repartirCartas(){
	
		for (int i = 0; i < p.length; i++){
			for(int j = 0; j < 2 ; j++){
				if(p[i]!= null){
					
					p[i].recibirCartas(b.next());
				}
			}
		}
	}
	
	public void otraCarta(int i){
		if (i == 0){
			p[0].recibirCartas(b.next());
		}else if (i == 1){
			p[1].recibirCartas(b.next());
			
		}else if(i == 2){
			p[2].recibirCartas(b.next());
			
		}else if (i== 3){
			p[3].recibirCartas((b.next()));
		}else if (i == 4){
			d.recibirCartas(b.next());
		}
	}
	
	
	public Baraja getBaraja(){
		return this.b;
	}
	public Player getPlayer(int i){
		return this.p[i];
	}
	
	public boolean sePaso(int i){
		
		if (p[i].otraCarta()){
			return false;
		}
		return true;
		
	}
	
	public boolean otraCartaDealer(){
		return d.otraCarta();
	}
	
	public void mezclarBJ(){
		this.b.mezclar();
	}
}

