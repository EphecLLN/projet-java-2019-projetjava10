package view;
import controller.Entity;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Jeu;
import model.Ennemi;
public class View {

	Jeu g;
	//Img img = new Img();
	
	
	JFrame frame;
	
	Dimension dim;
	ImageIcon iconInvader, iconShip;
	
	JPanel gamePanel;
	
	Hashtable<Ennemi , JLabel> labelInvaders;
	JLabel labelVaisseau;
	
	
	
	public View(Jeu g) {
		this.g = g;
		this.labelInvaders = new Hashtable<Ennemi, JLabel>();
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void createInvaderLabel(Ennemi i) {
		JLabel invaderLabel = new JLabel(iconInvader);
		invaderLabel.setBounds(i.getX() , i.getY() , i.getLargeur() , i.getHauteur());
		gamePanel.add(invaderLabel);
		labelInvaders.put(i, invaderLabel);
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
		//iconShip = new ImageIcon(this.getClass().getResource(img.iconInvader));
		iconShip = new ImageIcon(this.getClass().getResource("ship.png"));
		iconInvader = new ImageIcon(this.getClass().getResource("invader.gif"));
				
		//The ship
		labelVaisseau = new JLabel(iconShip);
		labelVaisseau.setBounds(g.getVaisseau().getX(), g.getVaisseau().getY(), Map.VAISSEAU_WIDTH, Map.VAISSEAU_HEIGHT);
		gamePanel.add(labelVaisseau);
		
		//The Invaders
				for (Ennemi i: g.getEnnemi()) createInvaderLabel(i);
				frame.setSize(dim);
				frame.setMinimumSize(dim);
				frame.setMaximumSize(dim);
				frame.pack();
				frame.setVisible(true);
			}
		
	
	private void createInvaderLabels() {
		for (Ennemi i : g.getEnnemi()) {
			if (!labelInvaders.containsKey(i)) createInvaderLabel(i);
 		}
	}
	
	private void refreshLabelEntity(JLabel l ,Entity e) {
		l.setBounds(e.getX(), e.getY(), e.getLargeur(), e.getHauteur());
	}
	
	public void refresh() {
		createInvaderLabels();
		
		//Invaders
		Enumeration<Ennemi> ei = labelInvaders.keys();
		while  (ei.hasMoreElements()) {
			Ennemi i = ei.nextElement();
			if (i.isEnVie()) refreshLabelEntity(labelInvaders.get(i), i);
		}
		
	}
	

	public JLabel getLabelShip() {
		return labelVaisseau;
	}

}
