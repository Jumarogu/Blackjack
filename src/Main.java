
public class Main {

	public static void main(String[] args) {
		
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
