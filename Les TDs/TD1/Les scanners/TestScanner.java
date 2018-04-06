package ept.cour1;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		//Une variable vide
		String prenom;

		//On initialise celle-ci à O pour oui
		char reponse = 'O';

		//Notre objet Scanner, n'oubliez pas l'import de java.util.Scanner !
		Scanner sc = new Scanner(System.in);

		//Tant que la réponse donnée est égale à oui…
		while (reponse == 'O')
		{
		  //On affiche une instruction
		  System.out.println("Donnez un pr�nom : ");

		  //On récupère le prénom saisi
		  prenom = sc.nextLine();

		  //On affiche notre phrase avec le prénom
		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");

		  //On demande si la personne veut faire un autre essai
		  System.out.println("Voulez-vous réessayer ? (O/N)");

		  //On récupère la réponse de l'utilisateur
		  reponse = sc.nextLine().charAt(0);
		}

		sc.close();
		System.out.println("Au revoir…");
		//Fin de la boucle
	}

}