package de.javaAnfang;

import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest extends JFrame {
	private static final long serialVersionUID = 6623929222893175152L;
	
	private JButton btn1;
	
	public SwingTest() throws HeadlessException {
		this.setSize(300, 400);
		this.setTitle("Swing JFrame Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		btn1 = new JButton("Ok");
		btn1.setSize(100,100);
		btn1.setToolTipText("Die ist ein Tooltip auf dem Button " + btn1.getText());
		
		this.getContentPane().add(btn1);
	}
	
	public static void main(String[] args) {
		new SwingTest();
	}
}
