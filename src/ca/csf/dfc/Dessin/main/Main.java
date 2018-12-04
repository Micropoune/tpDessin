/**
 * 
 */
package ca.csf.dfc.Dessin.main;

import ca.csf.dfc.Dessin.Modele.ModeleDessin;
import ca.csf.dfc.Dessin.Modele.ModeleDessinAbstrait;
import ca.csf.dfc.Dessin.Observable.ControleurAbstraitDessin;
import ca.csf.dfc.Dessin.Observable.ControleurDessin;
import ca.csf.dfc.Dessin.Observable.Fenetre;

/**
 * @author Sylvie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Instanciation du modele
		ModeleDessinAbstrait modeleDessinAbstrait=new ModeleDessin();
		
		//creation controleur
		ControleurAbstraitDessin controleur=new ControleurDessin(modeleDessinAbstrait);
		
		//creation de la vue
		Fenetre f=new Fenetre(controleur);
		
		modeleDessinAbstrait.addObserver(f);
		f.setVisible(true);

	}

}
