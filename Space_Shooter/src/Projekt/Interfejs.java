package Projekt;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfejs extends JFrame {

	JButton Graj;
	JButton Ustawienia;
	JButton Wyjdz;
	JLabel tlo;
	
	public Interfejs() throws HeadlessException {
		
		this.setSize(1920,1080);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		ImageIcon img = new ImageIcon("C:\\Users\\bogum\\Desktop\\tlo.jpg");
		tlo = new JLabel("", img, JLabel.CENTER);
		tlo.setBounds(0, 0, 1920, 1080);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		tlo.setLayout(layout);
		this.add(tlo);
		c.insets = new Insets(50,50,50,50);
		
		Graj = new JButton("  Graj  ");
		Graj.setFont(new Font("Monospaced",Font.BOLD, 60));
		c.gridx = 1;
		c.gridy = 0;
		tlo.add(Graj, c);
		
		Ustawienia = new JButton("  Ustawienia  ");
		Ustawienia.setFont(new Font("Monospaced",Font.BOLD, 60));
		c.gridx = 1;
		c.gridy = 1;
		tlo.add(Ustawienia, c);
		
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
		tlo.add(Wyjdz, c);

	}
	
	public static void main(String[] args) {
		Interfejs frame = new Interfejs();
		frame.setVisible(true);
	}

}
