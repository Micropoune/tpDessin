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

	private Emplacement m_emplacementDepart;
	private Emplacement m_emplacementArrive;


	public Ligne(Color p_couleur, int p_epaisseur, Emplacement p_emplacementDepart,Emplacement p_emplacementArrive) {
		super(p_couleur, p_epaisseur, p_emplacementDepart);
		m_emplacementDepart = p_emplacementDepart;
		m_emplacementArrive = p_emplacementArrive;

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
