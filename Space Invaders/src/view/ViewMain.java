  package view;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

/**
 * @author BOHYN Gauthier
 * 
 * La vue du menu en GUI
 */

public class ViewMain extends JFrame implements ActionListener {

	
	
	/**
	 * Variable
	 */
	private JPanel contentPane;
	private JLabel title,lblBohyn,lblGauthier,lblGodart,lblArno,lblTongres,lblCyril;
	private JButton btnSolo,btnSoloPc,btnMulti,BtnRules;
	private JLabel lbDate;
	private JButton btnExit;
	private JTable tableauScore;
	
	/**
	 * Launch the application.
	 * @param args les parametres du jeu.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMain frame = new ViewMain();
					frame.setVisible(true);
					frame.setTitle("Space Invaders");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{50, 100, 80, 80, 80, 35, 80, 80, 80, 0};
		gbl_contentPane.rowHeights = new int[]{30, 70, 50,50, 20, 50, 20, 50, 20, 50, 30, 30, 30, 30, 30, 30, 30};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		title = new JLabel("Space Invaders");
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.gridwidth = 10;
		gbc_title.insets = new Insets(0, 0, 5, 0);
		gbc_title.gridx = 0;
		gbc_title.gridy = 1;
		contentPane.add(title, gbc_title);
		
		btnExit = new JButton("Exit");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 15;
		btnExit.addActionListener(this);
		btnExit.addActionListener(e -> System.exit(0));
		
		
		/*
		 * Tableau des scores qu'il faudra adapter en temps réel
		 *
		 * tableauScore = new JTable();
		 
		Object[][] donnees = {
				{"Bohyn", "Gauthier", "Nul"},
                {"Godart", "Arno", "Encore plus nul"},
                {"Tongres", "Cyril", "Même pas demander"}};
		String[] enTetes = {"Nom", "Prenom", "Score"};
		tableauScore = new JTable(donnees, enTetes);
		getContentPane().add(new JScrollPane(tableauScore));
		pack();
		*/
		
		
		
		
		btnSolo = new JButton("Facile");
		btnSolo.setHorizontalAlignment(SwingConstants.LEFT);
		btnSolo.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		GridBagConstraints gbc_btnSolo = new GridBagConstraints();
		gbc_btnSolo.anchor = GridBagConstraints.WEST;
		gbc_btnSolo.gridwidth = 2;
		gbc_btnSolo.insets = new Insets(0, 0, 5, 5);
		gbc_btnSolo.gridx = 1;
		gbc_btnSolo.gridy = 3;
		contentPane.add(btnSolo, gbc_btnSolo);
		btnSolo.addActionListener(this);
		btnSolo.setMaximumSize(new Dimension(200, 40));
		btnSolo.setMinimumSize(new Dimension(200, 40));
	
		
		
		
		
		btnSoloPc = new JButton("Normal");
		btnSoloPc.setHorizontalAlignment(SwingConstants.LEFT);
		btnSoloPc.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		GridBagConstraints gbc_btnSoloPc = new GridBagConstraints();
		gbc_btnSoloPc.gridwidth = 2;
		gbc_btnSoloPc.anchor = GridBagConstraints.WEST;
		gbc_btnSoloPc.insets = new Insets(0, 0, 5, 5);
		gbc_btnSoloPc.gridx = 1;
		gbc_btnSoloPc.gridy = 5;
		contentPane.add(btnSoloPc, gbc_btnSoloPc);
		btnSoloPc.addActionListener(this);
		btnSoloPc.setMaximumSize(new Dimension(200, 40));
		btnSoloPc.setMinimumSize(new Dimension(200, 40));
		
		
		
		btnMulti = new JButton("Difficile");
		btnMulti.setHorizontalAlignment(SwingConstants.LEFT);
		btnMulti.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		GridBagConstraints gbc_btnMulti = new GridBagConstraints();
		gbc_btnMulti.anchor = GridBagConstraints.WEST;
		gbc_btnMulti.gridwidth = 2;
		gbc_btnMulti.insets = new Insets(0, 0, 5, 5);
		gbc_btnMulti.gridx = 1;
		gbc_btnMulti.gridy = 7;
		contentPane.add(btnMulti, gbc_btnMulti);
		btnMulti.addActionListener(this);
		btnMulti.setMaximumSize(new Dimension(200, 40));
		btnMulti.setMinimumSize(new Dimension(200, 40));
		
		
		
		
		BtnRules = new JButton("Rules");
		BtnRules.setHorizontalAlignment(SwingConstants.LEFT);
		BtnRules.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		GridBagConstraints gbc_BtnRules = new GridBagConstraints();
		gbc_BtnRules.anchor = GridBagConstraints.WEST;
		gbc_BtnRules.gridwidth = 2;
		gbc_BtnRules.insets = new Insets(0, 0, 5, 5);
		gbc_BtnRules.gridx = 1;
		gbc_BtnRules.gridy = 9;
		contentPane.add(BtnRules, gbc_BtnRules);
		BtnRules.addActionListener(this);
		BtnRules.setMaximumSize(new Dimension(200, 40));
		BtnRules.setMinimumSize(new Dimension(200, 40));
		
		
		
		lblBohyn = new JLabel("BOHYN ");
		GridBagConstraints gbc_lblBohyn = new GridBagConstraints();
		gbc_lblBohyn.anchor = GridBagConstraints.WEST;
		gbc_lblBohyn.insets = new Insets(0, 0, 5, 5);
		gbc_lblBohyn.gridx = 0;
		gbc_lblBohyn.gridy = 12;
		contentPane.add(lblBohyn, gbc_lblBohyn);
		
		lblGauthier = new JLabel("Gauthier");
		GridBagConstraints gbc_lblGauthier = new GridBagConstraints();
		gbc_lblGauthier.anchor = GridBagConstraints.WEST;
		gbc_lblGauthier.insets = new Insets(0, 0, 5, 5);
		gbc_lblGauthier.gridx = 1;
		gbc_lblGauthier.gridy = 12;
		contentPane.add(lblGauthier, gbc_lblGauthier);
		
		lblGodart = new JLabel("GODART");
		GridBagConstraints gbc_lblGodart = new GridBagConstraints();
		gbc_lblGodart.anchor = GridBagConstraints.WEST;
		gbc_lblGodart.insets = new Insets(0, 0, 5, 5);
		gbc_lblGodart.gridx = 0;
		gbc_lblGodart.gridy = 13;
		contentPane.add(lblGodart, gbc_lblGodart);
		
		lblArno = new JLabel("Arno");
		GridBagConstraints gbc_lblArno = new GridBagConstraints();
		gbc_lblArno.anchor = GridBagConstraints.WEST;
		gbc_lblArno.insets = new Insets(0, 0, 5, 5);
		gbc_lblArno.gridx = 1;
		gbc_lblArno.gridy = 13;
		contentPane.add(lblArno, gbc_lblArno);
		
		lblTongres = new JLabel("TONGRES");
		GridBagConstraints gbc_lblTongres = new GridBagConstraints();
		gbc_lblTongres.anchor = GridBagConstraints.WEST;
		gbc_lblTongres.insets = new Insets(0, 0, 5, 5);
		gbc_lblTongres.gridx = 0;
		gbc_lblTongres.gridy = 14;
		contentPane.add(lblTongres, gbc_lblTongres);
		
		lblCyril = new JLabel("Cyril");
		GridBagConstraints gbc_lblCyril = new GridBagConstraints();
		gbc_lblCyril.anchor = GridBagConstraints.WEST;
		gbc_lblCyril.insets = new Insets(0, 0, 5, 5);
		gbc_lblCyril.gridx = 1;
		gbc_lblCyril.gridy = 14;
		contentPane.add(lblCyril, gbc_lblCyril);
		contentPane.add(btnExit, gbc_btnExit);
		
		lbDate = new JLabel("Janvier 2020");
		GridBagConstraints gbc_lbDate = new GridBagConstraints();
		gbc_lbDate.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lbDate.gridwidth = 3;
		gbc_lbDate.gridx = 7;
		gbc_lbDate.gridy = 15;
		contentPane.add(lbDate, gbc_lbDate);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	


}
