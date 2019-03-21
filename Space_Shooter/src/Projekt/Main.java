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
	            ustaw.setSize(1280, 720);
	            rozd.setSize(1280, 720);
	        }
	    });
		
		rozd.p768.addActionListener(new ActionListener() {
			 @Override
	         public void actionPerformed(ActionEvent arg0) {
	            interf.setSize(1366, 768);
	            ustaw.setSize(1366, 768);
	            rozd.setSize(1366, 768);
	        }
	    });
		
		rozd.p1080.addActionListener(new ActionListener() {
			 @Override
	         public void actionPerformed(ActionEvent arg0) {
	            interf.setSize(1920, 1080);
	            ustaw.setSize(1920, 1080);
	            rozd.setSize(1920, 1080);
	        }
	    });
	}
}
