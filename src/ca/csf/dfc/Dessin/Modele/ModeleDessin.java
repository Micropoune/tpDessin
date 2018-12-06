/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


/**
 * @author Sylvie
 *
 */
public class ModeleDessin extends Observable
{

	List<FormeGraphique> m_listeFormes = new ArrayList<>();


	public ModeleDessin(){

	}

	public void addForme(FormeGraphique p_forme)
	{
		m_listeFormes.add(p_forme);
	}

	public List<FormeGraphique> getListForme(){
		return m_listeFormes;
	}
		
}

