/**
 * 
 */
package ca.csf.dfc.Dessin.vue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;


import ca.csf.dfc.Dessin.Modele.DessinableFormeRectangle;
import ca.csf.dfc.Dessin.Modele.Emplacement;
import ca.csf.dfc.Dessin.Modele.FormeGraphique;
import ca.csf.dfc.Dessin.Modele.ModeleDessin;
import ca.csf.dfc.Dessin.Modele.Rectangle;
import ca.csf.dfc.Dessin.controlleur.GrosControlleur;





/**
 * @author Keavin
 *
 */

public class Fenetre extends JFrame implements Observer { 
	
	
	private ModeleDessin m_modeleDessin =new ModeleDessin();
	private Dessin conteneurPrincipal=new Dessin();
	
	
	
	//WTF JPanel boutonsDessin=new JPanel();
	
	//////////////////////////
	JMenuBar menuBar=new JMenuBar();
	
	JMenu menuFichier=new JMenu("Fichier");
	
	JMenu menuEdit=new JMenu("Édition");
	///////////////////////////
	ButtonGroup radioButtonGroup=new ButtonGroup();
	
	//panneau de bouton gauche
	
	JPanel buttonPanel=new JPanel();
	JPanel dessinPanel=new JPanel();
	JPanel optionNordPanel=new JPanel();
	
	RedimensionnerDialog rDialog=new RedimensionnerDialog();
	
	public Fenetre(GrosControlleur p_controlleur) {

		this.setTitle("Fenêtre de travail");
		this.setSize(1500, 1100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		
		conteneurPrincipal.setLayout(new BorderLayout());
		this.add(conteneurPrincipal);
		this.addMouseListener(new GestSouris());
		
		//boutons a gauche
		///////////////////////////////////////
		buttonPanel.setLayout(new GridLayout(3,1));
		JButton buttonEllipse=new JButton("un dessin d'ellipse");
		JButton buttonRectangle =new JButton("un dessin de rectangle");
		JButton buttonLigne=new JButton("un dessin de ligne");	
		buttonPanel.add(buttonEllipse);
		buttonPanel.add(buttonRectangle);
		buttonPanel.add(buttonLigne);
		///////////////////////////////////////////
		//radio boutons  ///////NORD/////
		//////////////////////////////////////////////
		JRadioButton radioButtonPleine =new JRadioButton("pleine");
		JRadioButton radioButtonVide = new JRadioButton("vide");
		
		ButtonGroup radioButtonGroup= new ButtonGroup();
		radioButtonGroup.add(radioButtonVide);
		radioButtonGroup.add(radioButtonPleine);

		optionNordPanel.add(radioButtonPleine);
		optionNordPanel.add(radioButtonVide);
		
		/////////////////////////////////
		//Grosseur du trait textfield///NORD//////
		///////////////////////////////////////////////
		JLabel strTrait=new JLabel("Grosseur du Trait");
		JTextField textFieldTrait=new JTextField(2);
		JPanel jPanelTrait=new JPanel();
		jPanelTrait.add(strTrait);
		jPanelTrait.add(textFieldTrait);
		optionNordPanel.add(jPanelTrait);
		
		//////////////////////////////
		//Color Chooser/////////NORD
		/////////////////////////////////////
		JColorChooser couleur=new JColorChooser();
		optionNordPanel.add(couleur);
		
		
		
		//Menu fichier
		menuFichier.add(new JMenuItem("Nouveau Dessin"));
		menuFichier.add(new JMenuItem("Charger XML"));
		menuFichier.add(new JMenuItem("Sauvegarder XML"));
		menuFichier.add(new JMenuItem("Exporter SVG"));
		
		//Menu Edition
		JMenuItem itemRedimensionner=new JMenuItem("Redimensionner");
		menuEdit.add(itemRedimensionner);
		itemRedimensionner.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rDialog.show();
				
			}
		});
		
		
		
		//la bar du menu
		menuBar.add(menuFichier);
		menuBar.add(menuEdit);
		
		dessinPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		conteneurPrincipal.add(optionNordPanel,BorderLayout.NORTH);
		conteneurPrincipal.add(buttonPanel,BorderLayout.WEST);
		conteneurPrincipal.add(dessinPanel, BorderLayout.CENTER);
		this.setJMenuBar(menuBar);
	
		this.setContentPane(conteneurPrincipal);
	
	}


	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable p_o, Object p_arg) {
		conteneurPrincipal.repaint();
		//dessinerModele(m_modeleDessin);
	}
	 private class GestSouris implements MouseListener
	    {

		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseClicked(MouseEvent p_e) {
			Emplacement emplacement=new Emplacement(p_e.getX(),p_e.getY());
			
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
		 */
		@Override
		public void mousePressed(MouseEvent p_e) {
			// TODO Auto-generated method stub
			
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseReleased(MouseEvent p_e) {
			// TODO Auto-generated method stub
			
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseEntered(MouseEvent p_e) {
			// TODO Auto-generated method stub
			
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseExited(MouseEvent p_e) {
			// TODO Auto-generated method stub
			
		}

	       

	    }
		
}

