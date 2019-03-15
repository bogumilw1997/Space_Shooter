package Projekt;

import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Interfejs extends JFrame {

	JButton Graj;
	JButton Ustawienia;
	JButton Wyjdz;
	
	public Interfejs() throws HeadlessException {
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		this.setLayout(layout);
		c.insets = new Insets(50,50,50,50);
		
		Graj = new JButton("  Graj  ");
		Graj.setFont(new Font("Monospaced",Font.BOLD, 60));
		c.gridx = 1;
		c.gridy = 0;
		this.add(Graj, c);
		
		Ustawienia = new JButton("  Ustawienia  ");
		Ustawienia.setFont(new Font("Monospaced",Font.BOLD, 60));
		c.gridx = 1;
		c.gridy = 1;
		this.add(Ustawienia, c);
		
		Wyjdz = new JButton("  Wyjdü  ");
		Wyjdz.setFont(new Font("Monospaced",Font.BOLD, 60));
		Wyjdz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		c.gridx = 1;
		c.gridy = 2;
		this.add(Wyjdz, c);

	}

	public static void main(String[] args) {
		Interfejs frame = new Interfejs();
		frame.setVisible(true);
	}

}
