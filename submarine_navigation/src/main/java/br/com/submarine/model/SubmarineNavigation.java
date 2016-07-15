package br.com.submarine.model;

public class SubmarineNavigation {

	public static int eixoX = 0;
	public static int eixoY = 0;
	public static int eixoZ = 0;
	private String navigationPoint;
	private static String cardealPoint = "";

	public void startNavigation() {
		eixoX = 0;
		eixoY = 0;
		eixoZ = 0;
		setCardealPoint("NORTE");
	}

	public static void moveRigthPositionL() {
		SubmarineNavigation.eixoX += 1;
		setCardealPoint("LESTE");
	}

	public static void moveLeftPositionO() {
		SubmarineNavigation.setCardealPoint("OESTE");
	}
	
	public static void move() {
		System.out.println("move submarine ... ");
	}

	public static void moveDownPositionS() {
		SubmarineNavigation.eixoZ = eixoZ - 1;
		SubmarineNavigation.setCardealPoint("SUL");
	}
	
	public static void moveUpPositionN(){
		SubmarineNavigation.eixoY += 1;
		SubmarineNavigation.setCardealPoint("NORTE");
	}
	
	public String getNavigationPoint() {
		return navigationPoint;
	}

	public void setNavigationPoint(String navigationPoint) {
		this.navigationPoint = navigationPoint;
	}

	public static String getCardealPoint() {
		return cardealPoint;
	}

	public static void setCardealPoint(String cardealPoint) {
		SubmarineNavigation.cardealPoint = cardealPoint;
	}

}
