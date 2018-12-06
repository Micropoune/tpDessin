/**
 * 
 */
package ca.csf.dfc.Dessin.main;

import ca.csf.dfc.Dessin.Modele.ModeleDessin;
import ca.csf.dfc.Dessin.controlleur.GrosControlleur;
import ca.csf.dfc.Dessin.vue.Fenetre;

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
		ModeleDessin modeleDessin=new ModeleDessin();
		
		////creation controleur

		//Le gros controlleur existe seulement dans thomas le train.
		GrosControlleur controlleur=new GrosControlleur(modeleDessin);
		
		//creation de la vue


		Fenetre f=new Fenetre(controlleur);
		
	
		f.setVisible(true);

	}

}
