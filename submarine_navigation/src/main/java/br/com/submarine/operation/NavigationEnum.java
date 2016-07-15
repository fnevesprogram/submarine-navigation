package br.com.submarine.operation;

public enum NavigationEnum {
	L("L"), R("R"), M("M"), U("U"), D("D");

	private String navigation;

	private NavigationEnum(String navigation) {
		this.navigation = navigation;
	}

	public String toString() {
		return navigation;
	}

	public String getNavigation() {
		return navigation;
	}

}
