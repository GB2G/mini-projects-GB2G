public class tableau {
    public static void main(String[] args) {
        int L = 4, H = 2;
        int[] tableauDePixels = new int[ L * H ]; // taille = L * H
       
        for (int i = 0; i < L * H; i++ ) {
             tableauDePixels[i] = i; // chaque valeur est aussi l'indice
             System.out.println(tableauDePixels[i]);
        }
    }
}
