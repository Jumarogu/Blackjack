import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		//INTERACTIVIDAD CON USUARIO
		int numPlayers;
		int[] apuestas = new int[4];
		int tope;
		numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Introdusca el numero de jugadores.", "1 - 4"));
		tope = Integer.parseInt(JOptionPane.showInputDialog("El tope del juego "));
		if(numPlayers > 4){
			JOptionPane.showMessageDialog(null, "El maximo numero de jugadores son 4");
			numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Introdusca el numero de jugadores.", "1 - 4"));
		}
		System.out.println(numPlayers);
		Player[] p = new Player[numPlayers];
		for (int i = 0; i < numPlayers; i++) {	
			String name = JOptionPane.showInputDialog("Nombre del jugador " + (i+1));
			int saldo = Integer.parseInt(JOptionPane.showInputDialog("El saldo del jugador " + (i+1)));
			apuestas[i] = Integer.parseInt(JOptionPane.showInputDialog("Apuesta del jugador " + (i+1)));
			p[i] = new Player(name, saldo);
		}
		Blackjack bj = new Blackjack(p, apuestas);
		
	//	while(){
			
			
			
			
		//}
		
		System.out.println("Nombre " + p[0].getNombre() + " Saldo " + p[0].getSaldo());
		
		Naipe n1 = new Naipe(2, 9);
		Baraja b = new Baraja();
		b.mezclar();
		System.out.println(n1.getValor());
		System.out.println(n1.toString());
		PanelNaipe n = new PanelNaipe(b);
		Frame f = new Frame(n);
		f.setVisible(true);
	}

}
