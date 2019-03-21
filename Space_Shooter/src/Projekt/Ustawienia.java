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

        this.setSize(1920, 1080);
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
        Sterowanie = new Przycisk("  Sterowanie  ");
        b1.gridx = 0;
        b1.gridy = 2;
        b1.insets = new Insets(0, 0, 20, 0);
        b1.anchor = GridBagConstraints.LINE_START;
        tlo.add(Sterowanie, b1);

        GridBagConstraints c1 = new GridBagConstraints();
        Muzyka = new Przycisk("  Muzyka  ");
        c1.gridx = 0;
        c1.gridy = 3;
        c1.insets = new Insets(0, 0, 20, 0);
        c1.anchor = GridBagConstraints.LINE_START;
        tlo.add(Muzyka, c1);
       
        GridBagConstraints d1 = new GridBagConstraints();
        Rozdzielczosc = new Przycisk("  Rozdzielczoœæ  ");
        d1.gridx = 0;
        d1.gridy = 4;
        d1.insets = new Insets(0, 0, 20, 0);
        d1.anchor = GridBagConstraints.LINE_START;
        tlo.add(Rozdzielczosc, d1);
        
        GridBagConstraints f1 = new GridBagConstraints();
        Cofnij = new Przycisk("  Cofnij  ");
        f1.gridx = 0;
        f1.gridy = 5;
        f1.insets = new Insets(0, 0, 300, 0);
        f1.anchor = GridBagConstraints.LINE_START;
        tlo.add(Cofnij, f1);
    }
}