package ept.td1;

public class Etudiant {
	private String nom = "";
	private String prenom = "";
	private String numCIN = "";
	
	public Etudiant(String nom, String prenom, String numCIN) {
		this.nom = nom;
		this.prenom = prenom;
		this.numCIN = numCIN;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumCIN() {
		return numCIN;
	}

	public void setNumCIN(String numCIN) {
		this.numCIN = numCIN;
	}
	
	
}
