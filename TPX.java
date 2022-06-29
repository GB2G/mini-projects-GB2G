import java.util.Scanner;

public class TPx {
    public static int L = 0;
    public static int H = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre de rangées: ");
        H = sc.nextInt();

        System.out.print("Entrez un nombre de colonnes: ");
        L = sc.nextInt();
        
        int pixels[] = new int[L*H];

        for (int i = 0; i < pixels.length; i++ )
        {
            pixels[i] = (int)(Math.random()*256);
        }

        System.out.printf("%6s", "");
        for (int i = 0; i < L; i++)
        {
            System.out.printf("%6d", i);
        }

        for (int i = 0; i < pixels.length; i++ )
        {
            if ( i % L == 0 ){
                System.out.println();
                System.out.printf("%6s", i/L + " | ");
            } 
            System.out.printf("%6d", pixels[i]);
        }

        System.out.print("\nEntrez une colonne (1, "+ L + "): ");
        int x = sc.nextInt();

        System.out.print("\nEntrez une rangee(1, "+ H +"): ");
        int y = sc.nextInt();

        int index = x + (y*L);
        System.out.println(pixels[index]);
        
        /*
        for (int y = 0; y < H; y++){
            System.out.print(y + " | ");
            for (int x = 0; x < L; x++){
                int p = x + (y * L);          
                System.out.printf("%6d", pixels[p]);
            }
            System.out.println();
        }
        */
    }
}
