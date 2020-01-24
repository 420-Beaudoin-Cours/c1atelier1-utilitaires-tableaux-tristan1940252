import javafx.scene.control.Tab;

public class Main {
    public static void main(String[] args) {
    int[] tab = {5,4,3,2,1,0};
    String[] tableau = {"5","4","3","2","1","0"};
        System.out.println(Tableaux.maximum(tab));
        System.out.println(Tableaux.moyenne(tab));
        System.out.println(Tableaux.fouilleSeq(tab,2));
        System.out.println(Tableaux.fouilleSeq(tableau, "4"));
        System.out.println(Tableaux.moyenne(tableau));
        Tableaux.trierDecroissant(tableau);
        Tableaux.print(tableau);

    }
}
