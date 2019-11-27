package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Ennemi;
import controller.Missile;
import model.Jeu;
import controller.Entite;

public class View {
	
	Jeu g;
	
	JFrame frame;
	
	Dimension dim;
	ImageIcon iconEnnemi, iconVaisseau;
	
	JPanel gamePanel;
	
	Hashtable<Ennemi , JLabel> labelEnnemi;
	JLabel labelVaisseau;
	Hashtable<Missile, JLabel> labelMissiles;
	
	
	public View(Jeu g) {
		this.g = g;
		this.labelEnnemi = new Hashtable<Ennemi, JLabel>();
		this.labelMissiles = new Hashtable<Missile, JLabel>();
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void createEnnemiLabel(Ennemi i) {
		JLabel invaderLabel = new JLabel(iconEnnemi);
		invaderLabel.setBounds(i.getX() , i.getY() , i.getLargeur() , i.getHauteur());
		gamePanel.add(invaderLabel);
		labelEnnemi.put(i, invaderLabel);
	}
	
	public void createMissileLabel(Missile m) {
		JLabel missileLabel = new JLabel("I");
		missileLabel.setBounds(m.getX() , m.getY() , m.getLargeur() , m.getHauteur());
		gamePanel.add(missileLabel);
		labelMissiles.put(m, missileLabel);
	}

	public void init() {
		//Frame
		frame = new JFrame("Space Invader");
		frame.getContentPane().setLayout(new BorderLayout());
		
		//Center Panel
		dim = new Dimension(Map.MAP_WIDTH, Map.MAP_HEIGHT);
		gamePanel = new JPanel();
		gamePanel.setMinimumSize(dim);
		gamePanel.setMaximumSize(dim);
		gamePanel.setSize(dim);
		frame.getContentPane().add(gamePanel, BorderLayout.CENTER);
		gamePanel.setLayout(null);
		
		//Icons
		iconEnnemi = new ImageIcon(this.getClass().getResource("invader.gif"));
		iconVaisseau = new ImageIcon(this.getClass().getResource("ship.gif"));
				
		//The ship
		labelVaisseau = new JLabel(iconVaisseau);
		labelVaisseau.setBounds(g.getVaisseau().getX(), g.getVaisseau().getY(), Map.SHIP_WIDTH, Map.SHIP_HEIGHT);
		//labelVaisseau.setBounds(250, 400, Map.SHIP_WIDTH, Map.SHIP_HEIGHT);
		gamePanel.add(labelVaisseau);
		
		
		//The Invaders
		for (Ennemi i: g.getEnnemi()) createEnnemiLabel(i);
		
		
		frame.setSize(dim);
		frame.setMinimumSize(dim);
		frame.setMaximumSize(dim);
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createMissileLabels() {
		for (Missile m : g.getMissiles()) {
			if (!labelMissiles.containsKey(m)) createMissileLabel(m);
 		}
	}
	
	private void createEnnemiLabels() {
		for (Ennemi i : g.getEnnemi()) {
			if (!labelEnnemi.containsKey(i)) createEnnemiLabel(i);
 		}
	}
	
	private void refreshLabelEntity(JLabel l ,Entite e) {
		l.setBounds(e.getX(), e.getY(), e.getLargeur(), e.getHauteur());
	}
	
	public void refresh() {
		//refreshLabelEntity(labelVaisseau, g.getVaisseau());
		createMissileLabels();
		createEnnemiLabels();
		
		//Invaders
		Enumeration<Ennemi> ei = labelEnnemi.keys();
		while  (ei.hasMoreElements()) {
			Ennemi i = ei.nextElement();
			if (i.enVie) refreshLabelEntity(labelEnnemi.get(i), i);
		}
		
		Enumeration<Missile> em = labelMissiles.keys();
		while  (em.hasMoreElements()) {
			Missile m = em.nextElement();
			if (m.enVie) refreshLabelEntity(labelMissiles.get(m), m);
		}	
	}


	public JLabel getLabelShip() {
		return labelVaisseau;
	}

}
