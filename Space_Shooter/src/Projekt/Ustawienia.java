package Projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ustawienia extends JFrame {

    Przycisk Cofnij;
    Przycisk Sterowanie;
    Przycisk Muzyka;
    Przycisk Rozdzielczosc;
    JLabel tlo;
    JLabel tytul;

    public Ustawienia() {

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
        a.gridy = 0;
        tlo.add(tytul, a);

        Sterowanie = new Przycisk("  Sterowanie  ");
        a.gridx = 0;
        a.gridy = 2;
        a.insets = new Insets(0, 0, 20, 0);
        tlo.add(Sterowanie, a);

        Muzyka = new Przycisk("  Muzyka  ");
        a.gridx = 0;
        a.gridy = 3;
        tlo.add(Muzyka, a);
       
        Rozdzielczosc = new Przycisk("  Rozdzielczoœæ  ");
        a.gridx = 0;
        a.gridy = 4;
        tlo.add(Rozdzielczosc, a);
        
        Cofnij = new Przycisk("  Cofnij  ");
        a.gridx = 0;
        a.gridy = 5;
        tlo.add(Cofnij, a);
    }
}