package ept.td2;

public class Robot {
	
	private int orientation = 1;
	private int abs = 0, ord = 0;
	
	public Robot(int abs, int ord, int orientation){
		this.abs = abs;
		this.ord = ord;
		this.orientation = orientation;
	}
	
	public void avancer() {
		switch(this.orientation){
			case 1:
				// Nord
				this.ord--;
				break;
			case 2:
				// Est
				this.abs++;
				break;
			case 3:
				// Sud
				this.ord++;
				break;
			default:
				// West
				this.abs--;
		}
	}
	
	public void afficher(){
		switch(this.orientation){
			case 1:
				System.out.println("Le robot est à la position : ( " + this.abs + " , " + this.ord + " ). Orienté vers le nord.");
				break;
			case 2:
				System.out.println("Le robot est à la position : ( " + this.abs + " , " + this.ord + " ). Orienté vers l'est.");
				break;
			case 3:
				System.out.println("Le robot est à la position : ( " + this.abs + " , " + this.ord + " ). Orienté vers le sud.");
				break;
			default:
				System.out.println("Le robot est à la position : ( " + this.abs + " , " + this.ord + " ). Orienté vers l'west.");
				this.ord++;
		}
	}
	
	public void tourner(int orientation) {
		this.orientation = orientation;
	}
	
	public static void main(String[] args) {
		Robot robot = new Robot(4, 7, 1);
		
		for (int i=0;i<10;i++){
			robot.avancer();
			robot.afficher();
		}
		
		robot.tourner(2);
		
		for (int i=0;i<10;i++){
			robot.avancer();
			robot.afficher();
		}
		
		robot.tourner(3);
		
		for (int i=0;i<10;i++){
			robot.avancer();
			robot.afficher();
		}
		
		robot.tourner(4);
		
		for (int i=0;i<10;i++){
			robot.avancer();
			robot.afficher();
		}
	}
	
}
