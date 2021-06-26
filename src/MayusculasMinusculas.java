import java.util.Map;
import java.util.HashMap;

public class MayusculasMinusculas {
    public static void main(String[] args) {
        String letras = "AabDCdc";
        System.out.print(cantCaracteresConMayusculasMinusculas(letras));
    }

    public static int cantCaracteresConMayusculasMinusculas(String letras){
        int cant = 0;
        Map<Character, Integer> mapa = new HashMap<>();
        char[] arr = letras.toCharArray();

        for(int i =0; i < arr.length; i++){
            Character mayuscula = Character.toUpperCase(arr[i]);
            Character minuscula = Character.toLowerCase(arr[i]);

            if(arr[i] == mayuscula && !mapa.containsKey(mayuscula)){
                mapa.put(mayuscula, 1);
            } else if(arr[i] == minuscula && !mapa.containsKey(mayuscula)){
                mapa.put(mayuscula, 2);
            } else if (arr[i] == mayuscula && mapa.containsKey(mayuscula) && mapa.get(mayuscula) == 2){
                mapa.put(mayuscula, 3);
                cant ++;
            } else if (arr[i] == minuscula && mapa.containsKey(mayuscula) && mapa.get(mayuscula) == 1){
                mapa.put(mayuscula, 3);
                cant ++;
            }
        }


        return cant;
    }
}
