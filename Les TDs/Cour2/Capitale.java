package ept.cour2;

public class Capitale extends Ville {

	private String monument;
    
	//Constructeur par défaut
	public Capitale(){
	    //Ce mot clé appelle le constructeur de la classe mère
	    super();
	    monument = "aucun";
	}    
	      
	//Constructeur d'initialisation de capitale
	public Capitale(String nom, int hab, String pays, String monument){
	    super(nom, hab, pays);
	    this.monument = monument;
	}    
	     
	//Description d'une capitale
	public String decrisToi(){
	    String str = super.decrisToi() + "\n \t ==>" + this.monument + " en est un monument";
	    return str;
    } 

	//Retourne le nom du monument
	public String getMonument() {
	    return monument;
	} 

	//Définit le nom du monument
	public void setMonument(String monument) {
	    this.monument = monument;
	}
	
	public static void main(String[] args) {
		Capitale cap = new Capitale("Paris", 654987, "France", "la tour Eiffel");
		System.out.println("\n"+cap.decrisToi());
	}

}
