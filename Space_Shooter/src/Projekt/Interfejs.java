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
		a.insets = new Insets(0, 0, 208, 0);
		a.anchor = GridBagConstraints.LINE_START;
		a.weightx = 1;
		a.weighty = 0;

		tytul = new JLabel("SPACE SHOOTER");
		tytul.setFont(new Font("Monospaced", Font.ITALIC, 150));
		tytul.setForeground(Color.WHITE);
		a.gridx = 0;
		a.gridy = 0;
		tlo.add(tytul, a);

		Graj = new Przycisk("  Graj  ");
		a.gridx = 0;
		a.gridy = 2;
		a.insets = new Insets(0, 0, 20, 0);
		tlo.add(Graj, a);

		Ust = new Przycisk("  Ustawienia  ");
		a.gridx = 0;
		a.gridy = 3;
		tlo.add(Ust, a);

		Wyjdz = new Przycisk("  Wyjdü  ");
		Wyjdz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		a.gridx = 0;
		a.gridy = 4;
		tlo.add(Wyjdz, a);
	}

}
