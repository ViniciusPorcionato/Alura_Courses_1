import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> listaInt = new ArrayList<>();
        listaInt.add(5);
        listaInt.add(10);
        listaInt.add(15);
        listaInt.add(20);
        listaInt.add(25);
        Collections.sort(listaInt);
        System.out.println(listaInt);
    }
}
