package br.com.submarine.builder.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.submarine.builder.SubmarineBuilder;
import br.com.submarine.exception.InvalidNavigationException;
import br.com.submarine.model.SubmarineNavigation;

public class SubmarineBuilderTest {

	@Test(expected = IllegalArgumentException.class)
	public void testSubmarineNavigationNullComandEsperandoIllegalArgumentException() throws Exception {
		new SubmarineBuilder().setNavigationStartPoint()
							  .navigationForComand(null)
							  .printResulNavigation();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testSubmarineNavigationComand(){
		try {
			String cmdToNavigate = "RMMLMMMDDLL";
			SubmarineBuilder builder = new SubmarineBuilder().setNavigationStartPoint()
										   .navigationForComand(cmdToNavigate)
										   .printResulNavigation();
		
			SubmarineNavigation result = builder.getSubmarineNavigation();
			
			Assert.assertEquals("OESTE", result.getNavigationPoint());
			
		} catch (InvalidNavigationException e) {
			System.out.println("erro comando navigation " + e.getMessage());
			e.printStackTrace();
		}	
	}

}
