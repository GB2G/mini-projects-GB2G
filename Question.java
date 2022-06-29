import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guess;

        System.out.println("Question à choix multiple: \n");
        System.out.println("Aimez-vous la programmation et l'informatique?");
        System.out.println("\tA: Oui ca m'interesse beaucoup");
        System.out.println("\tB: C'est pas mal");
        System.out.println("\tC: Ce n'est pas pour moi");
        System.out.println("\tD: Je le déteste");

            System.out.print("Quelle cas s'applique a vous? ");
            boolean validChoice = true;

            do {
                guess = sc.nextLine();
                if (guess.equalsIgnoreCase("A")){
                    validChoice = true;
                    System.out.println("\nMoi aussi!");
                    break;
                }
                else if (guess.equalsIgnoreCase("B")){
                    validChoice = true;
                    System.out.println("\nCool");
                    break;
                }
                else if (guess.equalsIgnoreCase("C")){
                    validChoice = true;
                    System.out.println("\nTout le monde a leurs propres préférences");
                    break;
                }
                else if (guess.equalsIgnoreCase("D")){
                    validChoice = true;
                    System.out.println("\nDommage");
                    break;
                }

                else {
                    validChoice = false;
                    System.out.println("\nCe n'est pas une reponse valide. ");
                    System.out.print("Essaye encore: ");
                }

            } while (true);

            System.out.println("\nMerci d'avoir répondu à ma question");

        }
}
