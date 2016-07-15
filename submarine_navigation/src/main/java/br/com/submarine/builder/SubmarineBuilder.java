package br.com.submarine.builder;

import br.com.submarine.exception.InvalidNavigationException;
import br.com.submarine.model.SubmarineNavigation;
import br.com.submarine.proccess.FactoryNavigation;

public class SubmarineBuilder {

	private final SubmarineNavigation submarine = new SubmarineNavigation();

	public SubmarineBuilder setNavigationStartPoint() {
		SubmarineNavigation.setCardealPoint("NORTE");
		SubmarineNavigation.eixoX = 0;
		SubmarineNavigation.eixoY = 0;
		SubmarineNavigation.eixoZ = -1;
		return this;
	}

	public SubmarineBuilder navigationForComand(String comandNavigation) throws InvalidNavigationException {
		validaParametro(comandNavigation);
		FactoryNavigation factory = new FactoryNavigation();

		int n = comandNavigation.length();
		for (int i = 0; i < n; i++) {
			if ((comandNavigation.charAt(i) == 'L')) {
				submarine.setNavigationPoint("L");
				factory.processValueNavigationForMoviment(submarine);
			}
			if ((comandNavigation.charAt(i) == 'R')) { 
				submarine.setNavigationPoint("R");
				factory.processValueNavigationForMoviment(submarine);
			}
			if ((comandNavigation.charAt(i) == 'M')) { 
				submarine.setNavigationPoint("M");
				factory.processValueNavigationForMoviment(submarine);
			}
			if ((comandNavigation.charAt(i) == 'U')) { 
				submarine.setNavigationPoint("U");
				factory.processValueNavigationForMoviment(submarine);
			}
			if ((comandNavigation.charAt(i) == 'D')) { 
				submarine.setNavigationPoint("D");
				factory.processValueNavigationForMoviment(submarine);
			}
		}
		return this;
	}


	public SubmarineBuilder printResulNavigation() {
		System.out.print(SubmarineNavigation.eixoX);
		System.out.print(" ");
		System.out.print(SubmarineNavigation.eixoY);
		System.out.print(" ");
		System.out.print(SubmarineNavigation.eixoZ);
		System.out.print(" ");
		System.out.print(SubmarineNavigation.getCardealPoint());
		return this;
	}

	public SubmarineNavigation getSubmarineNavigation() {
		return submarine;
	}

	public void validaParametro(Object parametro) {
		if (parametro == null) {
			throw new IllegalArgumentException("the command can not be null.");
		}
	}
}
