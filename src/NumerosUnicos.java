import java.util.*;

public class NumerosUnicos {
    public static void main(String[] Args){
        int[] numeros = {1,1,2,3,4,2,3,5};
        Set<Integer> unicos = new HashSet<>();

        for (int i = 0; i < numeros.length; i++){
            unicos.add(numeros[i]);
        }

        System.out.print(unicos.size());

    }


}
