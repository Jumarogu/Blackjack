
public class Blackjack {
	private Player[] p;
	private Dealer d;
	private int[] apuesta; // aqui tengo las apuestas de todos los jugadores
	private Baraja b;
	private int mayorSaldo;
	
	public Blackjack(Player[] p, int[] apuesta, Baraja b, Dealer d){
		this.p = p;
		this.b = b;
		this.d = d;
		this.apuesta = apuesta;
	}
	
	public void repartirCartas(){
	
		for (int i = 0; i < this.p.length; i++){
			for(int j = 0; j < 2 ; j++){
				if(this.p[i]!= null){
					
					this.p[i].recibirCartas(this.b.next());
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
			this.d.recibirCartas(b.next());
		}
	}
	
	
	public Baraja getBaraja(){
		return this.b;
	}
	public Player getPlayer(int i){
		return this.p[i];
	}
	
	public boolean sePaso(int i){
		boolean b = true;
		if (p[i].otraCarta()){
			b = false;
		}
		return b;
	}
	
	public boolean otraCartaDealer(){
		return d.otraCarta();
	}
	
	public void mezclarBJ(){
		this.b.mezclar();
	}
	public Dealer getDealer(){
		return this.d;
	}
	
	public void borrar(int i){
		
		for(int m = 0; m < i; i++){
			p[m].borrarCartas();
			
		}
		
	}
	
	public int masRicachon(){
		mayorSaldo = p[0].getSaldo();
		
		for(int i = 0; i < 3;i++){
			
			if(p[i+1] != null){
				if(p[i+1].getSaldo() > mayorSaldo){
					mayorSaldo = p[i+1].getSaldo();
				}
			}
		}
		
		return mayorSaldo;
	}
	
	
}

