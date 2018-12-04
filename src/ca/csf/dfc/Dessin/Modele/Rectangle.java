/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.awt.Color;

/**
 * @author Sylvie
 *
 */
public class Rectangle extends FormeGeometrique {

	/**
	 * Constructeur par initialisation de la forme Rectangle
	 * @param p_CouleurContour
	 * @param p_Epaisseur
	 * @param p_Emplacement
	 * @param p_CouleurRemplissage
	 * @param p_ValX
	 * @param p_ValY
	 * @param p_Largeur
	 * @param p_Hauteur
	 */
	public Rectangle(Color p_CouleurContour, int p_Epaisseur, Emplacement p_Emplacement, Color p_CouleurRemplissage,
			int p_ValX, int p_ValY, int p_Largeur, int p_Hauteur) {
		super(p_CouleurContour, p_Epaisseur, p_Emplacement, p_CouleurRemplissage, p_ValX, p_ValY, p_Largeur, p_Hauteur);
		// TODO Auto-generated constructor stub
	}

}
