/**
 * 
 */
package ca.csf.dfc.Dessin.Observable;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument.Content;



/**
 * @author Keavin
 *
 */
public class Fenetre extends JFrame { 
VueEspaceDeTravail conteneurPrincipal=new VueEspaceDeTravail();
//JPanel conteneurPrincipal=new JPanel();


//WTF JPanel boutonsDessin=new JPanel();

//////////////////////////
JMenuBar menuBar=new JMenuBar();

JMenu menuFichier=new JMenu("Fichier");

JMenu menuEdit=new JMenu("Édition");
///////////////////////////


//panneau de bouton gauche

JPanel buttonPanel=new JPanel();
JPanel dessinPanel=new JPanel();
	
	public Fenetre() {

		this.setTitle("Fenêtre de travail");
		this.setSize(1500, 1100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		
		conteneurPrincipal.setLayout(new BorderLayout());
		this.add(conteneurPrincipal);
		
		
		//boutons
		///////////////////////////////////////
		buttonPanel.setLayout(new GridLayout(3,1));
		JButton buttonEllipse=new JButton("un dessin d'ellipse");
		JButton buttonRectangle =new JButton("un dessin de rectangle");
		JButton buttonLigne=new JButton("un dessin de ligne");	
		buttonPanel.add(buttonEllipse);
		buttonPanel.add(buttonRectangle);
		buttonPanel.add(buttonLigne);
		///////////////////////////////////////////
		
		
		
		
		//Menu fichier
		menuFichier.add(new JMenuItem("Nouveau Dessin"));
		menuFichier.add(new JMenuItem("Charger XML"));
		menuFichier.add(new JMenuItem("Sauvegarder XML"));
		menuFichier.add(new JMenuItem("Exporter SVG"));
		
		//Menu Edition
		menuEdit.add(new JMenuItem("Redimensionner"));
		
		
		menuBar.add(menuFichier);
		menuBar.add(menuEdit);
		
		conteneurPrincipal.add(buttonPanel,BorderLayout.WEST);
		conteneurPrincipal.add(dessinPanel, BorderLayout.CENTER);
		this.setJMenuBar(menuBar);
	
		this.setContentPane(conteneurPrincipal);
		
		
		
	}
}
