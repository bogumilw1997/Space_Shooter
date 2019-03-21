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
       
        p720 = new Przycisk("  1280×720  ");
        a.gridx = 0;
        a.gridy = 2;
        a.insets = new Insets(0, 0, 20, 0);
        a.anchor = GridBagConstraints.LINE_START;
        tlo.add(p720, a);
        
        p1080 = new Przycisk("  1920×1080  ");
        a.gridx = 0;
        a.gridy = 3;
        a.insets = new Insets(0, 0, 20, 0);
        a.anchor = GridBagConstraints.LINE_START;
        tlo.add(p1080, a);
       
        Cofnij = new Przycisk("  Cofnij  ");
        a.gridx = 0;
        a.gridy = 4;
        a.insets = new Insets(0, 0, 300, 0);
        a.anchor = GridBagConstraints.LINE_START;
        tlo.add(Cofnij, a);
        
	}
}
