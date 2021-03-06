import javax.swing.JOptionPane;


public class Main {
	
	private int jugadores;
	
	public static void main(String[] args) {
		//INTERACTIVIDAD CON USUARIO
		int numPlayers;
		int[] apuestas = new int[4];
		int tope;
		int masRicachon = 0;
		int jugadorActual, respuesta;
		int contador = 0;
		Dealer d = new Dealer();
		numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de jugadores.", "1 - 4"));
		tope = Integer.parseInt(JOptionPane.showInputDialog("El tope del juego "));

		if(numPlayers > 4){
			JOptionPane.showMessageDialog(null, "El maximo numero de jugadores son 4");
			numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de jugadores.", "1 - 4"));
		}
		Player[] player = new Player[4];
		for (int i = 0; i < numPlayers; i++) {	
			String name = JOptionPane.showInputDialog("Nombre del jugador " + (i+1));
			int saldo = Integer.parseInt(JOptionPane.showInputDialog("El saldo del jugador " + (i+1)));
			player[i] = new Player(name, saldo);
		}
		Baraja baraja = new Baraja();
		baraja.mezclar();
		Blackjack bj = new Blackjack(player, apuestas, baraja, d);
		
		//System.out.println("Nombre " + p[0].getNombre() + " Saldo " + p[0].getSaldo());
		//Naipe n1 = new Naipe(2, 9);
		//System.out.println(n1.getValor());
		//System.out.println(n1.toString());
		PanelNaipe n = new PanelNaipe(bj);
		Frame f = new Frame(n);
		f.setVisible(true);
		
		while (masRicachon < tope){
			n.setBoolean(true);
			if(contador == 3){
				bj.mezclarBJ();
				contador = 0;
			}

			jugadorActual = 0;
			
			for(int j = 0; j<numPlayers; j++){
				
				apuestas[j] = Integer.parseInt(JOptionPane.showInputDialog("Apuesta del jugador " + bj.getPlayer(j).getNombre()));
				
				if(apuestas[j]>player[j].getSaldo()){
					apuestas[j] = Integer.parseInt(JOptionPane.showInputDialog(" No tiene saldo disponible para realizar esta apuesta, introduzca una nueva "));
				}
			}	
			bj.repartirCartas();
			bj.otraCarta(4);
			bj.otraCarta(4);
			n.repaint();
			while (jugadorActual<numPlayers){
				
				respuesta = JOptionPane.showConfirmDialog(null, " Jugador: " + bj.getPlayer(jugadorActual).getNombre() + " Diga si quiere otra carta");
					
				if(respuesta == JOptionPane.YES_OPTION){
					bj.otraCarta(jugadorActual);
					n.repaint();
					if(bj.sePaso(jugadorActual)){
						jugadorActual++;
					}
					
				}
				else if (respuesta == JOptionPane.NO_OPTION){
					System.out.println("entre a la opcion no");
					jugadorActual++;
					
				}
				else if (respuesta == JOptionPane.OK_CANCEL_OPTION){
					respuesta = JOptionPane.showConfirmDialog(null, "Jugador: " + bj.getPlayer(jugadorActual).getNombre() + " Diga si quiere otra carta");
				}
				
			}
			while(bj.otraCartaDealer()){
				bj.otraCarta(4);
				n.repaint();
			}
			if(bj.getDealer().getTotal()>21){
				bj.getDealer().perdioPartida(true);
			}
			
			
			for(int h = 0; h< numPlayers; h++ ){
				
				System.out.println("el total del jugador" + player[h].getTotal());
				System.out.println(" el total del dealer" + bj.getDealer().getTotal());
				System.out.println(d.getTotal());
				if(player[h].isBlackJack() && !bj.getDealer().isBlackJack()){
					player[h].ganoPartida(apuestas[h]);
					
					JOptionPane.showMessageDialog(null, " El jugador: " + h + " gano contra el dealer: " + apuestas[h]);
					
				}

				if(player[h].getTotal()> 21 && bj.getDealer().getPerdio()){
					
					player[h].empatoPartida(apuestas[h]);
					JOptionPane.showMessageDialog(null, " El jugador " + h + " empato con el dealer : " + apuestas[h]);

				} else if(player[h].getTotal() == bj.getDealer().getTotal()){
					player[h].ganoPartida(apuestas[h]);
					JOptionPane.showMessageDialog(null, "El jugador " + h + "empato contra el dealer: " + apuestas[h]);
				
				}
				else if(player[h].getTotal() <= 21 && player[h].getTotal() > bj.getDealer().getTotal() && !bj.getDealer().getPerdio() ){
					JOptionPane.showMessageDialog(null, "El jugador " + h + "gano contra el dealer: " + apuestas[h]);

				}
				else if (bj.getDealer().getPerdio() && player[h].getTotal()<=21){
					player[h].ganoPartida(apuestas[h]);
					JOptionPane.showMessageDialog(null, "El jugador " + h + "gano contra el dealer: " + apuestas[h]);
					player[h].ganoPartida(apuestas[h]);	
				}
				else {
					JOptionPane.showMessageDialog(null, "El jugador " + h + "perdio contra el dealer: " + apuestas[h]);
					player[h].perdioPartida(apuestas[h]);
				}
				
			}
			n.setBoolean(false);
			n.repaint();
			
			bj.borrar(numPlayers);
			masRicachon = bj.masRicachon();
			
		}
		
	}

}