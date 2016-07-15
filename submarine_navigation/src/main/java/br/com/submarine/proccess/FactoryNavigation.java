package br.com.submarine.proccess;

import br.com.submarine.exception.InvalidNavigationException;
import br.com.submarine.model.SubmarineNavigation;
import br.com.submarine.operation.NavigationEnum;

public class FactoryNavigation implements IFactoryNavigation<SubmarineNavigation>{

	private IMove<SubmarineNavigation> navigation;
	
	public IMove<SubmarineNavigation> processValueNavigationForMoviment(SubmarineNavigation submarineNavigation)
			throws InvalidNavigationException {
		
		try {
			if ( NavigationEnum.L.toString().equals(submarineNavigation.getNavigationPoint()) ) {
				return moveToOeste(submarineNavigation);
			} 
			else if ( NavigationEnum.R.toString().equals(submarineNavigation.getNavigationPoint()) ) {
				return moveToLeste(submarineNavigation);
			}
			else if ( NavigationEnum.D.toString().equals(submarineNavigation.getNavigationPoint()) ) {
				return moveToSul(submarineNavigation);
			}
			else if ( NavigationEnum.U.toString().equals(submarineNavigation.getNavigationPoint()) ) {
				return moveToNorte(submarineNavigation);
			}
			else if ( NavigationEnum.M.toString().equals(submarineNavigation.getNavigationPoint()) ) {
				return move(submarineNavigation);
			}
			
		} catch (Exception e) {
			throw new InvalidNavigationException(e);
		}
		return navigation;	
	}

	
	private IMove<SubmarineNavigation> moveToNorte(SubmarineNavigation submarineNavigation) 
			throws InvalidNavigationException {
		return new SubmarineMoveToNorte().move(submarineNavigation);
	}
	
	private IMove<SubmarineNavigation> moveToLeste(SubmarineNavigation submarineNavigation) 
			throws InvalidNavigationException {
		return new SubmarineMoveToLeste().move(submarineNavigation);
	}
	
	private IMove<SubmarineNavigation> moveToSul(SubmarineNavigation submarineNavigation) 
			throws InvalidNavigationException {
		return new SubmarineMoveToSul().move(submarineNavigation);
	}
	
	private IMove<SubmarineNavigation> moveToOeste(SubmarineNavigation submarineNavigation) 
			throws InvalidNavigationException {
		return new SubmarineMoveToOeste().move(submarineNavigation);
	}
	
	private IMove<SubmarineNavigation> move(SubmarineNavigation submarineNavigation) 
			throws InvalidNavigationException {
		return new SubmarineMove().move(submarineNavigation);
	}
	
	

	
	
	
	
}
