public class Produit {

	public static void main(String[] args) {
		int prod = 1;
		
		if (args.length > 0) {
			for (String s: args) {
				try {
			        int a = Integer.parseInt(s);
			        prod *= a;
			    } catch (NumberFormatException e) {
			        System.err.println("L'argument" + s + " doit �tre entier.");
			        System.exit(1);
			    }
	        }
			System.out.println("Le r�sultat est : " + prod);
		} else {
			System.out.println("Vous devez entrer des arguments.");
		}
	}
}
