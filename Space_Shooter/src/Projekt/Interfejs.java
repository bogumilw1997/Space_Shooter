package Projekt;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Interfejs extends JFrame {

	JButton Graj;
	JButton Ustawienia;
	JButton Wyjdz;
	JLabel tlo;
	JLabel tytul;
	
	public Interfejs() throws HeadlessException {

		this.setSize(1920, 1080);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		ImageIcon img = new ImageIcon("source\\tlo.jpg");
		tlo = new JLabel("", img, JLabel.CENTER);
		tlo.setBounds(0, 0, 1920, 1080);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		tlo.setLayout(layout);
		this.add(tlo);
		c.insets = new Insets(50, 50, 50, 50);
		
		tytul = new JLabel("SPACE SHOOTER");
		tytul.setFont(new Font("Monospaced", Font.BOLD, 150));
		tytul.setForeground(Color.WHITE);
		c.gridx = 1;
		c.gridy = 0;
		tlo.add(tytul, c);
	

		Graj = new JButton("  Graj  ");
		Graj.setFont(new Font("Monospaced", Font.BOLD, 60));
        Graj.setBorder(new LineBorder(Color.black, 3, true));
        Graj.setBackground(Color.yellow);
        
        Graj.addMouseListener(new MouseAdapter() {
        	public void mouseEntered(MouseEvent e) {
        		Graj.setBackground(Color.RED);
        	}

        	public void mouseExited(MouseEvent e) {
        		Graj.setBackground(Color.YELLOW);
        	}	
        });
        
		c.gridx = 1;
		c.gridy = 1;
		tlo.add(Graj, c);

		Ustawienia = new JButton("  Ustawienia  ");
		Ustawienia.setFont(new Font("Monospaced", Font.BOLD, 60));
		Ustawienia.setBackground(Color.yellow);
		Ustawienia.setBorder(new LineBorder(Color.black, 3, true));
		Ustawienia.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Ustawienia.setBackground(Color.RED);
			}

			public void mouseExited(MouseEvent e) {
				Ustawienia.setBackground(Color.YELLOW);
			}	
	    });
		c.gridx = 1;
		c.gridy = 2;
		tlo.add(Ustawienia, c);

		Wyjdz = new JButton("  Wyjdü  ");
		Wyjdz.setFont(new Font("Monospaced", Font.BOLD, 60));
		Wyjdz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		Wyjdz.setBorder(new LineBorder(Color.black, 3, true));
		Wyjdz.setBackground(Color.yellow);
		Wyjdz.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Wyjdz.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				Wyjdz.setBackground(Color.YELLOW);
			}
		});

		c.gridx = 1;
		c.gridy = 3;
		tlo.add(Wyjdz, c);
	}

	public static void main(String[] args) {
		Interfejs frame = new Interfejs();
		frame.setVisible(true);
	}

}
