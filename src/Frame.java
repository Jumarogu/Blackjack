import java.awt.BorderLayout;

import javax.swing.JFrame;


public class Frame extends JFrame{
	private PanelNaipe pn;
	public Frame(PanelNaipe pn){
		super("blackjack");
		this.pn = pn;
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.add(pn, BorderLayout.CENTER);
	}
}
