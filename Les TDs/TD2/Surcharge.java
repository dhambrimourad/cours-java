package ept.cour2;

public class Surcharge {
	public static void main(String[] args) {
		String[] tabStr = {"a", "b", "c"};
		int[] tabInt = {1, 2, 3, 4};
		String[][] tabStr2 = {{"1", "2", "3", "4"}, {"a", "b", "c"}};

		//La méthode avec un tableau de String sera invoquée
		parcourirTableau(tabStr);
		//La méthode avec un tableau d'int sera invoquée
		parcourirTableau(tabInt);
		//La méthode avec un tableau de String à deux dimensions sera invoquée
		parcourirTableau(tabStr2);
	}
	 
	static void parcourirTableau(String[] tab) {
	  for(String str : tab)
	    System.out.println(str);
	}
	        
	static void parcourirTableau(int[] tab)
	{
	  for(int str : tab)
	    System.out.println(str);
	}
	
	static void parcourirTableau(String[][] tab) {
	  for(String tab2[] : tab) {
	    for(String str : tab2)
	      System.out.println(str);
	  }
	}
}
