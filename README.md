# Programmation JAVA
Présenté par : Mourad DHAMBRI

### Sommaire

* [Présentation](#presentation)
* [Les certifications Java](#certif)
* [Les outils de développement](#outils)
* [Votre premier programme](#hello)
* [Récupérer ce que vous tapez](#scanner)
* [Les conditions](#conditions)
* [Les boucles](#boucles)
* [Les tableaux](#tableaux)
* [Les classes](#classes)
* [L'héritage](#heritage)
* [Le polymorphisme](#polymorphisme)
* [Modéliser ses objets grâce à UML](#uml)
* [Les classes abstraites](#abstraites)
* [Les interfaces](#interfaces)
* [Les exceptions](#exceptions)
* [Les collections d'objets](#collections)
* [Les flux d'entrée/sortie](#flux)
* [L'objet JFrame](#jframe)

### Références

* Livres
    - Programmer en Java, 7e Edition, Claude Delannoy, Eyrolles, 2011
    - The Java Tutorial : A Short Course on the Basics, 4th Edition, Collectif, Prentice Hall, 2006
    - Effective Java, 2nd Edition, Joshua Bloch, Prendice Hall, 2008
* Site web
    - Site officiel Java, http://www.oracle.com/technetwork/java/index.html
    - Tutoriels Java, http://docs.oracle.com/javase/tutorial/
    - Le site Java World, http://javaworld.com
    - Le site https://openclassrooms.com

### <a name="presentation">Présentation</a>

Développé par Sun Microsystems, présenté officiellement le 23 mai 1995.
La société Sun a été ensuite rachetée en 2009 par la société Oracle qui détient et maintient désormais Java.
Une de ses plus grandes forces est son excellente portabilité : une fois votre programme créé, il fonctionnera automatiquement sous Windows, Mac, Linux, etc.

Il permet de développer :

* des applications, sous forme de fenêtre ou de console.
* des applets, qui sont des programmes Java incorporés à des pages web.
* des applications pour appareils mobiles.
* et bien d'autres ! J2EE pour les applications d'entreprise, JMF pour le traitement vidéo, J3D pour la 3D...

Java est un langage interprété, ce qui signifie qu’un programme compilé n’est pas directement exécutable par le système d’exploitation mais il doit être interprété par un autre programme, qu’on appelle interpréteur.

![Compilation](Images/compilation.png)

Un programmeur Java écrit son code source, sous la forme de classes, dans des fichiers dont l’extension est `.java`. Ce code source est alors compilé par le compilateur `javac` en un langage appelé `bytecode` et enregistre le résultat dans un fichier dont l’extension est `.class`. Le bytecode ainsi obtenu n’est pas directement utilisable. Il doit être interprété par la machine virtuelle de Java (un interpréteur qui exécute des programmes compilés sous forme de bytecode Java) qui transforme alors le code compilé en code machine compréhensible par le système d’exploitation.
C’est la raison pour laquelle Java est un langage portable : le bytecode reste le même quelque soit l’environnement d’exécution.

### <a name="certif">Les certifications Java</a>
Pour être certifié Java SE 7, vous devez passer ces 2 examens :

* 1Z0-803 Oracle Certified Associate, Java SE 7 Programmer I.
* 1Z0-804 Oracle Certified Professional , Java SE 7 Programmer II.

### Les certifications J2ee
![Les certifications J2ee](Images/certification.png)

### Comparatif Java / Python

Java | Python
------------ | -------------
En Java, tous les noms de variables doivent être explicitement déclarés. | En Python, vous ne déclarez jamais rien. Une affectation lie un nom à un objet et l'objet peut être de n'importe quel type.

#### Java
```java
int myCounter = 0;
String myString = String.valueOf(myCounter);
if (myString.equals("0")) ...
```

#### Python
```Python
myCounter = 0
myString = str(myCounter)
if myString == "0": ...
```

Java | Python
------------ | -------------
Abondant en mots | Concis. Exprime beaucoup en peu de mots.

#### Java
```java
public class HelloWorld
{
    public static void main (String[] args)
    {
        System.out.println("Hello world!");
    }
}
```

#### Python
```Python
print "Hello, world!"
```

#### Java
```java
// print the integers from 1 to 9
for (int i = 1; i < 10; i++)
{
   System.out.println(i);
}
```

#### Python
```Python
 print the integers from 1 to 9
for i in range(1,10):
    print i
```

### <a name="outils">Les outils de développement</a>
Pour commencer à utiliser Java, il suffit d'installer le JDK (Java Development Kit) disponible à l'adresse suivante : [www.oracle.com/technetwork/java/javase/downloads](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

![JDK](Images/jdk.png)

Cochez la case : « Accept License Agreement » puis cliquez sur le lien correspondant à votre système d'exploitation (x86 pour un système 32 bits et x64 pour un système 64 bits).

![JDK1](Images/jdk1.png)

### Compilation en ligne de commande

* Mettre à jour la variable d’environnement « PATH ». C'est grâce à elle que Windows trouve des exécutables sans  qu'il soit nécessaire de lui spécifier le chemin d'accès complet.
* Allez dans le répertoire de votre premier programme et effacez le « .class ». Ensuite, faites « Démarrer > Exécuter » (ou encore touche « Windows + R » et tapez « cmd ».
* Maintenant, vous pouvez créer votre fichier « .class » en exécutant la commande suivante :

```java
javac <nomDeFichier.java>
```

* Vous pouvez lancer votre programme Java en faisant ce qui suit :

```java
java <nomFichierClassSansExtension>
```

### Eclipse IDE
Eclipse IDE est un environnement de développement libre permettant de créer des programmes dans de nombreux langages de programmation (Java, C++, PHP…). C'est l'outil que nous allons utiliser pour programmer. Eclipse IDE est disponible en téléchargement à l'adresse suivante : [http://www.eclipse.org/downloads/eclipse-packages](http://www.eclipse.org/downloads/eclipse-packages/)

![Eclipse](Images/eclipse.png)

### Créer un nouveau projet Java.

![Eclipse1](Images/eclipse1.png)

![Eclipse2](Images/eclipse2.png)

Vous devriez avoir un nouveau projet dans la fenêtre de gauche, comme à la figure suivante.

![Eclipse3](Images/eclipse3.png)

Ajoutons une nouvelle classe dans ce projet.

![Eclipse4](Images/eclipse4.png)

Cochez la case : « public static void main(String[] args) ».

![Eclipse5](Images/eclipse5.png)

### <a name="hello">Votre premier programme</a>
Tous les programmes Java sont composés d'au moins une classe. Elle doit contenir une méthode appelée « main »: ce sera le point de démarrage de notre programme.

![Eclipse6](Images/eclipse6.png)

### Les commentaires

```java
public static void main(String[] args){
  //Un commentaire
  //Un autre
  //Encore un autre

  /*
  Un commentaire
  Un autre
  Encore un autre
  */

  Ceci n'est pas un commentaire !
}
```

### Hello World

```java
public static void main(String[] args){
  System.out.print("Hello World !");
}
```

Une fois que vous avez saisi cette ligne de code dans votre méthode main, il vous faut lancer le programme.

![Eclipse7](Images/eclipse7.png)

![Eclipse8](Images/eclipse8.png)

Prenons le code suivant :

```java
  System.out.print("Hello World !");
  System.out.print("My name is");
  System.out.print("Cysboy");
```

Résultat:

> Hello World !My name isCysboy

```java
  System.out.print("Hello World ! \n");
  System.out.println("My name is");
  System.out.println("\nCysboy");
```

Avec pour résultat :

> Hello World !

> My name is



> Cysboy

### Les variables et les opérateurs
En Java, nous avons deux types de variables :

* des variables de type simple ou « primitif » ;
* des variables de type complexe ou des « objets ».

### Les variables de type numérique
Le type byte (1 octet) peut contenir les entiers entre -128 et +127.

```java
  byte temperature;
  temperature = 64;
```

Le type short (2 octets) contient les entiers compris entre -32768 et +32767.

```java
  short vitesseMax;
  vitesseMax = 32000;
```

Le type int (4 octets) va de -2*10<sup>9</sup> à 2*10<sup>9</sup>.

```java
  int temperatureSoleil;
  temperatureSoleil = 15600000; //La température est exprimée en kelvins
```

Le type long (8 octets) peut aller de −9×10<sup>18</sup>  à 9×10<sup>18</sup>.

```java
  long anneeLumiere;
  anneeLumiere = 9460700000000000L;
```

Le type float (4 octets) est utilisé pour les nombres avec une virgule flottante.

```java
  float pi;
  pi = 3.141592653f;
```

Le type double (8 octets) est identique à float, si ce n'est qu'il contient plus de chiffres derrière la virgule.

```java
  double division;
  division = 0.333333333333333333333333333333333333333333334d;
```

### Des variables stockant un caractère
Le type « char » contient un caractère stocké entre apostrophes (« ' ' »), comme ceci :

```java
  char caractere;
  caractere = 'A';
```

### Des variables de type booléen
Le type « boolean » ne peut contenir que deux valeurs : true (vrai) ou false (faux).

```java
  boolean question;
  question = true;
```

### Le type String
Le type « String » permet de gérer les chaînes de caractères, c'est-à-dire le stockage de texte. Il s'agit d'une variable d'un type plus complexe que l'on appelle <b>« objet »</b>.

```java
//Première méthode de déclaration
String phrase;
phrase = "Titi et Grosminet";

//Deuxième méthode de déclaration
String str = new String();
str = "Une autre chaîne de caractères";

//Troisième méthode de déclaration
String string = "Une autre chaîne";

//Quatrième méthode de déclaration
String chaine = new String("Et une de plus !");
```

### Conventions de nommage
Tous vos noms de classes doivent commencer par une majuscule ;
Tous vos noms de variables doivent commencer par une minuscule ;
Si le nom d'une variable est composé de plusieurs mots, le premier commence par une minuscule, le ou les autres par une majuscule, et ce, sans séparation ;
Tout ceci sans accentuation !
On peut très bien compacter les phases de déclaration et d'initialisation en une seule phase ! Comme ceci :

```java
int entier = 32;
float pi = 3.1416f;
char carac = 'z';
String mot = new String("Bonjour tout le monde !");
```

Et lorsque nous avons plusieurs variables d'un même type, nous pouvons résumer tout ceci à une déclaration :

```java
int nbre1 = 2, nbre2 = 3, nbre3 = 0;
```

### Les opérateurs arithmétiques :
* « + » : permet d'additionner deux variables numériques (mais aussi de concaténer des chaînes de caractères).
* « - » : permet de soustraire deux variables numériques.
* « * » : permet de multiplier deux variables numériques.
* « / » : permet de diviser deux variables.
* « % » : permet de renvoyer le reste de la division entière de deux variables de type numérique ; cet opérateur s'appelle le modulo.

### Quelques exemples de calcul

```java
int nbre1, nbre2, nbre3;  //Déclaration des variables
 
nbre1 = 1 + 3;            //nbre1 vaut 4
nbre2 = 2 * 6;            //nbre2 vaut 12
nbre3 = nbre2 / nbre1;    //nbre3 vaut 3
nbre1 = 5 % 2;            //nbre1 vaut 1, car 5 = 2 * 2 + 1
nbre2 = 99 % 8;           //nbre2 vaut 3, car 99 = 8 * 12 + 3
nbre3 = 6 % 3;            //là, nbre3 vaut 0, car il n'y a pas de reste
```

```java
int nbre1, nbre2, nbre3;    //Déclaration des variables
nbre1 = nbre2 = nbre3 = 0;  //Initialisation
 
nbre1 = nbre1 + 1;     //nbre1 = lui-même, donc 0 + 1 => nbre1 = 1
nbre1 = nbre1 + 1;     //nbre1 = 1 (cf. ci-dessus), maintenant, nbre1 = 1 + 1 = 2
nbre2 = nbre1;         //nbre2 = nbre1 = 2
nbre2 = nbre2 * 2;     //nbre2 = 2 => nbre2 = 2 * 2 = 4
nbre3 = nbre2;         //nbre3 = nbre2 = 4
nbre3 = nbre3 / nbre3; //nbre3 = 4 / 4 = 1
nbre1 = nbre3;         //nbre1 = nbre3 = 1
nbre1 = nbre1 - 1;     //nbre1 = 1 - 1 = 0
```

```java
nbre1 = nbre1 + 1;
nbre1 += 1;
nbre1++;
++nbre1;
```

```java
nbre1 = nbre1 - 1;
nbre1 -= 1;
nbre1--;
--nbre1;
```

```java
nbre1 = nbre1 * 2;
nbre1 *= 2;
nbre1 = nbre1 / 2;
nbre1 /= 2;
```

L'opérateur « + » sert aussi d'opérateur de concaténation, c'est-à-dire qu'il permet de mélanger du texte brut et des variables. Voici un exemple d'affichage avec une perte de précision :

```java
double nbre1 = 10, nbre2 = 3;
int resultat = (int)(nbre1 / nbre2);
System.out.println("Le résultat est = " + resultat);
```

### Les conversions, ou « cast »
D'un type « int » en type « float ».

```java
int i = 123;
float j = (float)i;
```

D'un type « int » en « double ».

```java
int i = 123;
double j = (double)i;
```

Et inversement :

```java
double i = 1.23;
double j = 2.9999999;
int k = (int)i;        //k vaut 1
k = (int)j;            //k vaut 2
```

### <a name="scanner">Récupérer ce que vous tapez</a>
![Scanner](Images/scanner.png)

### <a name="conditions">La structure If… else…</a>

```java
int i = 0;
if (i < 0)
  System.out.println("Ce nombre est négatif !");      
  
else if(i > 0)
  System.out.println("Ce nombre est positif !");           
 
else  
  System.out.println("Ce nombre est nul !");
```

### Les conditions multiples
```java
int i = 58;
if(i < 100 && i > 50) 
  System.out.println("Le nombre est bien dans l'intervalle.");
else
  System.out.println("Le nombre n'est pas dans l'intervalle.");
```

### La structure « switch »
```java
int note = 10; //On imagine que la note maximale est 20

switch (note)
{
  case 0:
    System.out.println("Ouch !");
    break;
  case 10:
    System.out.println("Vous avez juste la moyenne.");
    break;
  case 20:
    System.out.println("Parfait !");
    break;
  default:
    System.out.println("Il faut davantage travailler.");
}
```

```java
String chaine = "Bonjour";

switch(chaine) {
  case "Bonjour":
    System.out.println("Bonjour monsieur !");
    break;
  case "Bonsoir":
    System.out.println("Bonsoir monsieur !");
    break;
  default:
    System.out.println("Au revoir !");
}
```

### La condition ternaire
```java
int x = 10, y = 20;
int max = (x < y) ? y : x ; //Maintenant, max vaut 20
```

```java
int x = 10, y = 20;

int max = (x < y) ? (y < 10) ? y % 10 : y * 2 : x ; //Max vaut 40

//Pas très facile à lire…
//Vous pouvez entourer votre deuxième instruction ternaire par des parenthèses pour mieux voir :

max = (x < y) ? ((y < 10) ? y % 10 : y * 2) : x ; //Max vaut 40
```

### <a name="boucles">La boucle « while »</a>

```java
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
  System.out.println("Donnez un prénom : ");
  //On récupère le prénom saisi
  prenom = sc.nextLine();
  //On affiche notre phrase avec le prénom
  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
  //On demande si la personne veut faire un autre essai
  System.out.println("Voulez-vous réessayer ? (O/N)");
  //On récupère la réponse de l'utilisateur
  reponse = sc.nextLine().charAt(0);
}
 
System.out.println("Au revoir…");
//Fin de la boucle
```

```java
String prenom;
char reponse = 'O';
Scanner sc = new Scanner(System.in);
while (reponse == 'O')
{
  System.out.println("Donnez un prénom : ");
  prenom = sc.nextLine();
  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");                        
  //Sans ça, nous n'entrerions pas dans la deuxième boucle
  reponse = ' ';
                        
  //Tant que la réponse n'est pas O ou N, on repose la question
  while(reponse != 'O' && reponse != 'N')
  {
    //On demande si la personne veut faire un autre essai
    System.out.println("Voulez-vous réessayer ? (O/N)");
    reponse = sc.nextLine().charAt(0);
  }
}
System.out.println("Au revoir…");
```

![While](Images/while.png)

```java
int a = 1, b = 15;
while (a < b)
{
  System.out.println("bonjour " +a+ " fois !!");
}
```

```java
int a = 1, b = 15;
while (a < b)
{
  System.out.println("bonjour " +a+ " fois !!");
  a++;
}
```

```java
int a = 1, b = 15;
while (a++ < b)
   System.out.println("bonjour " +a+ " fois !!");
```

```java
int a = 1, b = 15;
while (++a < b)
  System.out.println("bonjour " +a+ " fois !!");
```

### La boucle « do… while »
Syntaxe
```java
do{
  //Instructions
}while(a < b);
```

#### Première différence
La boucle « do… while » s'exécutera au moins une fois, contrairement à la boucle « while ». C'est-à-dire que la phase de test de la condition se fait à la fin, car la condition se met après le while.

#### Deuxième différence
C'est une différence de syntaxe, qui se situe après la condition du while. Il y a un «;» après le while. C'est tout ! Ne l'oubliez cependant pas, sinon le programme ne compilera pas.

```java
String prenom = new String();
//Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
char reponse = ' ';
 
Scanner sc = new Scanner(System.in);
 
do{
  System.out.println("Donnez un prénom : ");
  prenom = sc.nextLine();
  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
       
  do{
    System.out.println("Voulez-vous réessayer ? (O/N)");
    reponse = sc.nextLine().charAt(0);
  }while(reponse != 'O' && reponse != 'N');
        
}while (reponse == 'O');
 
System.out.println("Au revoir…");
```

### La boucle « for »
```java
for(int i = 1; i <= 10; i++)
{
  System.out.println("Voici la ligne "+i);
}
```

![For](Images/for.jpg)

```java
for(int i = 10; i >= 0; i--)
  System.out.println("Il reste "+i+" ligne(s) à écrire");
```

![For](Images/for2.jpg)

```java
for(int i = 0, j = 2; (i < 10 && j < 6); i++, j+=2){
  System.out.println("i = " + i + ", j = " + j);
}
```

### TP : conversion Celsius - Fahrenheit
Voici les caractéristiques du programme que nous allons devoir réaliser:
* Le programme demande quelle conversion nous souhaitons effectuer, Celsius vers Fahrenheit ou l'inverse ;
* On n'autorise que les modes de conversion définis dans le programme (un simple contrôle sur la saisie fera l'affaire) ;
* Enfin, on demande à la fin à l'utilisateur s'il veut faire une nouvelle conversion, ce qui signifie que l'on doit pouvoir revenir au début du programme !

Voici la formule de conversion pour passer des degrés Celsius en degrés Fahrenheit :
```				
    F=(9/5)×C+32
```
Pour l'opération inverse, c'est comme ceci :
```				
    C=(F−32)×5/9
```
La figure suivante est un aperçu de ce que je vous demande.

![Celsius](Images/celsius.png)

### <a name="tableaux">Tableaux à une dimension</a>

```java
int tableauEntier[] = {0,1,2,3,4,5,6,7,8,9};
double tableauDouble[] = {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
char tableauCaractere[] = {'a','b','c','d','e','f','g'};
String tableauChaine[] = {"chaine1", "chaine2", "chaine3" , "chaine4"};
```

Vous pouvez aussi déclarer un tableau vide, mais celui-ci devra impérativement contenir un nombre de cases bien défini. Par exemple, si vous voulez un tableau vide de six entiers :

```java
int tableauEntier[] = new int[6];
//Ou encore
int[] tableauEntier2 = new int[6];
```

### Tableaux multidimensionnels

```java
int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} };
```

![Tableaux](Images/tableaux.png)

### Utiliser et rechercher dans un tableau

```java
char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
int i = 0;
char reponse = ' ',carac = ' ';
Scanner sc = new Scanner(System.in);
         
do {//Boucle principale
  do {//On répète cette boucle tant que l'utilisateur n'a pas rentré une lettre figurant dans le tableau
    i = 0;
    System.out.println("Rentrez une lettre en minuscule, SVP ");
                
    carac = sc.nextLine().charAt(0);
    //Boucle de recherche dans le tableau
    while(i < tableauCaractere.length && carac != tableauCaractere[i])
      i++;
         
    //Si i < 7 c'est que la boucle n'a pas dépassé le nombre de cases du tableau 
    if (i < tableauCaractere.length)
      System.out.println(" La lettre " +carac+ " se trouve bien dans le tableau !");
    else //Sinon
      System.out.println(" La lettre " +carac+ " ne se trouve pas dans le tableau !");
         
  }while(i >= tableauCaractere.length);

  //Tant que la lettre de l'utilisateur ne correspond pas à une lettre du tableau    
  do{
    System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
    reponse = sc.nextLine().charAt(0);
  }while(reponse != 'N' && reponse != 'O');      
}while (reponse == 'O');
                
System.out.println("Au revoir !");
```

Le résultat de ce code se trouve à la figure suivante.

![Tableaux](Images/tableaux1.jpg)

### Parcourir un tableau multidimensionnel

```java
int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} }, i = 0, j = 0;
 
while (i < 2)
{
  j = 0;
  while(j < 5)
  {
    System.out.print(premiersNombres[i][j]);
    j++;
  }
  System.out.println("");
  i++;
}
```

```java
int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} };
 
for(int i = 0; i < 2; i++)
{    
  for(int j = 0; j < 5; j++)
  {
    System.out.print(premiersNombres[i][j]);       
  }
  System.out.println("");     
}
```

```java
String tab[][]={{"a", "b", "c", "d", "e"}, {"1", "2", "3", "4"}};
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
```

### Classe Arrays

#### Méthodes pour copier des tableaux

```java
import java.util.Arrays;

class ArrayCopyOfDemo {

    public static void main(String[] args) {
        char[] copyFrom = {'h','e','l','l','o','j','a','v','a'} ;
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 6);     // lloj
        char[] copyTo2 = Arrays.copyOf(copyFrom,3);             // hel
        System.out.println(new String(copyTo));
    }
}
```

#### Autres méthodes :
* binarySearch: recherche un élément et retourne l’index associé.
* equals : compare deux tableaux
* sort : tri d’un tableau d’une manière séquentielle
* parallelSort : tri d’un tableau d’une manière parallèle dans des machines multi-processeur (plus rapide que sort), existe depuis Java 1.8

### Des méthodes concernant les chaînes de caractères

```java
String chaine = new String("BONJOUR TOUT LE MONDE !"), chaine2 = new String();
chaine2 = chaine.toLowerCase();   //Donne "bonjour tout le monde !"
```

```java
String chaine = new String("bonjour bonjour"), chaine2 = new String();
chaine2 = chaine.toUpperCase();   //Donne "BONJOUR BONJOUR"
```

```java
String chaine = new String("bonjour ! "); 
int longueur = 0;
longueur = chaine.length();   //Renvoie 9
```

```java
String str1 = new String("bonjour"), str2 = new String("bonsoir");
 
if (str1.equals(str2))
  System.out.println("Les deux chaînes sont identiques !");
else
  System.out.println("Les deux chaînes sont différentes !");
```

```java
String nbre = new String("1234567");
char carac = nbre.charAt(4);   //Renverra ici le caractère 5
```

```java
String chaine = new String("la paix niche"), chaine2 = new String();
chaine2 = chaine.substring(3,13);   //Permet d'extraire "paix niche"
```

```java
String mot = new String("anticonstitutionnellement");
int n = 0;
 
n = mot.indexOf('t');           //n vaut 2
n = mot.lastIndexOf('t');       //n vaut 24
n = mot.indexOf("ti");          //n vaut 2
n = mot.lastIndexOf("ti");      //n vaut 12
n = mot.indexOf('x');           //n vaut -1
```

### La classe java.lang.Math

```java
double X = 0.0;
X = Math.random();
//Retourne un nombre aléatoire 
//compris entre 0 et 1, comme 0.0001385746329371058

double sin = Math.sin(120);     //La fonction sinus
double cos = Math.cos(120);     //La fonction cosinus
double tan = Math.tan(120);     //La fonction tangente
double abs = Math.abs(-120.25); //La fonction valeur absolue (retourne le nombre sans le signe)
double d = 2;
double exp = Math.pow(d, 2);    //La fonction exposant
//Ici, on initialise la variable exp avec la valeur de d élevée au carré
//La méthode pow() prend donc une valeur en premier paramètre, et un exposant en second
```

### La surcharge de méthode

```java
public class Test1
{
  public static void main(String[] args)
  {
    String[] tab = {"a", "b", "c", "d"};
    parcourirTableau(tab); 
  }
 
  static void parcourirTableau(String[] tabBis)
  {
    for(String str : tabBis)
      System.out.println(str);
  }
}
```

La surcharge de méthode consiste à garder le nom d'une méthode et à changer la liste ou le type de ses paramètres. Dans le cas qui nous intéresse, nous voulons que notre méthode <strong>parcourirTableau</strong> puisse parcourir n'importe quel type de tableau. Nous allons donc surcharger notre méthode afin qu'elle puisse aussi travailler avec des int, comme le montre cet exemple :

```java
static void parcourirTableau(String[] tab)
{
  for(String str : tab)
    System.out.println(str);
}
        
static void parcourirTableau(int[] tab)
{
  for(int str : tab)
    System.out.println(str);
}
```

Avec ces méthodes, vous pourrez parcourir de la même manière :
* Les tableaux d'entiers ;
* Les tableaux de chaînes de caractères.

```java
static void parcourirTableau(String[][] tab)
{
  for(String tab2[] : tab)
  {
    for(String str : tab2)
      System.out.println(str);
  }
}
```

```java
String[] tabStr = {"a", "b", "c"};
int[] tabInt = {1, 2, 3, 4};
String[][] tabStr2 = {{"1", "2", "3", "4"}, {"a", "b", "c"}};

//La méthode avec un tableau de String sera invoquée
parcourirTableau(tabStr);
//La méthode avec un tableau d'int sera invoquée
parcourirTableau(tabInt);
//La méthode avec un tableau de String à deux dimensions sera invoquée
parcourirTableau(tabStr2);
```

### <a name="classes">Les classes</a>

#### Définition :
Une classe est un modèle de définition pour des objets ayant le même ensemble d'attributs, et le même ensemble d'opérations. A partir d'une classe on peut créer un ou plusieurs objets par instanciation ; chaque objet est une instance d'une seule classe.

#### Une classe est définie par :
* Son nom
* Des champs
    - Attributs
    - Méthodes

#### Syntaxe :

```
[<Modificateur de visibilité>] class <nom classe>
{
    //Déclaration des attributs

    //Déclaration des méthodes
}
```

<Modificateur de visibilité> = « public » ou « private »

Créons une classe « Ville ». Allez dans File > New > Class.

![Ville](Images/ville.png)

### Les constructeurs
L'objectif est de construire un objet <strong><i>Ville</i></strong>, Un objet <strong><i>Ville</i></strong> possède :
* un nom, sous la forme d'une chaîne de caractères ;
* un nombre d'habitants, sous la forme d'un entier ;
* un pays apparenté, sous la forme d'une chaîne de caractères.

```java
public class Ville{
  String nomVille;
  String nomPays;
  int nbreHabitants; 
}
```

Un constructeur est une méthode d'instance qui va se charger de créer un objet et, le cas échéant, d'initialiser ses variables de classe ! Cette méthode a pour rôle de signaler à la JVM (Java Virtual Machine) qu'il faut réserver de la mémoire pour notre futur objet et donc, par extension, d'en réserver pour toutes ses variables.

```java
public class Ville{   
  //Stocke le nom de notre ville
  String nomVille;
  //Stocke le nom du pays de notre ville
  String nomPays;
  //Stocke le nombre d'habitants de notre ville
  int nbreHabitants;
     
  //Constructeur par défaut
  public Ville(){
    System.out.println("Création d'une ville !");      
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitants = 0;
  } 
}
```

Allons dans notre classe contenant la méthode <strong><i>main</i></strong> et instancions un objet <strong><i>Ville</i></strong>.

```java
public class Test1{ 
  public static void main(String[] args){   
    Ville ville = new Ville(); 
  } 
}
```

Exécutez ce code, vous devriez avoir l'équivalent de la figure suivante.

![Ville1](Images/ville1.jpg)

```java
public class Ville {
 
  //Stocke le nom de notre ville
  String nomVille;
  //Stocke le nom du pays de notre ville
  String nomPays;
  //Stocke le nombre d'habitants de notre ville
  int nbreHabitants;
 
  //Constructeur par défaut
  public Ville(){
    System.out.println("Création d'une ville !");          
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitants = 0;
  }
 
  //Constructeur avec paramètres
  //J'ai ajouté un « p » en première lettre des paramètres.
  //Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
  public Ville(String pNom, int pNbre, String pPays)
  {
    System.out.println("Création d'une ville avec des paramètres !");
    nomVille = pNom;
    nomPays = pPays;
    nbreHabitants = pNbre;
  }        
}
```

```java
//L'ordre est respecté -> aucun souci
Ville ville1 = new Ville("Marseille", 123456789, "France");
//Erreur dans l'ordre des paramètres -> erreur de compilation au final
Ville ville2 = new Ville(12456, "France", "Lille");
```

Dans la majorité des cas, nous allons contrôler les modifications des variables de classe, de manière à ce qu'un code extérieur ne fasse pas n'importe quoi avec nos objets. C'est pour cela que nous protégeons nos variables d'instance en les déclarant <strong><i>private</i></strong>, comme ceci :

```java
public class Ville {

  private String nomVille;
  private String nomPays;
  private int nbreHabitants;
   
  //…     
}
```

### Les getters et les setters
Un accesseur (getter) est une méthode qui va nous permettre d'accéder aux variables de nos objets en lecture, et un mutateur (setter) nous permettra d'en faire de même en écriture ! Grâce aux accesseurs, vous pourrez afficher les variables de vos objets, et grâce aux mutateurs, vous pourrez les modifier.

```java
public class Ville {

  //Les variables et les constructeurs n'ont pas changé…
  
  private String nomVille;
  private String nomPays;
  private int nbreHabitants;
  
  public Ville() {
    System.out.println("Création d'une ville !");          
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitants = 0;
  }
  
  public Ville(String pNom, int pNbre, String pPays) {
    System.out.println("Création d'une ville avec des paramètres !");
    nomVille = pNom;
    nomPays = pPays;
    nbreHabitants = pNbre;
  }   
          
  //*************   ACCESSEURS *************
    
  //Retourne le nom de la ville
  public String getNom()  {  
    return nomVille;
  }

  //Retourne le nom du pays
  public String getNomPays()
  {
    return nomPays;
  }

  // Retourne le nombre d'habitants
  public int getNombreHabitants()
  {
    return nbreHabitants;
  } 
 
  //*************   MUTATEURS   *************

  //Définit le nom de la ville
  public void setNom(String pNom)
  {
    nomVille = pNom;
  }

  //Définit le nom du pays
  public void setNomPays(String pPays)
  {
    nomPays = pPays;
  }

  //Définit le nombre d'habitants
  public void setNombreHabitants(int nbre)
  {
    nbreHabitants = nbre;
  }  
  
}
```

À présent, essayez ce code dans votre méthode <strong><i>main</i></strong> :

```java
Ville v = new Ville();
Ville v1 = new Ville("Marseille", 123456, "France");       
Ville v2 = new Ville("Rio", 321654, "Brésil");

System.out.println("\n v = "+v.getNom()+" ville de "+v.getNombreHabitants()+ " habitants se situant en "+v.getNomPays());
System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
System.out.println(" v2 = "+v2.getNom()+" ville de "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
        
// Nous allons interchanger les Villes v1 et v2 tout ça par l'intermédiaire d'un autre objet Ville.        
     
Ville temp = new Ville();
temp = v1;
v1 = v2;
v2 = temp;
       
System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

     
// Nous allons maintenant interchanger leurs noms cette fois par le biais de leurs mutateurs.
  
v1.setNom("Hong Kong");
v2.setNom("Djibouti");
      
System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
```

À la compilation, vous devriez obtenir la figure suivante.

![Ville2](Images/ville2.jpg)

Avec nos objets Ville, nous voulons :
* faire un système de catégories de villes par rapport à leur nombre d'habitants ( <1000 -> A, <10 000 -> B…) ;
* faire une méthode de description de notre objet Ville ;
* une méthode pour comparer deux objets par rapport à leur nombre d'habitants.

```java
public class Ville {
 
  private String nomVille;
  private String nomPays;
  private int nbreHabitants;
  private char categorie;
   
  public Ville() {
    System.out.println("Création d'une ville !");          
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitants = 0;
    this.setCategorie();
  }
 
  public Ville(String pNom, int pNbre, String pPays) {
    System.out.println("Création d'une ville avec des paramètres !");
    nomVille = pNom;
    nomPays = pPays;
    nbreHabitants = pNbre;
    this.setCategorie();
  }  
    
  //Retourne le nom de la ville
  public String getNom()  {  
    return nomVille;
  }

  //Retourne le nom du pays
  public String getNomPays()
  {
    return nomPays;
  }

  // Retourne le nombre d'habitants
  public int getNombreHabitants()
  {
    return nbreHabitants;
  } 

  //Retourne la catégorie de la ville
  public char getCategorie()
  {
    return categorie;
  } 
 
  //Définit le nom de la ville
  public void setNom(String pNom)
  {
    nomVille = pNom;
  }

  //Définit le nom du pays
  public void setNomPays(String pPays)
  {
    nomPays = pPays;
  }

  //Définit le nombre d'habitants
  public void setNombreHabitants(int nbre)
  {
    nbreHabitants = nbre;
    this.setCategorie();
  }  
 
  //Définit la catégorie de la ville
  private void setCategorie() {
 
    int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
    char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

    int i = 0;
    while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
      i++;

    this.categorie = categories[i];
  }

  //Retourne la description de la ville
  public String decrisToi(){
    return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
  }

  //Retourne une chaîne de caractères selon le résultat de la comparaison
  public String comparer(Ville v1){
    String str = new String();

    if (v1.getNombreHabitants() > this.nbreHabitants)
      str = v1.getNom()+" est une ville plus peuplée que "+this.nomVille;
     
    else
      str = this.nomVille+" est une ville plus peuplée que "+v1.getNom();
     
    return str;
  }
}
```

Le mot <strong><i>this</i></strong> fait référence à l'objet courant. À l'intérieur d'un objet, ce mot clé permet de désigner une de ses variables ou une de ses méthodes.

```java
Ville v = new Ville();
Ville v1 = new Ville("Marseille", 1236, "France");       
Ville v2 = new Ville("Rio", 321654, "Brésil");
        
System.out.println("\n\n"+v1.decrisToi());
System.out.println(v.decrisToi());
System.out.println(v2.decrisToi()+"\n\n");
System.out.println(v1.comparer(v2));
```

Ce qui devrait donner le résultat de la figure suivante.

![Ville3](Images/ville3.jpg)

### Les variables de classe
La particularité de ce type de variables, c'est qu'elles seront communes à toutes les instances de la classe. Afin qu'une variable soit une variable de classe, elle doit être précédée du mot clé <strong><i>static</i></strong>. Cela donnerait dans notre classe Ville:

```java
public class Ville {
   
  //Variables publiques qui comptent les instances
  public static int nbreInstances = 0;

  //Variable privée qui comptera aussi les instances
  private static int nbreInstancesBis = 0;        
  
  //Les autres variables n'ont pas changé

  public Ville(){
    //On incrémente nos variables à chaque appel aux constructeurs
    nbreInstances++;
    nbreInstancesBis++;          
    //Le reste ne change pas.
  }

  public Ville(String pNom, int pNbre, String pPays)
  {  
    //On incrémente nos variables à chaque appel aux constructeurs
    nbreInstances++;
    nbreInstancesBis++;          
    //Le reste ne change pas
  }
  public static int getNombreInstancesBis()
  {
    return nbreInstancesBis;
  }  
  
  //Le reste du code est le même qu'avant
  
}
```

À présent, testez le code suivant :

```java
Ville v = new Ville();                
System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
                            
Ville v1 = new Ville("Marseille", 1236, "France");        
System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
                
Ville v2 = new Ville("Rio", 321654, "Brésil");        
System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
```

Le résultat, visible à la figure suivante, montre que le nombre augmente à chaque instanciation.

![Static](Images/static.jpg)

### Le principe d’encapsulation
Vous venez de créer un objet dont les variables sont protégées de l'extérieur. En effet, depuis l'extérieur de la classe, elles ne sont accessibles que via les accesseurs et mutateurs que nous avons défini. C'est le principe d'encapsulation !

En fait, lorsqu'on procède de la sorte, on s'assure que le fonctionnement interne à l'objet est intègre, car toute modification d'une donnée de l'objet est maîtrisée. Nous avons développé des méthodes qui s'assurent qu'on ne modifie pas n'importe comment les variables.

<!--

### <a name="heritage">L'héritage</a>
L’idée principale de l’héritage est d’organiser les classes de manière hiérarchique. La relation d’héritage est unidirectionnelle et, si une classe B hérite d’une classe A, on dira que B est une sousclasse de A. Cette notion de sous-classe signifie que la classe B est un cas particulier de la classe A et donc que les objets instanciant la classe B instancient également la classe A.

![Forme](Images/forme.png)

Pour le moment, nous considérerons la classe Forme comme vide (c’est-à-dire sans aucune variable ni méthode) et nous nous intéressons plus particulièrement aux classes Rectangle et Carre.

La classe Rectangle héritant d’une classe vide, elle ne peut profiter d’aucun de ses attributs et doit définir toutes ses variables et méthodes. Une relation d’héritage se définit en Java par le mot-clé extends utilisé comme dans l’exemple suivant :

```java
public class Rectangle extends Forme {
    private int largeur ;
    private int longueur ;
    
    public Rectangle(int x, int y) {
        this.largeur = x ;
        this.longueur = y ;
    }
    
    public int getLargeur() {
        return this.largeur ;
    }
    
    public int getLongueur() {
        return this.longueur ;
    }
    
    public int surface() {
        return this.longueur * this.largeur ;
    }
    
    public void affiche() {
        System.out.println(”rectangle ” + longueur + ”x” + largeur);
    }
}
```

En revanche, la classe **Carre** peut bénéficier de la classe **Rectangle** et ne nécessite pas la réécriture de ces méthodes si celles-ci conviennent à la sous-classe. Toutes les méthodes et variables de la classe Rectangle ne sont néanmoins pas accessibles dans la classe Carre. Pour qu’un attribut puisse être utilisé dans une sous-classe, il faut que son type d’accès soit **public** ou **protected**.

#### La redéfinition de méthodes

L’héritage intégral des attributs de la classe Rectangle pose deux problèmes :
1. il faut que chaque carré ait une longueur et une largeur égales ;
2. la méthode affiche écrit le mot « rectangle » en début de chaîne. Il serait souhaitable que ce soit « carré » qui s’affiche.

Pour résoudre le premier problème, il faut écrire un constructeur spécifique pour **Carre** qui ne prend qu’un paramètre qui sera affecté à la longueur et à la largeur. Pour attribuer une valeur à ces variables (qui sont privées), le constructeur de **Carre** doit faire appel au constructeur de **Rectangle** en utilisant le mot-clé **super** qui fait appel au constructeur de la classe supérieure comme suit :

```java
public Carre(int cote) {
    super(cote,cote);
}
```

Le second problème peut être résolu par une redéfinition de méthode. On dit qu’une méthode d’une sous-classe redéfinit une méthode de sa classe supérieure, si elles ont la même signature mais que le traitement effectué est ré-écrit dans la sous-classe. Voici le code de la classe **Carre** où sont résolus les deux problèmes soulevés :

```java
public class Carre extends Rectangle {
    public Carre(int cote) {
        super(cote, cote);
    }
    
    public void affiche() {
        System.out.println(”carré ” + this.getLongueur());
    }
}
```

#### Revenons à notre classe « Ville »
Nous allons créer une nouvelle classe, nommée « Capitale », héritée de « Ville ». Les objets « Capitale » auront tous les attributs et toutes les méthodes associés aux objets « Ville » !

```java
class Capitale extends Ville {

}
```

```java
Capitale cap = new Capitale();
System.out.println(cap.decrisToi());
```

![Capitale](Images/capitale.jpg)

Notre classe « Capitale » hérite de la classe « Ville », par conséquent, le constructeur de notre objet appelle, de façon tacite, le constructeur de la classe mère. C'est pour cela que les variables d'instance ont pu être initialisées ! Par contre, essayez ceci dans votre classe :

```java
public class Capitale extends Ville{ 
  public Capitale(){
    this.nomVille = "Tunis";
  } 
}
```

Vous allez avoir une erreur de compilation ! Dans notre classe **« Capitale »**, nous ne pouvons pas utiliser directement les attributs de la classe **« Ville »** qui sont déclarées **« private »**. Seules les méthodes et les variables déclarées **« public »** ou **« protected »** peuvent être utilisées dans une classe héritée.

```java
public class Ville {
 
  public static int nbreInstances = 0;
  protected static int nbreInstancesBis = 0;
  protected String nomVille;
  protected String nomPays;
  protected int nbreHabitants;
  protected char categorie;
  
  //Tout le reste est identique. 
}
```

Ce qui va différencier nos objets <strong><i>Capitale</i></strong> de nos objets <strong><i>Ville</i></strong> sera la présence d'un nouveau champ : le nom d'un monument. Cela implique que nous devons créer un constructeur par défaut et un constructeur d'initialisation pour notre objet <strong><i>Capitale</i></strong>.

```java
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
     
  /**
    * Description d'une capitale
    * @return String retourne la description de l'objet
  */
  public String decrisToi(){
    String str = super.decrisToi() + "\n \t ==>>" + this.monument + "en est un monument";

    return str;
    } 

  /**
    * @return le nom du monument
  */
  public String getMonument() {
    return monument;
  } 

  //Définit le nom du monument
  public void setMonument(String monument) {
    this.monument = monument;
  }   
}
```

Testez le code ci-dessous, il aura pour résultat la figure suivante.

```java
Capitale cap = new Capitale("Paris", 654987, "France", "la tour Eiffel");
System.out.println("\n"+cap.decrisToi());
```

![Capitale1](Images/capitale1.png)

### <a name="polymorphisme">Le polymorphisme</a>
Ce concept complète parfaitement celui de l'héritage. Nous pouvons le définir en disant qu'il permet de manipuler des objets sans vraiment connaître leur type.

Dans notre exemple, vous avez vu qu'il suffisait d'utiliser la méthode <strong><i>« decrisToi() »</i></strong> sur un objet <strong><i>« Ville »</i></strong> ou sur un objet <strong><i>« Capitale »</i></strong>. On pourrait construire un tableau d'objets et appeler <strong><i>« decrisToi() »</i></strong> sans se soucier de son contenu : villes, capitales, ou les deux.

```java
//Définition d'un tableau de villes null
Ville[] tableau = new Ville[6];
        
//Définition d'un tableau de noms de villes et un autre de nombres d'habitants
String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
         
//Les trois premiers éléments du tableau seront des villes,
//et le reste, des capitales
for(int i = 0; i < 6; i++){
  if (i <3){
    Ville V = new Ville(tab[i], tab2[i], "france");
    tableau[i] = V;
  }
         
  else{
    Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
    tableau[i] = C;
  }
}
                 
//Il ne nous reste plus qu'à décrire tout notre tableau !
for(Ville V : tableau){
  System.out.println(V.decrisToi()+"\n");
}
```

La figure suivante vous montre le résultat.

![Polymorphisme](Images/polymorphisme.png)

Je n'ai utilisé que des objets <strong>Ville</strong> dans ma boucle : on appelle ceci la <strong>covariance des variables !</strong> Cela signifie qu'une variable objet peut contenir un objet qui hérite du type de cette variable. Dans notre cas, un objet de type <strong>Ville</strong> peut contenir un objet de type <strong>Capitale</strong>. Dans ce cas, on dit que Ville est la superclasse de Capitale. La covariance est efficace dans le cas où la classe héritant redéfinit certaines méthodes de sa superclasse.

Lorsque vous créez une classe (Ville, par exemple), celle-ci hérite, de façon tacite, de la classe <strong>« Object »</strong> présente dans Java.

La méthode de la classe <strong>« Object »</strong> la plus souvent redéfinie est <strong><i>toString()</i></strong> : elle retourne un String décrivant l'objet en question. Nous allons donc copier la procédure de la méthode <strong><i>decrisToi()</i></strong> dans une nouvelle méthode de la classe Ville : <strong><i>toString()</i></strong>. Voici son code :

```java
public String toString(){
  return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte : "+this.nbreHabitants+" => elle est donc de catégorie : "+this.categorie;
}
```

Nous faisons de même dans la classe Capitale:

```java
public String toString(){
  String str = super.toString() + "\n \t ==>>" + this.monument + " en est un monument";
  return str;
}
```

Maintenant, testez ce code :

```java
//Définition d'un tableau de villes null
Ville[] tableau = new Ville[6];
        
//Définition d'un tableau de noms de Villes et un autre de nombres d'habitants
String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
         
//Les trois premiers éléments du tableau seront des Villes
//et le reste des capitales
for(int i = 0; i < 6; i++){
  if (i <3){
    Ville V = new Ville(tab[i], tab2[i], "france");
    tableau[i] = V;
  }
         
  else{
    Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
    tableau[i] = C;
  }
}
                 
//Il ne nous reste plus qu'à décrire tout notre tableau !
for(Object obj : tableau){
  System.out.println(obj.toString()+"\n");
}
```

**Attention :** si vous ne redéfinissez pas ou ne «&nbsp;polymorphez&nbsp;» pas la méthode d'une classe mère dans une classe fille (exemple de<code data-claire-semantic="text">toString()</code>), à l'appel de celle-ci avec un objet fille, c'est la méthode de la classe mère qui sera invoquée !

Il existe encore un type de méthodes : le type **« final »**. Une méthode signée **final** est figée, vous ne pourrez jamais la redéfinir (la méthode **getClass()** de la classe **Object** est un exemple de ce type de méthode : vous ne pourrez pas la redéfinir).

```java
public final int maMethode(){
  //Méthode ne pouvant pas être redéfinie
}
```

Il existe aussi des classes déclarées <strong>final</strong>. Ces classes sont immuables, et vous ne pouvez donc pas faire hériter un objet d'une classe déclarée <strong>final</strong>.

### <a name="uml">Modéliser ses objets grâce à UML</a>
Avec UML, vous pouvez modéliser toutes les étapes du développement d'une application informatique, de sa conception à la mise en route, grâce à des diagrammes.

Il existe plusieurs outils de modélisation pour créer de tels diagrammes (PowerDesigner, ArgoUML, ...).

Avec ces outils, vous pouvez réaliser les différents diagrammes qu'UML vous propose :

* Le diagramme de use case (cas d'utilisation) permet de déterminer les différents cas d'utilisation d'un programme informatique ;
* Le diagramme de classes ; c'est de celui-là que nous allons nous servir. Il permet de modéliser des classes ainsi que les interactions entre elles ;
* Les diagrammes de séquences, eux, permettent de visualiser le déroulement d'une application dans un contexte donné ;</li>
  <li>et d'autres encore…

Voici un exemple de diagramme de use case décrivant le fonctionnement d'un guichet automatique de banque :

![UseCase](Images/case.png)

Ainsi que son diagramme de séquences :

![Sequence](Images/sequence.png)

Voici une classe nommée <strong>ObjetA</strong> qui a comme attributs :
* numero de type int ;
* nom de type String ;
* bool de type boolean.

Ses méthodes sont :

* getNom() qui retourne une chaîne de caractères ;
* setNom() qui ne renvoie rien ;
* afficher() qui renvoie également une chaîne de caractères.

![Objet](Images/objeta.png)

### Modéliser les liens entre les objets
Sur le diagramme représenté à la figure suivante, vous remarquez un deuxième objet qui dispose, lui aussi, de paramètres. <strong>ObjetB</strong> possède également les attributs et les méthodes de la classe <strong>ObjetA</strong>. C'est parce que la flèche qui relie nos deux objets signifie « extends ». En gros, vous pouvez lire ce diagramme comme suit : l'ObjetB hérite de l'ObjetA.

![UML2](Images/uml2.png)

Dans l'exemple suivant, nous avons toujours notre héritage entre un objet A et un objet B, mais dans ce cas, l'ObjetA (et donc l'ObjetB) possède une variable de classe de type <strong>ObjetC</strong>, ainsi qu'une méthode dont le type de retour est <strong>ObjetC</strong>. Vous pouvez lire ce diagramme comme suit : l'ObjetA a un ObjetC.

![UML3](Images/uml3.png)

Voici le code Java correspondant à ce diagramme.

```java
public class ObjetA{
  protected ObjetC obj = new ObjetC();
   
  public ObjetC getObject(){      
    return obj;    
  }
}
```

```java
public class ObjetB extends ObjetA{ 

}
```

```java
public class ObjetC{ 

}
```

![UML4](Images/uml4.png)

Ce diagramme est identique au précédent, à l'exception de l'ObjetD. Nous devons le lire comme ceci : l'ObjetA est composé de plusieurs instances d'ObjetD. Vous pouvez d'ailleurs remarquer que la variable d'instance correspondante est de type tableau.

Voici le code Java correspondant :

```java
public class ObjetA{
  protected ObjetC obj = new ObjetC();
  protected ObjetD[] objD = new ObjetD[10];
 
  public ObjetC getObject(){
    return obj;
  } 
  public ObjetD[] getObjectD(){
    return objD;
  }
}
```

```java
public class ObjetB extends ObjetA{

}
```

```java
public class ObjetC{

}
```

```java
public class ObjetD{

}
```

### Les packages
Ce sont des dossiers permettant de ranger nos classes. Charger un package nous permet d'utiliser les classes qu'il contient. Pour créer un nouveau package, cliquez simplement sur cette icône comme à la figure suivante (vous pouvez aussi effectuer un clic droit puis <strong><i>New > Package</i></strong>).

![Packages](Images/packages.png)
![Packages1](Images/packages1.png)

### <a name="abstraites">Les classes abstraites</a>
Une classe abstraite est une classe que vous ne pouvez pas instancier. Imaginons que nous ayons une classe A déclarée abstraite. Voici un code qui ne compilera pas :

```java
public class Test{
  public static void main(String[] args){
    A obj = new A(); //Erreur de compilation !  
  }
}
```

#### Exemple
Imaginez que vous êtes en train de réaliser un programme qui gère différents types d'animaux.

![Abstraite](Images/abstraite.png)

Ce type de classe permet de définir des méthodes abstraites qui présentent une particularité : elle n'ont pas de corps ! En voici un exemple :

```java
abstract class Animal{
  abstract void manger(); //Une méthode abstraite
}
```

Une méthode abstraite ne peut exister que dans une classe abstraite. Si, dans une classe, vous avez une méthode déclarée abstraite, vous devez déclarer cette classe comme étant abstraite.

```java
public class Test{
  public static void main(String args[]){
    Animal loup = new Loup();
    Animal chien = new Chien();
    loup.manger();
    chien.crier(); 
  }
}
```

Nous allons ajouter des morceaux de code à nos classes.

* Nos objets seront tous de couleur et de poids différents. Nos classes auront donc le droit de modifier ceux-ci.
* Nous partons du principe que tous nos animaux mangent de la viande. La méthode manger() sera donc définie dans la classe Animal.
* Idem pour la méthode boire(). Ils boiront tous de l'eau.
* Ils ne crieront pas et ne se déplaceront pas de la même manière. Nous emploierons donc des méthodes polymorphes et déclarerons les méthodes deplacement() et crier() abstraites dans la classe Animal.

![Abstraite2](Images/abstraite2.png)
![Abstraite3](Images/abstraite3.png)

##### Animal.java

```java
abstract class Animal {
  protected String couleur;
  protected int poids;

  protected void manger(){
    System.out.println("Je mange de la viande.");
  }
        
  protected void boire(){
    System.out.println("Je bois de l'eau !");
  }
        
  abstract void deplacement();
        
  abstract void crier();
        
  public String toString(){
    String str = "Je suis un objet de la " + this.getClass() + ", je suis " + this.couleur + ", je pèse " + this.poids;
    return str;
  }  
}
```

##### Felin.java

```java
public abstract class Felin extends Animal {
  void deplacement() {
    System.out.println("Je me déplace seul !");
  } 
}
```

##### Canin.java

```java
public abstract class Canin extends Animal {
  void deplacement() {
    System.out.println("Je me déplace en meute !");
  }
}
```

##### Chien.java

```java
public class Chien extends Canin {
  public Chien(){

  }

  public Chien(String couleur, int poids){
    this.couleur = couleur;
    this.poids = poids;
  }       

  void crier() {
    System.out.println("J'aboie sans raison !");
  } 
}
```

##### Loup.java

```java
public class Loup extends Canin {
  public Loup(){
                
  }

  public Loup(String couleur, int poids){
    this.couleur = couleur;
    this.poids = poids;
  }       
 
  void crier() {
    System.out.println("Je hurle à la Lune !"); 
  }
}
```

##### Lion.java

```java
public class Lion extends Felin {
  public Lion(){

  }

  public Lion(String couleur, int poids){
    this.couleur = couleur;
    this.poids = poids;
  }       
 
  void crier() {
    System.out.println("Je rugis dans la savane !");
  }  
}
```

##### Tigre.java

```java
public class Tigre extends Felin {
  public Tigre(){

  }
  public Tigre(String couleur, int poids){
    this.couleur = couleur;
    this.poids = poids;
  }
        
  void crier() {
    System.out.println("Je grogne très fort !");
  } 
}
```

##### Chat.java

```java
public class Chat extends Felin {
  public Chat(){

  }
  public Chat(String couleur, int poids){
    this.couleur = couleur;
    this.poids = poids;
  }
        
  void crier() {
    System.out.println("Je miaule sur les toits !");
  } 
}
```

Et voici le code pour tester nos classes :

```java
public class Test { 
  public static void main(String[] args) {
    Loup l = new Loup("Gris bleuté", 20);
    l.boire();
    l.manger();
    l.deplacement();
    l.crier();
    System.out.println(l.toString());
  } 
}
```

![Abstraite4](Images/abstraite4.png)

Dans cet exemple, nous avons un objet Loup :
* À l'appel de la méthode boire() : l'objet appelle la méthode de la classe Animal.
* À l'appel de la méthode manger() : idem.
* À l'appel de la méthode toString() : idem.
* À l'appel de la méthode deplacement() : c'est la méthode de la classe Canin qui est invoquée ici.
* À l'appel de la méthode crier() : c'est la méthode de la classe Loup qui est appelée.

### <a name="interfaces">Les interfaces</a>

L'héritage multiple étant interdit en Java, pour y remédier nous faisons appel aux interfaces. Ces dernières permettent de créer un nouveau supertype ; on peut même en ajouter autant que l'on le veut dans une seule classe. Une interface n'est rien d'autre qu'une classe 100 % abstraite.

```java
public interface I{ 
  public void A();
  public String B(); 
}
```

```java
public interface I2{ 
  public void C();
  public String D(); 
}
```

```java
public class X implements I{
  public void A(){
    //…
  } 
  public String B(){
    //…
  }
}
```

```java
public class X implements I, I2{
  public void A(){
    //…
  } 
  public String B(){
    //…
  } 
  public void C(){
    //…
  } 
  public String D(){
    //…
  }
}
```

Le polymorphisme vous permet de faire ceci :

```java
public static void main(String[] args){
  //Avec cette référence, vous pouvez utiliser les méthodes de l'interface I
  I var = new X();
  //Avec cette référence, vous pouvez utiliser les méthodes de l'interface I2
  I2 var2 = new X();
  var.A();
  var2.C();   
}
```

L’utilité du concept d’interface réside dans le regroupement de plusieurs classes qui implémentent un ensemble commun de méthodes, sous un même type. Une interface possède les caractéristiques suivantes :
* elle contient des signatures de méthodes ;
* les variables sont déclarées statiques et finales par défaut ;
* une interface peut hériter d’une autre interface (avec le mot-clé extends) ;
* une classe peut implémenter plusieurs interfaces. La liste des interfaces implémentées doit alors figurer après le mot-clé implements placé dans la déclaration de classe, en séparant chaque interface par une virgule.

Dans l'exemple des formes, `Forme` peut être une interface décrivant les méthodes qui doivent être implémentées par les classes `Rectangle` et `Cercle`. L’interface `Forme` s’écrit alors de la manière suivante :

```java
public interface Forme {
    public int surface() ;
    public void affiche() ;
}
```

Pour obliger les classes Rectangle, Cercle et Carre à implémenter les méthodes surface() et affiche(), il faut modifier l’héritage de ce qui était la classe Forme en une implémentation de l’interface définie ci-dessus :

```java
public class Rectangle implements Forme {
    ...
}
```

et

```java
public class Cercle implements Forme {
    ...
}
```

### <a name="exceptions">Les exceptions</a>

Java contient une classe nommée <stromg><i>Exception</i></strong> dans laquelle sont répertoriés différents cas d'erreur. La division par zéro en fait partie ! Si vous créez un nouveau projet avec seulement la classe main et y mettez le code suivant :

```java
int j = 20, i = 0;
System.out.println(j/i);
System.out.println("bonjour tout le monde !");
```

Vous verrez apparaître un message d'erreur Java comme celui de la figure suivante.

![Exception](Images/exception.png)

Nous savons donc maintenant qu'une division par zéro est une ArithmeticException. Nous allons pouvoir la capturer, avec un bloc <stromg><i>try{…}catch{…}</i></stromg>, puis réaliser un traitement en conséquence.

```java
public static void main(String[] args) {
  int j = 20, i = 0;
  try {
    System.out.println(j/i);
  } catch (ArithmeticException e) {
    System.out.println("Division par zéro !");
  }
  System.out.println("bonjour tout le monde !");
}
```

### Les exceptions personnalisées
Nous allons perfectionner un peu la gestion de nos objets Ville et Capitale. On se propose de mettre en œuvre une exception personnalisée afin d'interdire l'instanciation d'un objet Ville ou Capitale présentant un nombre négatif d'habitants.

```java
class NombreHabitantException extends Exception{ 
  public NombreHabitantException(){
    System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");
  }  
}
```

```java
public Ville(String pNom, int pNbre, String pPays) 
  throws  NombreHabitantException
  {  
    if(pNbre < 0)
      throw new NombreHabitantException();
    else
    {
      nbreInstance++;  
      nbreInstanceBis++;

      nomVille = pNom;
      nomPays = pPays;
      nbreHabitant = pNbre;
      this.setCategorie();
    }
  }
```

![Exception1](Images/exception1.jpg)

### La gestion de plusieurs exceptions
Supposons que nous voulons lever une exception si le nom de la ville fait moins de 3 caractères.

```java
public class NomVilleException extends Exception { 
  public NomVilleException(String message){
    super(message);
  }        
}
```

Dans le code suivant, nous ajoutons une condition dans le constructeur Ville :

```java
public Ville(String pNom, int pNbre, String pPays) throws  NombreHabitantException, NomVilleException
{  
  if(pNbre < 0)
    throw new NombreHabitantException(pNbre);
          
  if(pNom.length() < 3)
    throw new NomVilleException("le nom de la ville est inférieur à 3 caractères ! nom = " + pNom);
  else
  {
    nbreInstance++;  
    nbreInstanceBis++;

    nomVille = pNom;
    nomPays = pPays;
    nbreHabitant = pNbre;
    this.setCategorie();
  }          
}
```

```java
Ville v = null;

try {
  v = new Ville("Re", 12000, "France");
}

//Gestion de l'exception sur le nombre d'habitants
catch (NombreHabitantException e) {
  e.printStackTrace();
}

//Gestion de l'exception sur le nom de la ville
catch(NomVilleException e2){
  System.out.println(e2.getMessage());
}
finally{
  if(v == null)
    v = new Ville();
}
      
System.out.println(v.toString());
```

### <a name="collections">Les collections d'objets</a>

![Collection](Images/collection.png)

### Les objets List
Les objets appartenant à la catégorie List sont des tableaux extensibles à volonté. On y trouve les objets <strong>Vector</strong>, <strong>LinkedList</strong> et <strong>ArrayList</strong>. Vous pouvez y insérer autant d'éléments que vous le souhaitez sans craindre de dépasser la taille de votre tableau.

#### L'objet LinkedList
Une liste chaînée est une liste dont chaque élément est lié aux éléments adjacents par une référence à ces derniers. Chaque élément contient une référence à l'élément précédent et à l'élément suivant, exceptés le premier, dont l'élément précédent vaut null, et le dernier, dont l'élément suivant vaut également null.

![LinkedList](Images/linkedlist.png)

```java
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
 
public class Test {
 
  public static void main(String[] args) {
    List l = new LinkedList();
    l.add(12);
    l.add("toto ! !");
    l.add(12.20f);

    for(int i = 0; i < l.size(); i++)
      System.out.println("Élément à l'index " + i + " = " + l.get(i));

      System.out.println("\n \tParcours avec un itérateur ");
      System.out.println("-----------------------------------");
      ListIterator li = l.listIterator();

      while(li.hasNext())
        System.out.println(li.next());
  }
}
```

**Attention :** vu que tous les éléments contiennent une référence à l'élément suivant, de telles listes risquent de devenir particulièrement lourdes en grandissant ! Cependant, elles sont adaptées lorsqu'il faut beaucoup manipuler une collection en supprimant ou en ajoutant des objets en milieu de liste.

#### L'objet ArrayList
ArrayList est un objet qui n'a pas de taille limite et qui accepte n'importe quel type de données, y compris null ! Nous pouvons mettre tout ce que nous voulons dans un ArrayList, voici un morceau de code qui le prouve :

```java
import java.util.ArrayList;
 
public class Test {
 
  public static void main(String[] args) {
         
    ArrayList al = new ArrayList();
    al.add(12);
    al.add("Une chaîne de caractères !");
    al.add(12.20f);
    al.add('d');
                
    for(int i = 0; i < al.size(); i++)
    {
      System.out.println("donnée à l'indice " + i + " = " + al.get(i));
    }               
  }
}
```

Si vous exécutez ce code, vous obtiendrez la figure suivante.

![ArrayList](Images/arraylist.jpg)

Il existe tout un panel de méthodes fournies avec cet objet :
* add() permet d'ajouter un élément ;
* get(int index) retourne l'élément à l'indice demandé ;
* remove(int index) efface l'entrée à l'indice demandé ;
* isEmpty() renvoie « vrai » si l'objet est vide ;
* removeAll() efface tout le contenu de l'objet ;
* contains(Object element) retourne « vrai » si l'élément passé en paramètre est dans l'ArrayList.

Contrairement aux LinkedList, les ArrayList sont rapides en lecture, même avec un gros volume d'objets. Elles sont cependant plus lentes si vous devez ajouter ou supprimer des données en milieu de liste. Pour résumer, si vous effectuez beaucoup de lectures sans vous soucier de l'ordre des éléments, optez pour une ArrayList ; en revanche, si vous insérez beaucoup de données au milieu de la liste, optez pour une Linkedlist.

### Les objets Map
Une collection de type Map est une collection qui fonctionne avec un couple <strong>clé - valeur</strong>. On y trouve les objets <strong>Hashtable, HashMap, TreeMap…</strong> La clé, qui sert à identifier une entrée dans notre collection, est unique. La valeur, au contraire, peut être associée à plusieurs clés.

#### L'objet Hashtable

```java
import java.util.Enumeration;
import java.util.Hashtable;

public class Test {

  public static void main(String[] args) {

    Hashtable ht = new Hashtable();
    ht.put(1, "printemps");
    ht.put(10, "été");
    ht.put(12, "automne");
    ht.put(45, "hiver");

    Enumeration e = ht.elements();

    while(e.hasMoreElements())
      System.out.println(e.nextElement());

  }
}
```

### Les objets Set
Un Set est une collection qui n'accepte pas les doublons. Par exemple, elle n'accepte qu'une seule fois null, car deux valeurs null sont considérées comme un doublon. On trouve parmi les Set les objets <strong>HashSet, TreeSet, LinkedHashSet…</strong>

#### L'objet HashSet

```java
import java.util.HashSet;
import java.util.Iterator;
 
public class Test { 
  public static void main(String[] args) {         
    HashSet hs = new HashSet();
    hs.add("toto");
    hs.add(12);
    hs.add('d');

    Iterator it = hs.iterator();
    while(it.hasNext())
      System.out.println(it.next());
 
    System.out.println("\nParcours avec un tableau d'objet");
    System.out.println("-----------------------------------");
                
    Object[] obj = hs.toArray();
    for(Object o : obj)
      System.out.println(o);                
  }
}
```

### <a name="flux">Les flux d'entrée/sortie</a>

#### L'objet File
Créez un fichier avec l'extension que vous voulez et enregistrez-le à la racine de votre projet Eclipse.

```java
Voici une ligne de test.
Voici une autre ligne de test.
Et en voici une troisième !
```

```java
//Package à importer afin d'utiliser l'objet File
import java.io.File;

public class Main {
  public static void main(String[] args) {
    //Création de l'objet File
    File f = new File("test.txt");
    System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
    System.out.println("Nom du fichier : " + f.getName());
    System.out.println("Est-ce qu'il existe ? " + f.exists());
    System.out.println("Est-ce un répertoire ? " + f.isDirectory());
    System.out.println("Est-ce un fichier ? " + f.isFile());
    
    System.out.println("Affichage des lecteurs à la racine du PC : ");
    for(File file : f.listRoots())
    {
      System.out.println(file.getAbsolutePath());
      try {
        int i = 1;  
        //On parcourt la liste des fichiers et répertoires
        for(File nom : file.listFiles()){
          //S'il s'agit d'un dossier, on ajoute un "/"
          System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName()+"/" : nom.getName()));
                    
          if((i%4) == 0){
            System.out.print("\n");
          }
          i++;
        }
        System.out.println("\n");
      } catch (NullPointerException e) {
        //L'instruction peut générer une NullPointerException
        //s'il n'y a pas de sous-fichier !
      }
    }       
  }
}
```

![Flux](Images/flux.png)

#### Les objets FileInputStream et FileOutputStream

```java
//Packages à importer afin d'utiliser les objets
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
   public static void main(String[] args) {
      // Nous déclarons nos objets en dehors du bloc try/catch
      FileInputStream fis = null;
      FileOutputStream fos = null;

      try {
         // On instancie nos objets :
         // fis va lire le fichier
         // fos va écrire dans le nouveau !
         fis = new FileInputStream(new File("test.txt"));
         fos = new FileOutputStream(new File("test2.txt"));

         // On crée un tableau de byte pour indiquer le nombre de bytes lus à
         // chaque tour de boucle
         byte[] buf = new byte[8];

         // On crée une variable de type int pour y affecter le résultat de
         // la lecture
         // Vaut -1 quand c'est fini
         int n = 0;

         // Tant que l'affectation dans la variable est possible, on boucle
         // Lorsque la lecture du fichier est terminée l'affectation n'est
         // plus possible !
         // On sort donc de la boucle
         while ((n = fis.read(buf)) >= 0) {
            // On écrit dans notre deuxième fichier avec l'objet adéquat
            fos.write(buf);
            // On affiche ce qu'a lu notre boucle au format byte et au
            // format char
            for (byte bit : buf) {
               System.out.print("\t" + bit + "(" + (char) bit + ")");
            }
            System.out.println("");
            //Nous réinitialisons le buffer à vide
            //au cas où les derniers byte lus ne soient pas un multiple de 8
            //Ceci permet d'avoir un buffer vierge à chaque lecture et ne pas avoir de doublon en fin de fichier
            buf = new byte[8];

         }
         System.out.println("Copie terminée !");
      } catch (FileNotFoundException e) {
         // Cette exception est levée si l'objet FileInputStream ne trouve
         // aucun fichier
         e.printStackTrace();
      } catch (IOException e) {
         // Celle-ci se produit lors d'une erreur d'écriture ou de lecture
         e.printStackTrace();
      } finally {
         // On ferme nos flux de données dans un bloc finally pour s'assurer
         // que ces instructions seront exécutées dans tous les cas même si
         // une exception est levée !
         try {
            if (fis != null)
               fis.close();
         } catch (IOException e) {
            e.printStackTrace();
         }

         try {
            if (fos != null)
               fos.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
}
```

La figure suivante représente le résultat de ce code.

![Flux1](Images/flux1.png)

Le bloc <strong>finally</strong> permet de s'assurer que nos objets ont bien fermé leurs liens avec leurs fichiers respectifs, ceci afin de permette à Java de détruire ces objets pour ainsi libérer de la mémoire.

#### Les objets FilterInputStream et FilterOutputStream
Ces deux classes sont des classes abstraites. Elles définissent un comportement global pour leurs classes filles qui, elles, permettent d'ajouter des fonctionnalités aux flux d'entrée/sortie.

![Flux2](Images/flux2.png)

Afin de montrer les améliorations apportées par ces classes, nous allons lire un énorme fichier texte (3,6 Mo) de façon conventionnelle avec l'objet vu précédemment, puis grâce à un buffer.
Voici un code qui permet de tester le temps d'exécution de la lecture :

```java
//Packages à importer afin d'utiliser l'objet File
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    //Nous déclarons nos objets en dehors du bloc try/catch
    FileInputStream fis;
    BufferedInputStream bis;        
    try {
      fis = new FileInputStream(new File("test.txt"));
      bis = new BufferedInputStream(new FileInputStream(new File("test.txt")));
      byte[] buf = new byte[8];

      //On récupère le temps du système
      long startTime = System.currentTimeMillis();
      //Inutile d'effectuer des traitements dans notre boucle
      while(fis.read(buf) != -1);
      //On affiche le temps d'exécution
      System.out.println("Temps de lecture avec FileInputStream : " + (System.currentTimeMillis() - startTime));
                
      //On réinitialise                
      startTime = System.currentTimeMillis();
      //Inutile d'effectuer des traitements dans notre boucle
      while(bis.read(buf) != -1);
      //On réaffiche
      System.out.println("Temps de lecture avec BufferedInputStream : " + System.currentTimeMillis() - startTime));
                
      //On ferme nos flux de données
      fis.close();
      bis.close();
                
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }       
  }
}
```

![Flux3](Images/flux3.png)

Et voici le test avec l’écriture :

```java
//Packages à importer afin d'utiliser l'objet File
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Main {
  public static void main(String[] args) {
    //Nous déclarons nos objets en dehors du bloc try/catch
    FileInputStream fis;
    FileOutputStream fos;
    BufferedInputStream bis;
    BufferedOutputStream bos; 
        
    try {
      fis = new FileInputStream(new File("test.txt"));
      fos = new FileOutputStream(new File("test2.txt"));
      bis = new BufferedInputStream(new FileInputStream(new File("test.txt")));
      bos = new BufferedOutputStream(new FileOutputStream(new File("test3.txt")));
      byte[] buf = new byte[8];
 
      //On récupère le temps du système
      long startTime = System.currentTimeMillis();
                
      while(fis.read(buf) != -1){
        fos.write(buf);
      }
      //On affiche le temps d'exécution
      System.out.println("Temps de lecture + écriture avec FileInputStream et FileOutputStream : " + (System.currentTimeMillis() - startTime));
                
      //On réinitialise                
      startTime = System.currentTimeMillis();
 
      while(bis.read(buf) != -1){
        bos.write(buf);
      }
      //On réaffiche
      System.out.println("Temps de lecture + écriture avec BufferedInputStream et BufferedOutputStream : " + (System.currentTimeMillis() - startTime));
                
      //On ferme nos flux de données
      fis.close();
      bis.close();
      fos.close();
      bos.close();
                
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }       
  }
}
```

![Flux4](Images/flux4.png)

#### Les objets ObjectInputStream et ObjectOutputStream
Lorsqu'on veut écrire des objets dans des fichiers, on appelle ça la « sérialisation » : c'est le nom que porte l'action de sauvegarder des objets.

```java
//Package à importer
import java.io.Serializable;

public class Game implements Serializable{
  private String nom, style;
  private double prix;
    
  public Game(String nom, String style, double prix) {
    this.nom = nom;
    this.style = style;
    this.prix = prix;
  }
    
  public String toString(){
    return "Nom du jeu : " + this.nom + "\n
            Style de jeu : " + this.style + "\n
            Prix du jeu : " + this.prix + "\n";
  } 
}
```

* Nous allons créer deux ou trois objets **Game**;
* Nous allons les sérialiser dans un fichier de notre choix ;
* Nous allons ensuite les désérialiser afin de pouvoir les réutiliser.

```java
//Packages à importer afin d'utiliser l'objet File
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
  public static void main(String[] args) {
    //Nous déclarons nos objets en dehors du bloc try/catch
    ObjectInputStream ois;
    ObjectOutputStream oos;
    try {
      oos = new ObjectOutputStream(
              new BufferedOutputStream(
                new FileOutputStream(
                  new File("game.txt"))));
            
      //Nous allons écrire chaque objet Game dans le fichier
      oos.writeObject(new Game("Assassin Creed", "Aventure", 45.69));
      oos.writeObject(new Game("Tomb Raider", "Plateforme", 23.45));
      oos.writeObject(new Game("Tetris", "Stratégie", 2.50));
      //Ne pas oublier de fermer le flux !
      oos.close();
            
      //On récupère maintenant les données !
      ois = new ObjectInputStream(
              new BufferedInputStream(
                new FileInputStream(
                  new File("game.txt"))));
            
      try {
        System.out.println("Affichage des jeux :");
        System.out.println("*************************\n");
        System.out.println(((Game)ois.readObject()).toString());
        System.out.println(((Game)ois.readObject()).toString());
        System.out.println(((Game)ois.readObject()).toString());
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    
      ois.close();
            
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }       
  }
}
```

Et voci le résultat en figure suivante.

![Flux5](Images/flux5.png)

### <a name="jframe">L'objet JFrame</a>

```java
import javax.swing.JFrame;
 
public class Fenetre extends JFrame {
  public Fenetre(){
    this.setTitle("Ma première fenêtre Java");
    this.setSize(400, 500);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);
  }
}
```

```java
Fenetre fen = new Fenetre();
```

![JFrame](Images/jframe.png)
![JFrame1](Images/jframe1.png)

Un JFrame est composé, dans l'ordre, de :
* le RootPane(en vert), le conteneur principal qui contient les autres composants ;
* le LayeredPane(en violet), qui forme juste un panneau composé du conteneur global et de la barre de menu (MenuBar) ;
* la MenuBar(en orange), la barre de menu, quand il y en a une ;
* le Content Pane (en rose) : c'est dans celui-ci que nous placerons nos composants ;
* le GlassPane (en transparence), couche utilisée pour intercepter les actions de l'utilisateur avant qu'elles ne parviennent aux composants.

### L'objet JPanel

```java
import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame {
  public Fenetre(){             
    this.setTitle("Ma première fenêtre Java");
    this.setSize(400, 100);
    this.setLocationRelativeTo(null);               
 
    //Instanciation d'un objet JPanel
    JPanel pan = new JPanel();
    //Définition de sa couleur de fond
    pan.setBackground(Color.ORANGE);        
    //On prévient notre JFrame que notre JPanel sera son content pane
    this.setContentPane(pan);               
    this.setVisible(true);
  }       
}
```

![JFrame2](Images/jframe2.png)

### L'objet Graphics

```java
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
  public void paintComponent(Graphics g){
    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
    System.out.println("Je suis exécutée !"); 
    g.fillOval(20, 20, 75, 75);
  }               
}
```

```java
import javax.swing.JFrame;
 
public class Fenetre extends JFrame {
  public Fenetre(){                
    this.setTitle("Ma première fenêtre Java");
    this.setSize(100, 150);
    this.setLocationRelativeTo(null);               
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new Panneau());

    this.setVisible(true);
  }     
}
```

![Graphics](Images/graphics.png)

#### La méthode drawOval()

```java
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){                
    int x1 = this.getWidth()/4;
    int y1 = this.getHeight()/4;
    g.drawOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
  }               
}
```

![drawOval](Images/drawoval.png)


#### La méthode drawRect()

```java
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){
    //x1, y1, width, height
    g.drawRect(10, 10, 50, 60);
    g.fillRect(65, 65, 30, 40);
  }               
}
```

![drawRect](Images/drawrect.png)

#### La méthode drawString()

```java
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
 
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){                
    Font font = new Font("Courier", Font.BOLD, 20);
    g.setFont(font);
    g.setColor(Color.red);          
    g.drawString("Bonjour tout le monde !", 10, 20);                
  }               
}
```

#### La méthode drawImage()

```java
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){
    try {
      Image img = ImageIO.read(new File("images.jpg"));
      g.drawImage(img, 0, 0, this);
      //Pour une image de fond
      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
    }                
  }               
}
```

![drawImage](Images/drawimage.png)

### L'objet Graphics2D

```java
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D)g;         
    GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 30, Color.cyan, true);                
    g2d.setPaint(gp);
    g2d.fillRect(0, 0, this.getWidth(), this.getHeight());                
  }               
}
```

![Graphics2](Images/graphics2.png)

### Création d'une animation

```java
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panneau extends JPanel {
  private int posX = -50;
  private int posY = -50;

  public void paintComponent(Graphics g){
    g.setColor(Color.red);
    g.fillOval(posX, posY, 50, 50);
  }

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }        
}
```

```java
import java.awt.Dimension; 
import javax.swing.JFrame;
 
public class Fenetre extends JFrame{
  private Panneau pan = new Panneau();

  public Fenetre(){        
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setContentPane(pan);
    this.setVisible(true);
    go();
  }

  private void go(){
    for(int i = -50; i < pan.getWidth(); i++){
      int x = pan.getPosX(), y = pan.getPosY();
      x++;
      y++;
      pan.setPosX(x);
      pan.setPosY(y);
      pan.repaint();  
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }       
}
```

![Animation](Images/animation.png)

```java
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  private int posX = -50;
  private int posY = -50;

  public void paintComponent(Graphics g){
    //On choisit une couleur de fond pour le rectangle
    g.setColor(Color.white);
    //On le dessine de sorte qu'il occupe toute la surface
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    //On redéfinit une couleur pour le rond
    g.setColor(Color.red);
    //On le dessine aux coordonnées souhaitées
    g.fillOval(posX, posY, 50, 50);
  }

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }
}
```

![Animation1](Images/animation1.png)

#### Améliorations

```java
private void go(){
  for(;;){
    int x = pan.getPosX(), y = pan.getPosY();
    x++;
    y++;
    pan.setPosX(x);
    pan.setPosY(y);
    pan.repaint();  
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    //Si nos coordonnées arrivent au bord de notre composant
    //On réinitialise
    if(x == pan.getWidth() || y == pan.getHeight()){
      pan.setPosX(-50);
      pan.setPosY(-50);
    }
  }
}
```

#### Détection des bords

```java
private void go(){
  //Les coordonnées de départ de notre rond
  int x = pan.getPosX(), y = pan.getPosY();
  //Le booléen pour savoir si l'on recule ou non sur l'axe x
  boolean backX = false;
  //Le booléen pour savoir si l'on recule ou non sur l'axe y
  boolean backY = false;

  //Dans cet exemple, j'utilise une boucle while
  //Vous verrez qu'elle fonctionne très bien
  while(true){
    //Si la coordonnée x est inférieure à 1, on avance
    if(x < 1)
      backX = false;

    //Si la coordonnée x est supérieure à la taille du Panneau moins la taille du rond, on recule
    if(x > pan.getWidth()-50)
      backX = true;

    //Idem pour l'axe y
    if(y < 1)
      backY = false;
    if(y > pan.getHeight()-50)
      backY = true;

    //Si on avance, on incrémente la coordonnée
    //backX est un booléen, donc !backX revient à écrire
    //if (backX == false)
    if(!backX)
      pan.setPosX(++x);

    //Sinon, on décrémente
    else
      pan.setPosX(--x);

    //Idem pour l'axe Y
    if(!backY)
      pan.setPosY(++y);
    else
      pan.setPosY(--y);

    //On redessine notre Panneau
    pan.repaint();

    //Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde
    try {
      Thread.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
```

### L'objet BorderLayout

![Layout](Images/layout.png)

```java
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame; 

public class Fenetre extends JFrame{
  public Fenetre(){
    this.setTitle("Bouton");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    //On définit le layout à utiliser sur le content pane
    this.setLayout(new BorderLayout());

    //On ajoute le bouton au content pane de la JFrame
    //Au centre
    this.getContentPane().add(new JButton("CENTER"), BorderLayout.CENTER);

    //Au nord
    this.getContentPane().add(new JButton("NORTH"), BorderLayout.NORTH);

    //Au sud
    this.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);

    //À l'ouest
    this.getContentPane().add(new JButton("WEST"), BorderLayout.WEST);

    //À l'est
    this.getContentPane().add(new JButton("EAST"), BorderLayout.EAST);
    this.setVisible(true);
  }      
}
```

### L'objet GridLayout

![Layout1](Images/layout1.png)

```java
import java.awt.GridLayout; 
import javax.swing.JButton;
import javax.swing.JFrame;

public class Fenetre extends JFrame{
  public Fenetre(){
    this.setTitle("Bouton");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    //On définit le layout à utiliser sur le content pane
    //Trois lignes sur deux colonnes
    this.setLayout(new GridLayout(3, 2));

    //On ajoute le bouton au content pane de la JFrame
    this.getContentPane().add(new JButton("1"));
    this.getContentPane().add(new JButton("2"));
    this.getContentPane().add(new JButton("3"));
    this.getContentPane().add(new JButton("4"));
    this.getContentPane().add(new JButton("5"));
    this.setVisible(true);
  }      
}
```

### L'objet BoxLayout

![Layout2](Images/layout2.png)

```java
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
  public Fenetre(){
    this.setTitle("Box Layout");
    this.setSize(300, 120);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    JPanel b1 = new JPanel();

    //On définit le layout en lui indiquant qu'il travaillera en ligne
    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
    b1.add(new JButton("Bouton 1"));
    
    JPanel b2 = new JPanel();

    //Idem pour cette ligne
    b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
    b2.add(new JButton("Bouton 2"));
    b2.add(new JButton("Bouton 3"));

    JPanel b3 = new JPanel();

    //Idem pour cette ligne
    b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
    b3.add(new JButton("Bouton 4"));
    b3.add(new JButton("Bouton 5"));
    b3.add(new JButton("Bouton 6"));

    JPanel b4 = new JPanel();

    //On positionne maintenant ces trois lignes en colonne
    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
    b4.add(b1);
    b4.add(b2);
    b4.add(b3);

    this.getContentPane().add(b4);
    this.setVisible(true);
  }
}
```

### L'objet CardLayout

![Layout3](Images/layout3.png)

```java
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
  CardLayout cl = new CardLayout();
  JPanel content = new JPanel();
  //Liste des noms de nos conteneurs pour la pile de cartes
  String[] listContent = {"CARD_1", "CARD_2", "CARD_3"};
  int indice = 0;

  public Fenetre(){
    this.setTitle("CardLayout");
    this.setSize(300, 120);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    //On crée trois conteneurs de couleur différente

    JPanel card1 = new JPanel();
    card1.setBackground(Color.blue);        
    JPanel card2 = new JPanel();
    card2.setBackground(Color.red);     
    JPanel card3 = new JPanel();
    card3.setBackground(Color.green);

    JPanel boutonPane = new JPanel();
    JButton bouton = new JButton("Contenu suivant");
    //Définition de l'action du bouton
    bouton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        //Via cette instruction, on passe au prochain conteneur de la pile
        cl.next(content);
      }
    });

    JButton bouton2 = new JButton("Contenu par indice");
    //Définition de l'action du bouton2
    bouton2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){               
        if(++indice > 2)
          indice = 0;

        //Via cette instruction, on passe au conteneur correspondant au nom fourni en paramètre
        cl.show(content, listContent[indice]);
      }
    });

    boutonPane.add(bouton);
    boutonPane.add(bouton2);
    
    //On définit le layout
    content.setLayout(cl);
    
    //On ajoute les cartes à la pile avec un nom pour les retrouver
    content.add(card1, listContent[0]);
    content.add(card2, listContent[1]);
    content.add(card3, listContent[2]);
    
    this.getContentPane().add(boutonPane, BorderLayout.NORTH);
    this.getContentPane().add(content, BorderLayout.CENTER);
    this.setVisible(true);
  } 
}
```

![Layout4](Images/layout4.png)

### L'objet FlowLayout

![Layout5](Images/layout5.png)

![Layout6](Images/layout6.png)

```java
import java.awt.BorderLayout;
import java.awt.Color; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
  private Panneau pan = new Panneau();
  private JButton bouton = new JButton("mon bouton");
  private JPanel container = new JPanel();

  public Fenetre(){
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);
    container.add(bouton, BorderLayout.SOUTH);
    this.setContentPane(container);
    this.setVisible(true);    
    go();
  }
  
  private void go(){  
    //Les coordonnées de départ de notre rond
    int x = pan.getPosX(), y = pan.getPosY();
    //Le booléen pour savoir si l'on recule ou non sur l'axe x
    boolean backX = false;
    //Le booléen pour savoir si l'on recule ou non sur l'axe y
    boolean backY = false;
    
    //Dans cet exemple, j'utilise une boucle while
    //Vous verrez qu'elle fonctionne très bien
    while(true){
      //Si la coordonnée x est inférieure à 1, on avance
      if(x < 1)backX = false;
      //Si la coordonnée x est supérieure à la taille du Panneau moins la taille du rond, on recule
      if(x > pan.getWidth()-50)backX = true;
      //Idem pour l'axe y
      if(y < 1)backY = false;
      if(y > pan.getHeight()-50)backY = true;
      
      //Si on avance, on incrémente la coordonnée
      if(!backX)
        pan.setPosX(++x);

      //Sinon, on décrémente
      else
        pan.setPosX(--x);

      //Idem pour l'axe Y
      if(!backY)
        pan.setPosY(++y);
      else
        pan.setPosY(--y);

      //On redessine notre Panneau
      pan.repaint();
      //Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde
      try {
        Thread.sleep(3);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }    
  }  
}
```

### Une classe Bouton personnalisée
Créons une classe héritant de `javax.swing.JButton` que nous appellerons `Bouton` et redéfinissons sa méthode `paintComponent()`.

![Bouton](Images/bouton1.png)

Mettre l'image de fond à la racine de votre projet.

![Bouton](Images/bouton.png)

```java
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Bouton extends JButton{
  private String name;
  private Image img;
  
  public Bouton(String str){
    super(str);
    this.name = str;
    try {
      img = ImageIO.read(new File("fondBouton.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D)g;
    GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan, true);
    g2d.setPaint(gp);
    g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    g2d.setColor(Color.black);
    g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 /4), (this.getHeight() / 2) + 5);
  }
}
```

#### Interactions avec la souris : l'interface MouseListener

```java
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException; 
import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Bouton extends JButton implements MouseListener{
  private String name;
  private Image img;

  public Bouton(String str){
    super(str);
    this.name = str;
    try {
      img = ImageIO.read(new File("fondBouton.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }

    //Grâce à cette instruction, notre objet va s'écouter
    //Dès qu'un événement de la souris sera intercepté, il en sera averti
    this.addMouseListener(this);
  }

  public void paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D)g;
    GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan, true);
    g2d.setPaint(gp);
    g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    g2d.setColor(Color.black);
    g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() /  2 /4), (this.getHeight() / 2) + 5);
  }

  //Méthode appelée lors du clic de souris
  public void mouseClicked(MouseEvent event) { }

  //Méthode appelée lors du survol de la souris
  public void mouseEntered(MouseEvent event) { }

  //Méthode appelée lorsque la souris sort de la zone du bouton
  public void mouseExited(MouseEvent event) { }

  //Méthode appelée lorsque l'on presse le bouton gauche de la souris
  public void mousePressed(MouseEvent event) { }

  //Méthode appelée lorsque l'on relâche le clic de souris
  public void mouseReleased(MouseEvent event) { }       
}
```

Notre objet comportera les caractéristiques suivantes :
* il aura une teinte jaune au survol de la souris ;
* il aura une teinte orangée lorsque l'on pressera le bouton gauche ;
* il reviendra à la normale si on relâche le clic.

![Jaune](Images/jaune.png) ![Oranger](Images/oranger.png) ![Vert](Images/vert.png)

```java
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException; 
import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Bouton extends JButton implements MouseListener{
  private String name;
  private Image img;

  public Bouton(String str){
    super(str);
    this.name = str;
    try {
      img = ImageIO.read(new File("fondBouton.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    this.addMouseListener(this);
  }

  public void paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D)g;
    GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan, true);
    g2d.setPaint(gp);
    g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    g2d.setColor(Color.black);
    g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 /4), (this.getHeight() / 2) + 5);
  }

  public void mouseClicked(MouseEvent event) {
    //Inutile d'utiliser cette méthode ici                      
  }

  public void mouseEntered(MouseEvent event) {
    //Nous changeons le fond de notre image pour le jaune lors du survol, avec le fichier fondBoutonHover.png
    try {
      img = ImageIO.read(new File("fondBoutonHover.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void mouseExited(MouseEvent event) {
    //Nous changeons le fond de notre image pour le vert lorsque nous quittons le bouton, avec le fichier fondBouton.png
    try {
      img = ImageIO.read(new File("fondBouton.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void mousePressed(MouseEvent event) {
    //Nous changeons le fond de notre image pour le jaune lors du clic gauche, avec le fichier fondBoutonClic.png
    try {
      img = ImageIO.read(new File("fondBoutonClic.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void mouseReleased(MouseEvent event) {
    //Nous changeons le fond de notre image pour le orange lorsque nous relâchons le clic, avec le fichier fondBoutonHover.png
    try {
      img = ImageIO.read(new File("fondBoutonHover.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }               
  }       
}
```

**Problème :** Quand on clique sur le bouton et on relâche le clic en dehors, le fond du bouton deviendra orange, puisque c'est ce qui doit être effectué vu la méthode `mouseReleased()`. Afin de pallier ce problème, nous allons vérifier que lorsque le clic est relâché, la souris se trouve toujours sur le bouton.

Voici le correctif e la méthode `mouseReleased()` de notre classe `Bouton` :

```java
public void mouseReleased(MouseEvent event) {
  //Nous changeons le fond de notre image pour le orange lorsque nous relâchons le clic avec le fichier fondBoutonHover.png si la souris est toujours sur le bouton

  if((event.getY() > 0 && event.getY() < this.getHeight()) && (event.getX() > 0 && event.getX() < this.getWidth())){
    try {
      img = ImageIO.read(new File("fondBoutonHover.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  //Si on se trouve à l'extérieur, on dessine le fond par défaut
  else{
    try {
      img = ImageIO.read(new File("fondBouton.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }               
}
```

#### Déclencher une action : l'interface ActionListener

Notre but est de pouvoir lancer ou arrêter l'animation dans le `Panneau`.

Créez une variable d'instance de type JLabel (appelez-la label) et initialisez-la avec le texte qui vous plaît ; ajoutez-la ensuite à votre content pane en position `BorderLayout.NORTH`.

Le résultat se trouve en figure suivante.

![ActionListener](Images/listener.png)

```java
public class Fenetre extends JFrame {
  private Panneau pan = new Panneau();
  private Bouton bouton = new Bouton("mon bouton");
  private JPanel container = new JPanel();
  private JLabel label = new JLabel("Le JLabel");

  public Fenetre(){
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);
    container.add(bouton, BorderLayout.SOUTH);
    
    //Définition d'une police d'écriture
    Font police = new Font("Tahoma", Font.BOLD, 16);

    //On l'applique au JLabel
    label.setFont(police);

    //Changement de la couleur du texte
    label.setForeground(Color.blue);

    //On modifie l'alignement du texte grâce aux attributs statiques de la classe JLabel
    label.setHorizontalAlignment(JLabel.CENTER);
    
    container.add(label, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);

    go();
  }

  //Le reste ne change pas

}
```

Nous allons maintenant informer notre objet `Bouton` que notre objet `Fenetre` l'écoute. Ajoutons notre Fenetre à la liste des objets qui écoutent notre Bouton grâce à la méthode `addActionListener(ActionListener obj)`.

```java
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener{
  private Panneau pan = new Panneau();
  private Bouton bouton = new Bouton("mon bouton");
  private JPanel container = new JPanel();
  private JLabel label = new JLabel("Le JLabel");

  //Compteur de clics
  private int compteur = 0;

  public Fenetre(){
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);

    //Nous ajoutons notre fenêtre à la liste des auditeurs de notre bouton
    bouton.addActionListener(this);

    container.add(bouton, BorderLayout.SOUTH);

    Font police = new Font("Tahoma", Font.BOLD, 16);  
    label.setFont(police);  
    label.setForeground(Color.blue);  
    label.setHorizontalAlignment(JLabel.CENTER);
    container.add(label, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);

    go();
  }

  private void go(){
    //Cette méthode ne change pas
  }

  public void actionPerformed(ActionEvent arg0) {
    //Lorsque l'on clique sur le bouton, on met à jour le JLabel
    this.compteur++;
    label.setText("Vous avez cliqué " + this.compteur + " fois");
  }      
}
```

![ActionListener2](Images/listener2.png)

Nous allons maintenant ajouter un deuxième bouton à notre `Fenetre`, à côté du premier.

```java
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener{
  private Panneau pan = new Panneau();
  private JButton bouton = new JButton("bouton 1");
  private JButton bouton2 = new JButton("bouton 2");
  private JPanel container = new JPanel();
  private JLabel label = new JLabel("Le JLabel");
  private int compteur = 0;

  public Fenetre(){
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);

    bouton.addActionListener(this);
    bouton2.addActionListener(this);

    JPanel south = new JPanel();
    south.add(bouton);
    south.add(bouton2);
    container.add(south, BorderLayout.SOUTH);

    Font police = new Font("Tahoma", Font.BOLD, 16);
    label.setFont(police);
    label.setForeground(Color.blue);
    label.setHorizontalAlignment(JLabel.CENTER);
    container.add(label, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);

    go();
  }

  //…

}
```

![ActionListener3](Images/listener3.png)

#### Classes internes
En Java, on peut créer ce que l'on appelle des classes internes. Cela consiste à déclarer une classe à l'intérieur d'une autre classe. Les classes internes possèdent tous les avantages des classes normales, de l'héritage d'une superclasse à l'implémentation d'une interface. Elles bénéficient donc du polymorphisme et de la covariance des variables. En outre, elles ont l'avantage d'avoir accès aux attributs de la classe dans laquelle elles sont déclarées.

Dans notre exemple, nous créerons deux classes internes implémentant chacune l'interface `ActionListeneret` redéfinissant la méthode `actionPerformed()` :

* `BoutonListener` écoutera le premier bouton ;
* `Bouton2Listener` écoutera le second.

Une fois ces opérations effectuées, il ne nous reste plus qu'à indiquer à chaque bouton « qui l'écoute » grâce à la méthode `addActionListener()`.

Voyez ci-dessous la classe Fenetre mise à jour.

```java
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame{
  private Panneau pan = new Panneau();
  private JButton bouton = new JButton("bouton 1");
  private JButton bouton2 = new JButton("bouton 2");
  private JPanel container = new JPanel();
  private JLabel label = new JLabel("Le JLabel");
  private int compteur = 0;
  
  public Fenetre(){
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
 
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);
        
    //Ce sont maintenant nos classes internes qui écoutent nos boutons 
    bouton.addActionListener(new BoutonListener());
    bouton2.addActionListener(new Bouton2Listener());
        
    JPanel south = new JPanel();
    south.add(bouton);
    south.add(bouton2);
    container.add(south, BorderLayout.SOUTH);
    Font police = new Font("Tahoma", Font.BOLD, 16);
    label.setFont(police);
    label.setForeground(Color.blue);
    label.setHorizontalAlignment(JLabel.CENTER);
    container.add(label, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);
    go();
  }
      
  private void go(){
    //Cette méthode ne change pas
  }
      
  //Classe écoutant notre premier bouton
  class BoutonListener implements ActionListener{
    //Redéfinition de la méthode actionPerformed()
    public void actionPerformed(ActionEvent arg0) {
      label.setText("Vous avez cliqué sur le bouton 1");        
    }
  }
      
  //Classe écoutant notre second bouton
  class Bouton2Listener implements ActionListener{
    //Redéfinition de la méthode actionPerformed()
    public void actionPerformed(ActionEvent e) {
      label.setText("Vous avez cliqué sur le bouton 2");    
    }
  }      
}
```

#### Contrôler son animation : lancement et arrêt
Pour parvenir à gérer le lancement et l'arrêt de notre animation, nous allons devoir modifier un peu le code de notre classe `Fenetre`. Il va falloir changer le libellé des boutons de notre IHM : le premier affichera **Go** et le deuxième **Stop**.

Afin de bien gérer notre animation, nous devons améliorer notre méthode `go()`. Sortons donc de cette méthode les deux entiers dont nous nous servions afin de recalculer les coordonnées de notre rond. La boucle infinie doit dorénavant pouvoir être interrompue ! Pour réussir cela, nous allons déclarer un booléen qui changera d'état selon le bouton sur lequel on cliquera ; nous l'utiliserons comme paramètre de notre boucle.

Voyez ci-dessous le code de notre classe `Fenetre`.

```java
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
  private Panneau pan = new Panneau();
  private JButton bouton = new JButton("Go");
  private JButton bouton2 = new JButton("Stop");
  private JPanel container = new JPanel();
  private JLabel label = new JLabel("Le JLabel");
  private int compteur = 0;
  private boolean animated = true;
  private boolean backX, backY;
  private int x, y;

  public Fenetre(){
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);
    bouton.addActionListener(new BoutonListener()); 
    bouton.setEnabled(false);
    bouton2.addActionListener(new Bouton2Listener());

    JPanel south = new JPanel();
    south.add(bouton);
    south.add(bouton2);
    container.add(south, BorderLayout.SOUTH);
    Font police = new Font("Tahoma", Font.BOLD, 16);
    label.setFont(police);
    label.setForeground(Color.blue);
    label.setHorizontalAlignment(JLabel.CENTER);
    container.add(label, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);
    go();
  }

  private void go(){
    //Les coordonnées de départ de notre rond
    x = pan.getPosX();
    y = pan.getPosY();
    //Dans cet exemple, j'utilise une boucle while
    //Vous verrez qu'elle fonctionne très bien
    while(this.animated){
      if(x < 1)backX = false;
      if(x > pan.getWidth()-50)backX = true;          
      if(y < 1)backY = false;
      if(y > pan.getHeight()-50)backY = true;
      if(!backX)pan.setPosX(++x);
      else pan.setPosX(--x);
      if(!backY) pan.setPosY(++y);
      else pan.setPosY(--y);
      pan.repaint();

      try {
        Thread.sleep(3);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }     
  }

  class BoutonListener implements ActionListener{
    public void actionPerformed(ActionEvent arg0) {
      animated = true;
      bouton.setEnabled(false);
      bouton2.setEnabled(true);
      go();
    }
  }

  class Bouton2Listener implements ActionListener{
     public void actionPerformed(ActionEvent e) {
      animated = false;     
      bouton.setEnabled(true);
      bouton2.setEnabled(false);
    }
  }     
}
```

À l'exécution, vous remarquez que :
* le bouton Go n'est pas cliquable et l'autre l'est ;
* l'animation se lance ;
* l'animation s'arrête lorsque l'on clique sur le boutonStop ;
* le boutonGodevient alors cliquable ;
* lorsque vous cliquez dessus, l'animation ne se relance pas !

Un thread est lancé au démarrage de notre application : c'est le processus principal du programme. Au démarrage, l'animation est donc lancée dans le même thread que notre objet `Fenetre`. Lorsque nous lui demandons de s'arrêter, aucun problème : les ressources mémoire sont libérées, on sort de la boucle infinie et l'application continue à fonctionner.

Mais lorsque nous redemandons à l'animation de se lancer, l'instruction se trouvant dans la méthode `actionPerformed()` appelle la méthode `go()` et, étant donné que nous nous trouvons à l'intérieur d'une boucle infinie, nous restons dans la méthode `go()` et ne sortons plus de la méthode `actionPerformed()`.

#### Solution : Les threads
Les threads sont des unités d'exécution de notre programme. Lorsque nous en créons plusieurs, nous pouvons exécuter des tâches simultanément. 

Il nous suffit de créer un nouveau thread lorsqu'on clique sur le bouton Go en lui passant une implémentation de l'interface  Runnable en paramètre qui, elle, va appeler la méthode go().

Voici le code de notre classe `Fenetre` utilisant le thread en question :

```java
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame{
  private Panneau pan = new Panneau();
  private JButton bouton = new JButton("Go");
  private JButton bouton2 = new JButton("Stop");
  private JPanel container = new JPanel();
  private JLabel label = new JLabel("Le JLabel");
  private int compteur = 0;
  private boolean animated = true;
  private boolean backX, backY;
  private int x, y;
  private Thread t;

  public Fenetre(){
    //Le constructeur n'a pas changé
  }

  private void go(){
    //La méthode n'a pas changé
  }

  public class BoutonListener implements ActionListener{
    public void actionPerformed(ActionEvent arg0) {
      animated = true;
      t = new Thread(new PlayAnimation());
      t.start();
      bouton.setEnabled(false);
      bouton2.setEnabled(true);
    }
  }

  class Bouton2Listener  implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      animated = false;       
      bouton.setEnabled(true);
      bouton2.setEnabled(false);
    }
  }       

  class PlayAnimation implements Runnable{
    public void run() {
      go();                   
    }               
  }       
}
```



-->















