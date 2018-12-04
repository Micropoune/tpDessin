/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @author Sylvie
 *
 */
public abstract class DessinableFormeRectangle extends Dessinable{
	private Graphics m_Graphics;
	private FormeGeometrique m_formeDessin; 
	
	/**
	 * COnstructeur
	 */
	public DessinableFormeRectangle() 
	{
		super();
	}

	
	public void dessiner(FormeGeometrique p_formeGeometrique)
	{
		this.m_formeDessin=p_formeGeometrique; 
		
		((Graphics2D)this.m_Graphics).setStroke(new BasicStroke(p_formeGeometrique.getEpaisseur()));
		  
		  if(p_formeGeometrique.getCouleurRemplissage() != null) {
			  this.m_Graphics.setColor(p_formeGeometrique.getCouleurRemplissage());
			  this.m_Graphics.fillRect(
					 p_formeGeometrique.getEmplacement().getX(),
					 p_formeGeometrique.getEmplacement().getY(),
					 p_formeGeometrique.getLargeur(),
					 p_formeGeometrique.getHauteur()
					 );
		  }
		  
		  this.m_Graphics.setColor(p_formeGeometrique.get_CouleurContour());
		  this.m_Graphics.drawRect(p_formeGeometrique.getEmplacement().getX(), p_formeGeometrique.getEmplacement().getY(), p_formeGeometrique.getLargeur(), p_formeGeometrique.getHauteur());
	}
	public FormeGraphique getObjetDessine()
	{
		return m_formeDessin;
	}
	
}
