/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.util.ArrayList;
import java.util.List;

import com.sun.prism.Graphics;

import ca.csf.dfc.Dessin.Observable.Fenetre;
import ca.csf.dfc.Dessin.Observable.Observer;
import ca.csf.dfc.Dessin.Observable.VueEspaceDeTravail;

/**
 * @author Sylvie
 *
 */
public class ModeleDessin extends ModeleDessinAbstrait
{
	
	private Fenetre m_Canvas=new Fenetre(null) ;

	/* (non-Javadoc)
	 * @see ca.csf.dfc.Dessin.Observable.Observable#addObserver(ca.csf.dfc.Dessin.Observable.Observer)
	 */
	
	
	
	
	
public void dessiner(IDessinable p_FormeADessiner) 
	{
		
		//il faut ajouter l<objet forme a dessiner au canvas.
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public void addObserver(Observer p_obs) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see ca.csf.dfc.Dessin.Observable.Observable#removeObserver()
	 */
	@Override
	public void removeObserver() {
		// TODO Auto-generated method stub
		
	}










	/* (non-Javadoc)
	 * @see ca.csf.dfc.Dessin.Observable.Observable#notifyObserver(java.lang.String)
	 */
	@Override
	public void notifyObserver(String p_forme) {
		// TODO Auto-generated method stub
		
	}










	/* (non-Javadoc)
	 * @see ca.csf.dfc.Dessin.Modele.ModeleDessinAbstrait#setFormeADessiner(java.lang.String)
	 */
	@Override
	public void setFormeADessiner(String p_forme) {
		// TODO Auto-generated method stub
		
	}










	/* (non-Javadoc)
	 * @see ca.csf.dfc.Dessin.Modele.ModeleDessinAbstrait#getFormeADessiner()
	 */
	@Override
	public String getFormeADessiner() {
		// TODO Auto-generated method stub
		return null;
	}










	/* (non-Javadoc)
	 * @see ca.csf.dfc.Dessin.Modele.ModeleDessinAbstrait#dessiner()
	 */
	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		
	}

		
}

