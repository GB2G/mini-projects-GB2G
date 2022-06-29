import java.util.Scanner;

/**
 * Affiche les valeurs tapés si l'utilisateur tape -99
 * @author Kevin El-Saikali
 * @version 1.0, 2022-04-01
 */
public class While
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentAnswer = ""; //Tout sauf -99
        String collector = ""; //Initialement vide

        System.out.println("Inscrivez le nombre \"-99\" pour terminer le programme");
        System.out.print("Inscrivez le nombre ou un nom: ");
        currentAnswer = sc.next();
        collector += currentAnswer + " ";

        while (! currentAnswer.equals("-99")){
            System.out.println("Inscrivez le nombre \"-99\" pour terminer le programme");
            System.out.print("Inscrivez un autre nom ou nombre: ");
            currentAnswer = sc.next();
            collector += currentAnswer + " ";
        }

        System.out.print("Terminé! ");
        System.out.println("Voici les valeurs que vous avez inscrits: ");
        System.out.println(collector);
        //Boucle while qui se repete si le texte affiche est pas -99
        //Afficher la variable collector qui inclut toutes les reponses avant le -99
    }
}

//**Créer un fichier qui s’appelle While.java et développer une chaîne 
//de texte (un String) avec les réponses de l’utilisateur jusqu’à ce que 
//l’utilisateur donne la réponse “-99”. Afficher la chaîne complétée par la suite. */