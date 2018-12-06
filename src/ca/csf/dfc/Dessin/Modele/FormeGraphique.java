/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.awt.Color;

/**
 * @author Sylvie
 *
 */
public abstract class FormeGraphique {
	
	protected Color m_CouleurContour;
	protected int m_Epaisseur;
	protected Emplacement m_Emplacement;
	
	/**
	 * Constructeur par initialisation
	 */
	public FormeGraphique() {
		
	}
	/**
	   * Constructeur d'initialisation
	   * 
	   * @param p_couleur : Couleur du contour
	   * @param p_epaisseur : Epaisseur du contour
	   * @param p_emplacement : Emplacement de la forme
	   */
	  public FormeGraphique(Color p_couleur, int p_epaisseur, Emplacement p_emplacement)
	  {
		  this.m_CouleurContour = p_couleur;
		  this.m_Epaisseur = p_epaisseur;
		  this.m_Emplacement = p_emplacement;
	  }
	  /**
	   * 
	   * @return La couleur du contour du dessin
	   */
	public Color get_CouleurContour() {
		return this.m_CouleurContour;
	}
	/**
	  * Fixe la couleur du contour du dessin
	  * 
	  * @param p_couleurContour
	  */
	public void setCouleurContour(Color p_CouleurContour) {
		this.m_CouleurContour = p_CouleurContour;
	}
	 /**
	   * 
	   * @return L'épaisseur du contour du dessin
	   */
	public int getEpaisseur() {
		return this.m_Epaisseur;
	}
	/**
	   * Fixe l'épaisseur du contour du dessin
	   * 
	   * @param p_epaisseur
	   */
	public void setEpaisseur(int p_Epaisseur) {
		this.m_Epaisseur = p_Epaisseur;
	}
	/**
	   * 
	   * @return L'emplacement de la forme sur le dessin (position X et Y)
	   */
	public Emplacement getEmplacement() {
		return this.m_Emplacement;
	}
	 /**
	   * Fixe l'emplacement de la forme sur le dessin (position X et Y)
	   * 
	   * @param p_emplacement
	   */
	public void setEmplacement(	int p_X, int p_Y) 
	{
		this.m_Emplacement.setX(p_X);
		this.m_Emplacement.setY(p_Y);
	}

}

