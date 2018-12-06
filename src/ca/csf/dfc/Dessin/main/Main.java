/**
 * 
 */
package ca.csf.dfc.Dessin.main;

import ca.csf.dfc.Dessin.Modele.ModeleDessin;
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
		ModeleDessin modeleDessinAbstrait=new ModeleDessin();
		
		////creation controleur

		//Le gros controlleur existe seulement dans thomas le train.
	//	ControleurAbstraitDessin controleur=new ControleurDessin(modeleDessinAbstrait);
		
		//creation de la vue


		Fenetre f=new Fenetre();
		
		modeleDessinAbstrait.addObserver(f);
		f.setVisible(true);

	}

}
