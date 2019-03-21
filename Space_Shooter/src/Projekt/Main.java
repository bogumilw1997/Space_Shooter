package Projekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

	public static void main(String[] args) {
		Interfejs interf = new Interfejs();
		interf.setVisible(true);
		Ustawienia ustaw = new Ustawienia();
		ustaw.setVisible(false);
		Rozdzielczosc rozd = new Rozdzielczosc();
		rozd.setVisible(false);
		
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
		
		ustaw.Rozdzielczosc.addActionListener(new ActionListener() {
			 @Override
	         public void actionPerformed(ActionEvent arg0) {
	             rozd.setVisible(true);
	        }
	    });
		
		rozd.Cofnij.addActionListener(new ActionListener() {
			 @Override
	         public void actionPerformed(ActionEvent arg0) {
	             ustaw.setVisible(true);
	        }
	    });
		
		rozd.p720.addActionListener(new ActionListener() {
			 @Override
	         public void actionPerformed(ActionEvent arg0) {
	            interf.setSize(1280, 720);
	            interf.repaint();
	            ustaw.setSize(1280, 720);
	            ustaw.repaint();
	            rozd.setSize(1280, 720);
	            rozd.repaint();
	        }
	    });
		
		rozd.p1080.addActionListener(new ActionListener() {
			 @Override
	         public void actionPerformed(ActionEvent arg0) {
	            interf.setSize(1920, 1080);
	            interf.repaint();
	            ustaw.setSize(1920, 1080);
	            ustaw.repaint();
	            rozd.setSize(1920, 1080);
	            rozd.repaint();
	        }
	    });
	}
}
