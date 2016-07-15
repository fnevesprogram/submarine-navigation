package br.com.submarine.proccess;

import br.com.submarine.exception.InvalidNavigationException;
import br.com.submarine.model.SubmarineNavigation;

public class SubmarineMoveToSul implements IMove<SubmarineNavigation> {

	public IMove<SubmarineNavigation> move(SubmarineNavigation t) throws InvalidNavigationException {
		SubmarineNavigation.moveDownPositionS();
		return this;
	}

	public Integer getValue() {
		int valueEixo = SubmarineNavigation.eixoZ;
		return valueEixo;
	}

	public String getCadinatePoint() {
		String cardinate = SubmarineNavigation.getCardealPoint();
		return cardinate;
	}
}
