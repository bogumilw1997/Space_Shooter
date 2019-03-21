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

import Projekt.Przycisk;

public class Interfejs extends JFrame {

	Przycisk Graj;
	Przycisk Ust;
	Przycisk Wyjdz;
	JLabel tlo;
	JLabel tytul;
	
	public Interfejs() throws HeadlessException {

		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		ImageIcon img = new ImageIcon("source\\background.jpg");
		tlo = new JLabel("", img, JLabel.CENTER);
		tlo.setBounds(0, 0, 1920, 1080);
		GridBagLayout layout = new GridBagLayout();
		tlo.setLayout(layout);
		this.add(tlo);

		GridBagConstraints a = new GridBagConstraints();
		a.insets = new Insets(0, 0, 200, 0);
		a.anchor = GridBagConstraints.LINE_START;
		a.weightx = 1;
		a.weighty = 0;

		tytul = new JLabel("SPACE SHOOTER");
		tytul.setFont(new Font("Monospaced", Font.ITALIC, 150));
		tytul.setForeground(Color.WHITE);
		a.gridx = 0;
		a.gridy =1;
		tlo.add(tytul, a);

		GridBagConstraints b = new GridBagConstraints();
		Graj = new Przycisk("  Graj  ");
		b.gridx = 0;
		b.gridy = 2;
		b.insets = new Insets(0, 0, 20, 0);
		b.anchor = GridBagConstraints.LINE_START;
		tlo.add(Graj, b);

		GridBagConstraints c = new GridBagConstraints();
		Ust = new Przycisk("  Ustawienia  ");
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(0, 0, 20, 0);
		c.anchor = GridBagConstraints.LINE_START;
		tlo.add(Ust, c);

		GridBagConstraints d = new GridBagConstraints();
		Wyjdz = new Przycisk("  Wyjdü  ");
		Wyjdz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		d.gridx = 0;
		d.gridy = 4;
		d.insets = new Insets(0, 0, 400, 0);
		d.anchor = GridBagConstraints.LINE_START;
		tlo.add(Wyjdz, d);
	}

}
