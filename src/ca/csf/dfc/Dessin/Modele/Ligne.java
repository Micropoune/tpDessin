/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.awt.Color;

/**
 * @author Sylvie
 *
 */
public abstract class Ligne extends FormeGraphique {
	private int m_ValXDepart;
	private int m_ValYDepart;
	private int m_ValXArrivee;
	private int m_ValYArrivee;

	/**
	 * @param p_couleur
	 * @param p_epaisseur
	 * @param p_emplacement
	 */
	public Ligne(Color p_couleur, int p_epaisseur, Emplacement p_emplacement,int p_ValXDepart, int p_ValYDepart, int p_ValXArrivee, int p_ValYArrivee) {
		super(p_couleur, p_epaisseur, p_emplacement);
		this.m_ValXDepart=p_ValXDepart;
		this.m_ValYDepart=p_ValYDepart;
		this.m_ValXArrivee=p_ValXArrivee;
		this.m_ValYArrivee=p_ValYArrivee;
	}

}
