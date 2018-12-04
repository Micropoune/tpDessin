/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.util.ArrayList;
import java.util.List;

import com.sun.prism.Graphics;

import ca.csf.dfc.Dessin.Observable.VueEspaceDeTravail;

/**
 * @author Sylvie
 *
 */
public class ModeleDessin 
{
	private List<FormeGraphique> m_ListeFormes=new ArrayList<>();
	private VueEspaceDeTravail m_Canvas=new VueEspaceDeTravail() ;
	
	public ModeleDessin()
	{
		
	}
	public void dessiner(IDessinable p_FormeADessiner) 
	{
		this.m_ListeFormes.add(p_FormeADessiner.getbjetDessine());
		//il faut ajouter l<objet forme a dessiner au canvas.
	}
		
}

