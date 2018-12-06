/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.awt.Color;

/**
 * @author Sylvie
 *
 */
public class Ligne extends FormeGraphique {

	protected Emplacement m_emplacementDepart;
	protected Emplacement m_emplacementArrive;


	public Ligne(Color p_couleur, int p_epaisseur, Emplacement p_emplacementDepart,Emplacement p_emplacementArrive) {
		super(p_couleur, p_epaisseur, p_emplacementDepart);
		m_emplacementDepart = p_emplacementDepart;
		m_emplacementArrive = p_emplacementArrive;
	}

	/**
	 * @param p_couleur
	 * @param p_epaisseur
	 * @param p_emplacement
	 * @param p_valXDepart
	 * @param p_valYDepart
	 * @param p_valXArrivee
	 * @param p_valYArrivee
	 */
	//
	public Ligne(Color p_couleur, int p_epaisseur, Emplacement p_emplacement, int p_valXDepart, int p_valYDepart,
			int p_valXArrivee, int p_valYArrivee) {
		
	}

	public Emplacement getEmplacementDepart() {
		return m_emplacementDepart;
	}

	public Ligne setEmplacementDepart(Emplacement m_emplacementDepart) {
		this.m_emplacementDepart = m_emplacementDepart;
		return this;
	}

	public Emplacement getEmplacementArrive() {
		return m_emplacementArrive;
	}

	public Ligne setEmplacementArrive(Emplacement m_emplacementArrive) {
		this.m_emplacementArrive = m_emplacementArrive;
		return this;
	}
}
