import java.util.Scanner;

/**
 * Affiche les valeurs tapés si l'utilisateur tape -99
 * @author Kevin El-Saikali
 * @version 1.1, 2022-04-01
 */

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentAnswer = ""; //Tout sauf -99
        String collector = ""; //Initialement vide

        while (true){
            System.out.println("Inscrivez le nombre \"-99\" pour terminer le programme");
            System.out.print("Inscrivez le nombre ou un nom: ");
                currentAnswer = sc.next();
                collector += currentAnswer + " ";

            if (currentAnswer.equals("-99")){
                break;
            }

            else if (currentAnswer.equals("-99")){
                System.out.println("Inscrivez le nombre \"-99\" pour terminer le programme");
                System.out.print("Inscrivez un autre nom ou nombre: ");
                    currentAnswer = sc.next();
                    collector += currentAnswer + " ";
            }
        }

        System.out.print("Terminé! ");
        System.out.println("Voici les valeurs que vous avez inscrits: ");
        System.out.println(collector);
        //Boucle while true qui inclut les commandes de While.java
        //Afficher la variable collector qui inclut toutes les reponses avant le -99
    }
}
