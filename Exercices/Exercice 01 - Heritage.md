### Indiquer l'affichage du programme.

```java
class Alphabet {
 public static void main(String args[]) {
 A[] as = new A[3];
 as[0] = new A(1);
 as[1] = new B(2);
 as[2] = new C(3);
 
 for (int i = 0; i < as.length; i++) {
 as[i].afficherClasse();
 System.out.println("-----");
 }
 
 for (int i = 0; i < as.length; i++) {
 as[i].afficherVariables();
 System.out.println("-----");
 }
 }
}
 
class A {
 protected int a = 5;
 
 public A(int a) {
 this.a = a;
 }
 
 public void afficherClasse() {
 System.out.println("Classe A");
 }
 
 public void afficherVariables() {
 System.out.println("a = " + a);
 }
}
 
class B extends A {
 protected int b = 6;
 
 public B(int b) {
 super(2 * b);
 a = b;
 }
 
 public void afficherClasse() {
 super.afficherClasse();
 System.out.println("Classe B");
 }
 
 public void afficherVariables() {
 super.afficherVariables();
 System.out.println("b = " + b);
 }
}
 
class C extends B {
 protected int b = 7;
 protected int c = 8;
 
 public C(int c) {
 super(3 * c);
 b = c;
 }
 
 public void afficherClasse() {
 super.afficherClasse();
 System.out.println("Classe C");
 }
 
 public void afficherVariables() {
 super.afficherVariables();
 System.out.println("c = " + c);
 }
}
```

### Solution

L'affichage correct et donné ci-dessous.

```
Classe A
-----
Classe A
Classe B
-----
Classe A
Classe B
Classe C
-----
a = 1
-----
a = 2
b = 6
-----
a = 9
b = 6
c = 8
```

La difficulté principale réside dans l'affichage du dernier objet (de type C).

Pourquoi l'attribut b vaut-il 6 et non pas 3 ?

Réponse : à cause du masquage. En effet, si on observe la hiérarchie de classes donnée, on peut remarquer qu'un objet de type C possède en fait deux attributs b : l'un hérité de B et l'autre redéfini dans C (qui masque le premier).

Lorsque la méthode afficherVariables va être invoquée sur l'objet de type C, elle va appeler la méthode afficherVariables de la super-classe (B). Cette dernière va afficher l'attribut b de la super-classe, qui vaut 6.

Pour bien comprendre la nuance, remplacez la méthode afficherVariables de la classe C par la suivante :

```java 
    public void afficherVariables() {
        super.afficherVariables();
        System.out.println("b (masquant) = " + b);
        System.out.println("c = " + c);
    }
```
 
Ré-exécutez le programme. L'affichage devrait alors être le suivant:

```
Classe A
-----
Classe A
Classe B
-----
Classe A
Classe B
Classe C
-----
a = 1
-----
a = 2
b = 6
-----
a = 9
b = 6
b (masquant) = 3
c = 8
-----
```
