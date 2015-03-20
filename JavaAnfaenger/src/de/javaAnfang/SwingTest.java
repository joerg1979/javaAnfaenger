package de.javaAnfang;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class SwingTest extends JFrame {

	public SwingTest() throws HeadlessException {
		this.setSize(200, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	/**
	 *
	 * 
	 */
	private static final long serialVersionUID = 6623929222893175152L;

	public static void main(String[] args) {
		new SwingTest();
	}


}
