package ca.csf.dfc.Dessin.controlleur;

import ca.csf.dfc.Dessin.Modele.*;
import ca.csf.dfc.Dessin.Modele.Rectangle;

import java.awt.*;

public class GrosControlleur {
	private DessinableFormeRectangle m_formeADessiner = new DessinableFormeRectangle();


    /**
	 * @param p_modeleDessin
	 */
	public GrosControlleur(ModeleDessin p_modeleDessin) {
		
	}

	public void ajouterLigne(ModeleDessin p_dessin, int p_x1, int p_y1, int p_x2, int p_y2)
    {
        Color brun_sylvie= new Color(165,42,42);
        Emplacement p_emplacement=new Emplacement(10,10);
		Ligne l = new LigneDroite(brun_sylvie, 5, p_emplacement,10, 10, 10, 10);
		p_dessin.addForme(l);
		p_dessin.notifyObservers();
		
    }
	public void ajouterRectangleModeleDessin (ModeleDessin p_dessin, int p_x1, int p_y1, int p_x2, int p_y2) 
	{
		Color brun_sylvie= new Color(165,42,42);
    
        Emplacement emplacement=new Emplacement(200,200);
		Rectangle r=new Rectangle(brun_sylvie, 10, emplacement, Color.black, p_x1, p_y1, p_x2, p_y2) ;
		p_dessin.addForme(r);
		this.m_formeADessiner.dessiner(r);
		p_dessin.notifyObservers();
		
	}
}
