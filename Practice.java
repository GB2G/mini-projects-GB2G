import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.security.MessageDigest;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Formatter;
import java.io.File;

public class Practice {
    public static String uName;
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
      authentification();
    } 

    private static void authentification() throws Exception{
        System.out.print(red);
        System.out.println("\nBienvenue a votre journal personnel.");
        System.out.println("Que voulez vous faire?: ");
        System.out.println("1) Acceder a votre compte");
        System.out.println("2) Creer une nouvelle compte");
        System.out.print("[ENTER] Quitter > ");
        System.out.print(reset);
         String answer = sc.nextLine();

         if (answer.equals("1")){
             signIn();
         }

         if (answer.equals("2")){
            signUp();
         }
    }
    
    public static void signIn() throws Exception {
        MessageDigest digest2 = MessageDigest.getInstance("SHA-256");
        Formatter bytesToHex2 = new Formatter();
        
        System.out.print("Entrez votre nom d'utilisateur: ");
        uName = sc.nextLine();

        Scanner fileIn2 = new Scanner(new File("usernames.txt"));
        boolean found = false;
        while (fileIn2.hasNext() && ! found){
            String curr = fileIn2.next();
            if (curr.equals(uName)){
                found = true;
            }
        }
        fileIn2.close();
        if ( ! found ){
            System.out.println("Le nom d'utilisateur n'existe pas");
            System.out.print("Essaye encore: ");
            uName = sc.nextLine();
        }
        else {
            System.out.println("Bienvenue " + uName);
            System.out.print("Entrez votre mot de passe: ");
            String pw = sc.nextLine();

            digest2.update(pw.getBytes("UTF-8"));
                for (byte b : digest2.digest()) {
                    bytesToHex2.format("%02x", b);
                }
            String e = bytesToHex2.toString();
    
            Scanner fileIn = new Scanner(new File("pw.txt"));
            String a = fileIn.next();
    
            while (!e.toString().equals(a.toString())){
                Formatter bytesToHex3 = new Formatter();
                MessageDigest digest3 = MessageDigest.getInstance("SHA-256");
            
                System.out.println("\nCe n'est pas le bon mot de passe");
                System.out.print("Entrez votre mot de passe: ");
                pw = sc.nextLine();
            
                digest3.update(pw.getBytes("UTF-8"));
                for (byte b : digest3.digest()) {
                    bytesToHex3.format("%02x", b);
                }
            
                e = bytesToHex3.toString();    
            }

            System.out.println("\n");

            welcome();
            menu();
        }
    }

    public static void signUp() throws Exception{
        
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        Formatter bytesToHex = new Formatter();
        Scanner sweep = new Scanner(new File("pw.txt"));
        
        System.out.print("Entrez votre nom d'utilisateur (pas d'espaces): ");
        String uName = sc.nextLine();

        FileWriter fileout = new FileWriter("usernames.txt", true);
        fileout.write(uName + "\n");
        fileout.close();

        System.out.println("\nS'il vous plait entrer une mot de passe.");
        System.out.println("(Ce dernier va etre utiliser comme authentification)");
        String pw = sc.nextLine();
    
            digest.update(pw.getBytes("UTF-8"));
            for (byte b : digest.digest()) {
                bytesToHex.format("%02x", b);
            }
    
        //file2.print(user + " " + bytesToHex);
        FileWriter file2 = new FileWriter("pw.txt", true);
        file2.write(uName + " " + bytesToHex.toString() + "\n");
        file2.close();
        
        welcome();
        menu();
    }

    public static void signOut() throws Exception{
        main(null);
    }

    public static void welcome() throws Exception{
        java.util.Date date2 = new java.util.Date();

        System.out.print(red);
        System.out.println("Bienvenue! ");
        System.out.println("Aujourd'hui nous sommes le: "+ date2 + "\n");
        System.out.print(reset);
    }

    private static void menu() throws Exception{
    String choice = options();
        if (choice.equals("1"))
        journalWrite();

        else if(choice.equals("2"))
        journalRead();

        else if(choice.equals("3"))
        selfDestruct();
        
        else if(choice.equals("4"))
        readOnlyOne();

        //else if(choice.equals("5"))
        //pwChange();

        else if(choice.equals("6")){
            signOut();
        }
}

    private static String options(){
        String a;
     
        System.out.print(green);
        System.out.println("Voici vos options:");
        System.out.println("1) Creer un nouveau entree de journal.");
        System.out.println("2) Lire le journal.");
        System.out.println("3) Supprimer le journal.");
        System.out.println("4) Lire seulement un entree de journal");
        //System.out.println("5) Changer le mot de passe.");
        System.out.println("6) Se deconnecter");
        System.out.print("[ENTER] pour quitter > ");
        System.out.print(reset);
        a = sc.nextLine();

        return a;
    }
    
    public static void journalWrite() throws Exception{
        
        String userJournal = ((uName) + "journal.txt");
        FileWriter fileout = new FileWriter(userJournal, true);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();

        fileout.write(dtf.format(now) + "\n");

        System.out.println(blue);
        System.out.println("Ecrivez votre entree ici:");
        System.out.println(reset);
        String entry = sc.nextLine();

        fileout.write("\t" + entry + "\n");
        fileout.close();

        System.out.println("\n");
        menu();
    }

    private static void journalRead() throws Exception{
        
        String userJournal = ((uName) + "journal.txt");
        Scanner fileIn = new Scanner(new File(userJournal));

        System.out.println("Voici vos entrees jusqu'a date: ");

        while (fileIn.hasNextLine()){
            String entries = fileIn.nextLine();
            System.out.println(purple + entries + reset);
        
        }
        System.out.println("\n");
        menu();
    }

    public static void readOnlyOne() throws Exception{
        
        String userJournal = ((uName) + "journal.txt");
        Scanner readEntry = new Scanner(new File(userJournal));

        System.out.println("Entrez la date desiree (aaaa/MM/dd): ");
        String date = sc.next();

        while(readEntry.hasNext()){
            String writ = readEntry.next();
            if(writ.equals(date)){
                break;
            }
        }

        readEntry.nextLine();
        String journalWrit = readEntry.nextLine();
        System.out.println();
        System.out.println(purple);
        System.out.println(date);
        System.out.println(reset);
        System.out.println(journalWrit);
        System.out.println();

        menu();

    }

    private static void selfDestruct() throws Exception{
        
        String userJournal = ((uName) + "journal.txt");
        PrintWriter printLine = new PrintWriter(userJournal);

        printLine.print("");
        printLine.close();
        System.out.println("\n");
        menu();
    }
    
    public static final String purple = "\u001B[35m";
    public static final String reset = "\u001B[0m";
    public static final String red = "\u001B[31m";
    public static final String yellow = "\u001B[33m";
    public static final String green = "\u001B[32m";
    public static final String blue = "\u001B[34m";
    

}