/**
 * 
 */
package ca.csf.dfc.Dessin.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import ca.csf.dfc.Dessin.Modele.Emplacement;
import ca.csf.dfc.Dessin.Modele.FormeGeometrique;
import ca.csf.dfc.Dessin.Modele.Rectangle;

/**
 * @author Sylvie
 *
 */
class TestsFormeGeometriques {

	@Test
	void testGetCouleurContour() {
		Emplacement emplacement=new Emplacement(100,100);
		FormeGeometrique formeTest1=new Rectangle(Color.red, 10, emplacement, Color.black, 100, 100, 100, 100) ;
		FormeGeometrique formeTest2=new Rectangle(Color.red, 10, emplacement, Color.black, 100, 100, 100, 100) ;	
		assertEquals(formeTest1.get_CouleurContour(), formeTest2.get_CouleurContour());
		};
	@Test
	void testSetCouleurContour() {
		Emplacement emplacement=new Emplacement(100,100);
		FormeGeometrique formeTest1=new Rectangle(Color.red, 10, emplacement, Color.black, 100, 100, 100, 100) ;
		formeTest1.setCouleurContour(Color.orange);
		FormeGeometrique formeTest2=new Rectangle(Color.red, 10, emplacement, Color.black, 100, 100, 100, 100) ;	
		assertNotEquals(formeTest1.get_CouleurContour(), formeTest2.get_CouleurContour());
		};
	
	@Test
	void testGetEpaisseur() {
		Emplacement emplacement=new Emplacement(100,100);
		FormeGeometrique formeTest1=new Rectangle(Color.red, 10, emplacement, Color.black, 100, 100, 100, 100) ;
		FormeGeometrique formeTest2=new Rectangle(Color.red, 10, emplacement, Color.black, 100, 100, 100, 100) ;	
		assertEquals(formeTest1.getEpaisseur(), formeTest2.getEpaisseur());
		};
	@Test
	void testSetEpaisseur() {
		Emplacement emplacement=new Emplacement(100,100);
		FormeGeometrique formeTest1=new Rectangle(Color.red, 10, emplacement, Color.black, 100, 100, 100, 100) ;
		FormeGeometrique formeTest2=new Rectangle(Color.red, 10, emplacement, Color.black, 100, 100, 100, 100) ;	
		assertEquals(formeTest1.getEpaisseur(), formeTest2.getEpaisseur());
		formeTest1.setEpaisseur(102);
		assertNotEquals(formeTest1.getEpaisseur(), formeTest2.getEpaisseur());
		};	
	@Test
	void testGetEmplacement() {
		Emplacement emplacement=new Emplacement(100,100);
		Emplacement emplacement2=new Emplacement(200,200);
		FormeGeometrique formeTest1=new Rectangle(Color.red, 10, emplacement, Color.black, 100, 100, 100, 100) ;
		FormeGeometrique formeTest2=new Rectangle(Color.red, 10, emplacement2, Color.black, 100, 100, 100, 100) ;	
		assertNotEquals(formeTest1.getEmplacement(), formeTest2.getEmplacement());
		};
		
		
	}


