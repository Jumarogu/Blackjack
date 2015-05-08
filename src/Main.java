import javax.swing.JOptionPane;


public class Main {
	
	private int jugadores;
	
	public static void main(String[] args) {
		//INTERACTIVIDAD CON USUARIO
		int numPlayers;
		int[] apuestas = new int[4];
		int tope;
		int masRicachon = 0;
		int jugadorActual;
		int respuesta, contador;
		numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Introdusca el numero de jugadores.", "1 - 4"));
		tope = Integer.parseInt(JOptionPane.showInputDialog("El tope del juego "));

		if(numPlayers > 4){
			JOptionPane.showMessageDialog(null, "El maximo numero de jugadores son 4");
			numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Introdusca el numero de jugadores.", "1 - 4"));
		}
		Player[] player = new Player[4];
		for (int i = 0; i < numPlayers; i++) {	
			String name = JOptionPane.showInputDialog("Nombre del jugador " + (i+1));
			int saldo = Integer.parseInt(JOptionPane.showInputDialog("El saldo del jugador " + (i+1)));
			apuestas[i] = Integer.parseInt(JOptionPane.showInputDialog("Apuesta del jugador " + (i+1)));
			player[i] = new Player(name, saldo);
		}
		Baraja baraja = new Baraja();
		baraja.mezclar();
		Blackjack bj = new Blackjack(player, apuestas, baraja);
		
		
		//System.out.println("Nombre " + p[0].getNombre() + " Saldo " + p[0].getSaldo());
		//Naipe n1 = new Naipe(2, 9);
		//System.out.println(n1.getValor());
		//System.out.println(n1.toString());
		PanelNaipe n = new PanelNaipe(bj);
		Frame f = new Frame(n);
		f.setVisible(true);
		
		while (masRicachon < tope){
			contador = 0;
			
			if(contador == 3){
				
			}
			bj.repartirCartas();
			jugadorActual = 0;
			
			
			
			while (jugadorActual<numPlayers){
				
				respuesta = JOptionPane.showConfirmDialog(null, " Jugador: " + jugadorActual + " Diga si quiere otra carta");
					
				if(respuesta == JOptionPane.YES_OPTION){
					bj.otraCarta(jugadorActual);	
					if(bj.sePaso(jugadorActual)){
						jugadorActual++;
						n.repaint();
					}
					
				}else if (respuesta == JOptionPane.NO_OPTION){
					System.out.println("entre a la opcion no");
					jugadorActual++;
				}else if (respuesta == JOptionPane.OK_CANCEL_OPTION){
					respuesta = JOptionPane.showConfirmDialog(null, "Jugador: " + jugadorActual + " Diga si quiere otra carta");
				}
				
			}
			
			System.out.println("jajajaja4");
			
			
			
			
			
			
			
			
		}
		
	}

}
