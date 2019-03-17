package Projekt;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class Przycisk extends JButton {

	public Przycisk(String arg0) {
		super(arg0);
		this.setFont(new Font("Monospaced", Font.BOLD, 60));
		this.setForeground(Color.BLACK);
        this.setBorder(new LineBorder(Color.black, 3, true));
        this.setBackground(Color.YELLOW);
        
        this.addMouseListener(new MouseAdapter() {
        	public void mouseEntered(MouseEvent e) {
        		setBackground(Color.RED);
        	}

        	public void mouseExited(MouseEvent e) {
        		setBackground(Color.YELLOW);
        	}	
        });
	}

}
