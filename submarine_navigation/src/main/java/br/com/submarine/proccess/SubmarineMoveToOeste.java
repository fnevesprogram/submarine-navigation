package br.com.submarine.proccess;

import br.com.submarine.exception.InvalidNavigationException;
import br.com.submarine.model.SubmarineNavigation;

public class SubmarineMoveToOeste implements IMove<SubmarineNavigation> {

	public IMove<SubmarineNavigation> move(SubmarineNavigation t) throws InvalidNavigationException {
		SubmarineNavigation.moveLeftPositionO();
		return this;
	}

	public Integer getValue() {
		return 0;
	}

	public String getCadinatePoint() {
		String cardinate = SubmarineNavigation.getCardealPoint();
		return cardinate;
	}

}
