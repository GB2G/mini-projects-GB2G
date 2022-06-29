import java.util.Scanner;

/**
 * Enigmes utilisant des Scanners
 * @author Kevin El-Saikali
 * @version 2022/03/11 - 2022/03/21
 */

public class MP2{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String answer, rightanswer = "lit";
        int rightanswer2 = 100; 
        int answer2; 
        
        System.out.println("Qu'est ce qui a 4 jambes du haut et du bas,\nEst doux au milieu,\nMais dur tout autour?");
        System.out.print("\nUn ");
        answer = sc.next().toLowerCase();

       while (!answer.equals(rightanswer)){ 
        System.out.println("Mauvaise réponse");
        System.out.print("Essaye encore > ");
        answer = sc.next().toLowerCase();
        sc.nextLine();
     }
        System.out.println("Réponse: Un lit");

       System.out.println("Vous avez bien repondu a la premiere question.");
       System.out.println("Prochaine question: ");
       System.out.print("\nC'est quoi le réponse de 10 x 10? > ");
       answer2 = sc.nextInt();

       while (answer2 != rightanswer2){
           System.out.println("Mauvaise réponse");
           System.out.print("\nEssaye encore > ");
           answer2 = sc.nextInt();
       }
         System.out.println("Bonne réponse = "+ rightanswer2);

       System.out.println("Bravo, vous avez presque fini...");
       System.out.print("Finalement, c'est quoi la valeur de la gravité terrestre? (Virgule entre les chiffres)> ");
       double gravity = sc.nextDouble();

       while (gravity != 9.81) {
           System.out.println("Mauvaise réponse");
           System.out.print("\nEssaye encore > ");
           gravity = sc.nextDouble();
           
       }
       if (gravity == 9.81){ // #2 et encore
           System.out.println("Bonne réponse "+ gravity + " m/s^2\n"); //Faut un point ou une virgule #2
       }

       System.out.println("Merci d'avoir répondu a mes questions");
       
       System.out.println("Réponses reçus: "+ answer + ", "+ answer2+ ", "+ gravity+ " m/s^2");
    }

}