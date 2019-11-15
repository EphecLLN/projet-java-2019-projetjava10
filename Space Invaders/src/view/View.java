package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.bordeaux.poo.Game;
import fr.bordeaux.poo.Map;
import fr.bordeaux.poo.Ship;



public class View extends JFrame {

	Game g;
	
	JFrame frame;
	
	Dimension dim;
	ImageIcon iconShip;
	
	JPanel gamePanel;
	
	JLabel labelShip;
	
	
	public View(Game g) {
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
		iconShip = new ImageIcon(this.getClass().getResource("ship.gif"));
				
		//The ship
		labelShip = new JLabel(iconShip);
		labelShip.setBounds(g.getShip().getX(), g.getShip().getY(), Map.SHIP_WIDTH, Map.SHIP_HEIGHT);
		gamePanel.add(labelShip);
				
		
		frame.setSize(dim);
		frame.setMinimumSize(dim);
		frame.setMaximumSize(dim);
		frame.pack();
		frame.setVisible(true);
	}
	
	

	public JLabel getLabelShip() {
		return labelShip;
	}

}
