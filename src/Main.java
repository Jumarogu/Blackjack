
public class Main {

	public static void main(String[] args) {
		//System.out.println("Hermes marica");
		//System.out.println("Hola");
		Naipe n1 = new Naipe(0, 8);
		PanelNaipe n = new PanelNaipe(n1);
		Frame f = new Frame(n);
		f.setVisible(true);
		System.out.println(n1.getValor());
		System.out.println(n1.toString());
	}

}
