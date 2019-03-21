package Projekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

	public static void main(String[] args) {
		Interfejs interf = new Interfejs();
		interf.setVisible(true);
		Ustawienia ustaw = new Ustawienia();
		ustaw.setVisible(false);
		
		interf.Ust.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ustaw.setVisible(true);
			}
		});
		
		 ustaw.Cofnij.addActionListener(new ActionListener() {
			 @Override
	         public void actionPerformed(ActionEvent arg0) {
	             interf.setVisible(true);
	        }
	    });
	}
}
