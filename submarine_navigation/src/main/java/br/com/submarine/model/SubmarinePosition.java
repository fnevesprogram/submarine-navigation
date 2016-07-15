package br.com.submarine.model;

import br.com.submarine.operation.NavigationEnum;

public class SubmarinePosition {

	private String positionDefault = "N";

	public String getPositionDefault() {
		return positionDefault;
	}

	private NavigationEnum pointNavigation;

	public NavigationEnum getPointNavigation() {
		return pointNavigation;
	}

	public void setPointNavigation(NavigationEnum pointNavigation) {
		this.pointNavigation = pointNavigation;
	}
	
}
