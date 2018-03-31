Votre tante fortunée vous envoie désormais un montant chaque mois. A la fin de l'année vous souhaitez faire un bilan de vos richesses. Ecrivez le programme Java Bilan.java vous affichant la somme mensuelle moyenne reçue, le montant minimal reçu sur l'année et le montant maximal reçu sur l'année. Le bilan se fera sur n montants de la façon suivante:

```
Donnez n: ..
Donnez le montant du mois 1 (Frs): ..
Donnez le montant du mois 2 (Frs): ..
Donnez le montant du mois 3 (Frs): ..
...
```

Il affichera (exemple pour n = 3, montant1 = 100, montant2 = 200 et montant3 = 400):

```
La somme mensuelle moyenne reçue est: 233 
Le montant mensuel minimal reçu est: 100 
Le montant mensuel maximal reçu est: 400
```

### Solution

```java
import java.util.Scanner;
class Bilan {
 
    private static Scanner scanner = new Scanner(in);
 
    public static void main(args[]) {
        // Lecture du nombre de mois
        System.out.print("Donnez le nombre de mois: ");
        int months = scanner.nextInt();
 
        int min = Integer.MAX_VALUE;
        int max = 0;
 
        int total = 0;
 
        // Lecture des montants, accumulation et valeurs extrêmes
        for (int i = 0; i < months; i++) {
            System.out.print(" Donnez le montant du mois " + (i + 1)  + " (Frs): ");
            int montant = scanner.nextInt();
            total = total + montant;
 
            if (montant > max) {
                max = montant;
            }
 
            if(montant < min) {
                min = montant;
            }           
        }
         System.out.println("La somme mensuelle moyenne reçue est: " + (total / months));
        System.out.println("Le montant mensuel minimal reçu est: "+ min);
        System.out.println("Le montant mensuel maximal reçu est: "+ max);
    }
}
```