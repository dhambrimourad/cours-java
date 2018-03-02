package com.test;

public class TestTableau3 {

	public static void main(String[] args) {
		String tab[][]={{"personne1", "personne2", "personne3", "personne4", "personne5"}, {"1", "2", "3", "4"}};
		int i = 0, j = 0;

		for(String sousTab[] : tab)
		{
		  i = 0;
		  for(String str : sousTab)
		  {     
		    System.out.println("La valeur de la nouvelle boucle est  : " + str);
		    System.out.println("La valeur du tableau à l'indice ["+j+"]["+i+"] est : " + tab[j][i]);
		    i++;
		  }
		  j++;
		}
	}

}
