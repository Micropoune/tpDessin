/**
 * 
 */
package ca.csf.dfc.Dessin.Modele;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import sun.net.www.content.text.plain;

/**
 * @author Sylvie
 *
 */
public class DessinableFormeRectangle {
	private Graphics m_Graphics;
	
	/**
	 * Constructeur
	 */
	public DessinableFormeRectangle(Graphics p_graphics) 
	{
		m_Graphics = p_graphics;
	}

	
	public Graphics dessiner(Rectangle p_formeGeometrique)
	{
		
		
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
		  return this.m_Graphics;
	}
	
	
}
