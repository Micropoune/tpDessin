package ca.csf.dfc.Dessin.Modele;
import java.awt.Color;

import ca.csf.dfc.Dessin.Modele.Emplacement;
import ca.csf.dfc.Dessin.Modele.FormeGeometrique;

/**
 * 
 */

/**
 * @author Sylvie
 *
 */
public class Elipse extends FormeGeometrique{

	/**
	 * Constructeur par initialisation de la forme Elipse
	 * @param p_CouleurContour
	 * @param p_Epaisseur
	 * @param p_Emplacement
	 * @param p_CouleurRemplissage
	 * @param p_ValX
	 * @param p_ValY
	 * @param p_Largeur
	 * @param p_Hauteur
	 */
	public Elipse(Color p_CouleurContour, int p_Epaisseur, Emplacement p_Emplacement, Color p_CouleurRemplissage,
			int p_ValX, int p_ValY, int p_Largeur, int p_Hauteur) 
	{
		super(p_CouleurContour, p_Epaisseur, p_Emplacement, p_CouleurRemplissage, p_ValX, p_ValY, p_Largeur, p_Hauteur);
	}

}
