package Projekt;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rozdzielczosc extends JFrame {

	 JLabel tlo;
	 JLabel tytul;
	 Przycisk p720;
	 Przycisk p1080;
	 Przycisk Cofnij;
	 
	public Rozdzielczosc() {
		
    	this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setUndecorated(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ImageIcon img = new ImageIcon("source\\background.jpg");
        tlo = new JLabel("", img, JLabel.CENTER);
        tlo.setBounds(0, 0, 1920, 1080);
        GridBagLayout layout = new GridBagLayout();
        tlo.setLayout(layout);
        this.add(tlo);
        
        GridBagConstraints a1 = new GridBagConstraints();
        a1.insets = new Insets(0, 0, 200, 0);
        a1.anchor = GridBagConstraints.LINE_START;
        a1.weightx = 1;
        a1.weighty = 0;

        tytul = new JLabel("SPACE SHOOTER");
        tytul.setFont(new Font("Monospaced", Font.ITALIC, 150));
        tytul.setForeground(Color.WHITE);
        a1.gridx = 0;
        a1.gridy =1;
        tlo.add(tytul, a1);
        GridBagConstraints b1 = new GridBagConstraints();
       
        p720 = new Przycisk("  1280×720  ");
        b1.gridx = 0;
        b1.gridy = 2;
        b1.insets = new Insets(0, 0, 20, 0);
        b1.anchor = GridBagConstraints.LINE_START;
        tlo.add(p720, b1);
        
        p1080 = new Przycisk("  1920×1080  ");
        b1.gridx = 0;
        b1.gridy = 3;
        b1.insets = new Insets(0, 0, 20, 0);
        b1.anchor = GridBagConstraints.LINE_START;
        tlo.add(p1080, b1);
       
        GridBagConstraints f1 = new GridBagConstraints();
        Cofnij = new Przycisk("  Cofnij  ");
        f1.gridx = 0;
        f1.gridy = 4;
        f1.insets = new Insets(0, 0, 300, 0);
        f1.anchor = GridBagConstraints.LINE_START;
        tlo.add(Cofnij, f1);
        
	}
}
