/**
 * 
 */
package ca.csf.dfc.Dessin.Observable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ca.csf.dfc.Dessin.Modele.FormeGraphique;

/**
 * @author Sylvie
 *
 */
public class VueEspaceDeTravail extends JPanel{
	
	private int m_largeur;
	private int m_hauteur;
	
	//je ne suis pas convaincue de la liste
	private List<Integer> m_dimension=new ArrayList<>();
	
	public VueEspaceDeTravail()
	{
		super();
		this.setSize(800,800);
		
	}
	public void redimensionner(int p_largeur, int p_hauteur)
	{
		this.m_largeur=p_hauteur;
		this.m_hauteur=p_hauteur;
	}
	public void setDimensions(int p_largeur, int p_hauteur)
	{
		this.m_dimension.add(p_largeur);
		this.m_dimension.add(p_hauteur);
	}
	public void setHauteur(int p_hauteur)
	{
		this.m_hauteur=p_hauteur;
	}
	public void setLargeur(int p_Largeur)
	{
		this.m_largeur=p_Largeur;
	}
	
	//je ne suis pas convaincue de la liste
	public List<Integer> getDimensions() 
	{
		return this.m_dimension;
	}
	

}
