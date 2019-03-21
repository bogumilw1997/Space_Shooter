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
		this.setFont(new Font("Monospaced", Font.ITALIC, 60));
		this.setForeground(Color.WHITE);
		//this.setBorder(new LineBorder(Color.white, 3, true));
		this.setBackground(Color.BLUE);
		this.setOpaque(true);
		this.setContentAreaFilled(true);
		this.setBorderPainted(false);
		this.setFocusable(false);

		this.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				setBackground(Color.WHITE);
				setForeground(Color.BLUE);
			}
			public void mouseExited(MouseEvent e) {
				setBackground(Color.BLUE);
				setForeground(Color.WHITE);
			}
		});
	}
}
/***
 this.setOpaque(true);
 this.setContentAreaFilled(true);
 this.setBorderPainted(true);
 this.setFocusable(true);
 **/