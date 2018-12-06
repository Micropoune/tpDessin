package ca.csf.dfc.Dessin.Modele;
/**
 * 
 */

import java.awt.Color;

import ca.csf.dfc.Dessin.Modele.Emplacement;
import ca.csf.dfc.Dessin.Modele.FormeGraphique;

/**
 * @author Sylvie
 *
 */
public abstract class FormeGeometrique extends FormeGraphique {

	
	private Color m_CouleurRemplissage;
	private int m_Largeur;
	private int m_Hauteur;
/**
 * Constructeur d<initialisation
 * @param p_CouleurContour
 * @param p_Epaisseur
 * @param p_Emplacement
 * @param p_CouleurRemplissage
 */
	public FormeGeometrique(Color p_CouleurContour, int p_Epaisseur, Emplacement p_Emplacement, 
			Color p_CouleurRemplissage, int p_ValX, int p_ValY,
			int p_Largeur, int p_Hauteur) {
			super(p_CouleurContour, p_Epaisseur, p_Emplacement);
			this.m_CouleurRemplissage=p_CouleurRemplissage;
			this.m_Emplacement.setX(p_ValX);
			this.m_Emplacement.setY(p_ValY);
			this.m_Hauteur=p_Hauteur;
			this.m_Largeur=p_Hauteur;
	}
	
	//abstract void dessiner(Color p_CouleurContour, Color p_CouleurRemplissage);

	/**
	 * 
	 * @return la couleur de remplissage de la forme
	 */
	public Color getCouleurRemplissage() {
		return this.m_CouleurRemplissage;
	}
	/**
	 * fixe la couleur de remplissage de la forme
	 * @param p_Couleur
	 */
	public void setCouleurRemplissage(Color p_Couleur) {
		this.m_CouleurRemplissage = p_Couleur;
	}
	public int getLargeur() {
		return this.m_Largeur;
	}
	
	public void setLargeur(int p_Largeur) {
		this.m_Largeur = p_Largeur;
	}
	
	public int getHauteur() {
		return this.m_Hauteur;
	}
	
	public void setHauteur(int p_Hauteur) {
		this.m_Hauteur = p_Hauteur;
	}
	

}

