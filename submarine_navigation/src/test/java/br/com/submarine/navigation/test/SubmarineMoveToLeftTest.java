package br.com.submarine.navigation.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.submarine.builder.SubmarineBuilder;
import br.com.submarine.model.SubmarineNavigation;
import br.com.submarine.proccess.FactoryNavigation;
import br.com.submarine.proccess.IMove;

public class SubmarineMoveToLeftTest {

	@Test
	public void testNavigationToLeft() throws Exception {
		
		SubmarineBuilder builder = new SubmarineBuilder();
		builder.setNavigationStartPoint();
		
		SubmarineNavigation navigationLeste = new SubmarineNavigation();
		navigationLeste.setNavigationPoint("L");
		IMove<SubmarineNavigation> result = new FactoryNavigation().processValueNavigationForMoviment(navigationLeste);		
		builder.printResulNavigation();
		
		Assert.assertEquals(0, result.getValue(), 0.00001);
		Assert.assertEquals(result.getCadinatePoint(), "OESTE"); 
	}
	
}
