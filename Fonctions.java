import java.util.Scanner;

/**
* Calculatrice de formes géométriques 
* @author Kevin El-Saikali
* @version 2022/05/02
*/
public class Fonctions {

    /** Scanner utilisable dans toutes les fonctions sans passer de paramètre */
    private static Scanner sc = new Scanner( System.in );

    public static void main(String[] args) {
        String item;
        boolean fin = false;
        double perimeter, x, y, z;

        accueille(); //Lance le message d'acceuil

        while ( ! fin ) {
            item = lanceMenu(); //Va lancer la liste d'options

            if (item.equals("1")){//Si la valeur "item" = 1, on cherche le diametre 
                System.out.println("Cercle");
                System.out.println("Entrez le Diamètre: ");
                x = sc.nextDouble();

                perimeter = calculePerimetreCercle(x); //On appel la fonction qui calcule le Perimetre d'un cercle
                //On doit lui donner les variables à utiliser aussi (dans ce cas x)
                System.out.println("Le périmètre de cet objet est "+ perimeter + " unités\n");
            }

            else if (item.equals("2")){//Si la valeur "item" = 2, on cherche la valeur d'un coté du carré
                System.out.println("Cercle");
                System.out.println("Carré");
                System.out.print("Entrer une coté: ");
                x = sc.nextDouble(); //La valeur cherché est assigné à la variable x

                perimeter = calculePerimetreCarre(x); //On appèle la fonction pour calculer le périmètre d'un carré
                //On doit lui donner les variables à utiliser aussi (dans ce cas x)
                System.out.println("Le périmètre de cet objet est "+ perimeter + " unités\n");
               
            }

            else if (item.equals("3")){ //Si la valeur "item" = 3, on cherche la base et hauteur de la rectangle
                System.out.println("Rectangle");
                System.out.print("Enter la base: ");
                x = sc.nextDouble(); //On assigne la valeur "base" à x

                System.out.print("Entrer la hauteur: ");
                y = sc.nextDouble(); //On assigne la valeur "hauteur" à y

                perimeter = calculePerimetreRect(x, y); //On fait appel à la fonction qui calcule le périmètre d'un rectangle
                //On doit lui donner les variables à utiliser aussi (dans ce cas x et y)
                System.out.println("Le périmètre de cet objet est "+ perimeter + " unités\n");
            }

            else if (item.equals("4")){ //Si la valeur "item" = 4, on cherche les 3 longeurs d'un triangle'
                System.out.println("Triangle");
                System.out.print("Entrer coté 1:");
                x = sc.nextDouble(); //On assigne longeur 1 à x

                System.out.print("Entrer coté 2:");
                y = sc.nextDouble(); //On assigne longeur 2 à y

                System.out.print("Entrer coté 3:");
                z = sc.nextDouble(); //On assigne longeur 3 à z

                perimeter = calculePerimetreTriangle(x, y, z); //On fait appel à la fonction qui calcule le périmètre d'un triangle
                //On doit lui donner les variables à utiliser aussi (dans ce cas x y et z)
                System.out.println("Le périmètre de cet objet est "+ perimeter + " unités\n");

            }

            if ( item.equals( "5" ) ) { 
                fin = true;
                //Si la valeur de "item" = 5, on va 'break' du programme et le terminer
            }

        }
    }

    private static void accueille(){
        System.out.println("\nBienvenue au programme de Calculatrice géométrique");
        System.out.println("Faites vos sélections en bas:\n");
        //Message d'acceuil
    }
      
      
    private static String lanceMenu() {
        String choix = "";

        System.out.println("Calculatrice de l'aire d'une forme geometrique" );
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\t1) Cercle");
        System.out.println("\t2) Carré");
        System.out.println("\t3) Rectangle");
        System.out.println("\t4) Triangle");
        System.out.println("\t5) Quitter");
        System.out.print("> ");

        choix = sc.next();
        //Liste des choix de calculs possibles
        return choix;
        //Retourne la valeur de "choix", à être utilisé dans le boucle 'while'
    }

    private static double calculePerimetreCarre(double x){ //Fonction appelé si "item" = 2
        double a;

        a = x*4;

        return a; //Retourne la réponse comme valeur finale du périmètre
    }

    private static double calculePerimetreCercle(double x){ //Fonction appelé si "item" = 1
        double a;

        a = x*Math.PI;

        return a; //Retourne la réponse comme valeur finale du périmètre
    }

    private static double calculePerimetreRect(double x, double y){ //Fonction appelé si "item" = 3
        double a;

        a = (2*x) + (2*y);

        return a; //Retourne la réponse comme valeur finale du périmètre
    }

    private static double calculePerimetreTriangle( double x, double y, double z ){ //Fonction appelé si "item" = 4
        double a;

        a = x + y + z;

        return a; //Retourne la réponse comme valeur finale du périmètre
    }
    
      
}