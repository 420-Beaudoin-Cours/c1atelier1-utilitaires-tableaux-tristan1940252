/**
 * @author France Beaudoin
 */
public class Tableaux {
    private static void permute(int[] tab, int i1, int i2) {
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2) {
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab) {
        int imin;
        for (int i = 0; i < tab.length - 1; i++) {
            imin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierDecroissant(int[] tab) {
        int imax;
        for (int i = 0; i < tab.length - 1; i++) {
            imax = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] > tab[imax])
                    imax = j;
            }
            if (imax != i)
                permute(tab, i, imax);
        }
    }

    public static void print(int[] tab) {
        for (int elem : tab) {
            System.out.println(elem);
        }
    }

    public static int maximum(int[] tab) {
        int imax = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[imax] < tab[i]) {
                imax = i;
            }
        }
        return tab[imax];}

    public static int minimum (int[] tab){
        int imin = 0;
        for (int i = 0; i < tab.length; i++){
            if (tab[imin] > tab[i])
                imin = i;
        }
        return tab[imin];}

    public static int moyenne(int[] tab){
        int moyenne = 0;
        for (int elem = 0; elem < tab.length; elem++) {
            moyenne += tab[elem];
        }
        moyenne /= tab.length;
        return moyenne;}

    public static int fouilleSeq(int[] tab, int chercher){
        int indice = 0;
        while (tab[indice] != chercher && indice < tab.length){
            indice++;
        }
        if (indice == tab.length)
            indice = -1;
        return indice;
    }

    public static void trierDecroissant(String[] tab) {
        int imax;
        for (int i = 0; i < tab.length - 1; i++) {
            imax = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (Integer.parseInt(tab[j]) > Integer.parseInt(tab[imax]))
                    imax = j;
            }
            if (imax != i)
                permute(tab, i, imax);
        }
    }

    public static void print(String [] tab) {
        for (String elem : tab) {
            System.out.println(elem);
        }
    }

    public static int maximum(String[] tab) {
        int imax = 0;
        for (int i = 0; i < tab.length; i++) {
            if (Integer.parseInt(tab[i]) > Integer.parseInt(tab[imax])) {
                imax = i;
            }
        }
    return Integer.parseInt(tab[imax]);}

    public static int minimum (String[] tab){
        int imin = 0;
        for (int i = 0; i < tab.length; i++){
            if (Integer.parseInt(tab[i]) < Integer.parseInt(tab[imin]))
                imin = i;
        }
    return Integer.parseInt(tab[imin]);}

    public static int moyenne(String[] tab){
        int moyenne = 0;
        for (int elem = 0; elem < tab.length; elem++) {
            moyenne += Integer.parseInt(tab[elem]);
        }
        moyenne /= tab.length;
    return moyenne;}

    public static int fouilleSeq(String[] tab, String chercher){
        int indice = 0;
        while (!tab[indice].equals(chercher) && indice < tab.length){
                indice++;
        }
        if (indice == tab.length)
            indice = -1;
        return indice;
    }
}

