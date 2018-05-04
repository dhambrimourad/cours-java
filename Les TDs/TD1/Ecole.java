package ept.td1;

public class Ecole {
	private String nom = "";
	private String adresse = "";
	private Etudiant[] listeEtudiants;
	
	public Ecole(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Etudiant[] getListeEtudiants() {
		return listeEtudiants;
	}

	public void setListeEtudiants(Etudiant[] listeEtudiants) {
		this.listeEtudiants = listeEtudiants;
	}
	
	public int getNbrEtudiants() {
		return this.listeEtudiants.length;
	}
	
	public void affiche() {
		for (int i=0;i<this.listeEtudiants.length;i++){
			System.out.println(this.listeEtudiants[i].getNom() + " " + this.listeEtudiants[i].getPrenom());
		}
	}
	
	public static void main (String[] args) {
        Ecole ecole = new Ecole("EPT", "Tunis");
        Etudiant e1 = new Etudiant("n1", "p1", "01");
        Etudiant e2 = new Etudiant("n2", "p2", "02");
        Etudiant e3 = new Etudiant("n3", "p3", "03");
        Etudiant e4 = new Etudiant("n4", "p4", "04");
        Etudiant e5 = new Etudiant("n5", "p5", "05");
        
        Etudiant[] liste = new Etudiant[5];
        liste[0] = e1;
        liste[1] = e2;
        liste[2] = e3;
        liste[3] = e4;
        liste[4] = e5;
        
        ecole.setListeEtudiants(liste);
        ecole.affiche();        
    }
}
