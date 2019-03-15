package Projekt;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class Interfejs extends JFrame {

	public Interfejs() throws HeadlessException {
		this.setSize(900,800);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		
	}

	public static void main(String[] args) {
		Interfejs frame = new Interfejs();
		frame.setVisible(true);
	}

}
