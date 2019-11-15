package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Jeu;

public class View {

	Jeu g;
	Img img = new Img();
	
	
	JFrame frame;
	
	Dimension dim;
	ImageIcon iconShip;
	
	JPanel gamePanel;
	
	JLabel labelVaisseau;
	
	
	
	public View(Jeu g) {
		this.g = g;
	}
	
	public JFrame getFrame() {
		return frame;
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
				
		//The ship
		labelVaisseau = new JLabel(iconShip);
		labelVaisseau.setBounds(g.getVaisseau().getX(), g.getVaisseau().getY(), Map.VAISSEAU_WIDTH, Map.VAISSEAU_HEIGHT);
		gamePanel.add(labelVaisseau);
				
		
		frame.setSize(dim);
		frame.setMinimumSize(dim);
		frame.setMaximumSize(dim);
		frame.pack();
		frame.setVisible(true);
	}
	
	

	public JLabel getLabelShip() {
		return labelVaisseau;
	}

}
