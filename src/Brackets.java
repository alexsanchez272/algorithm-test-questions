import java.util.Stack;

public class Brackets {

    public static void main(String[] Args) {
        String brackets = "{[(])]}";
        System.out.print(bracketsComparator(brackets));

    }

    public static Boolean bracketsComparator(String S) {
        Stack<Character> pila = new Stack<Character>();

        for (int i = 0; i < S.length(); i++) {
            Character caracter = S.charAt(i);
            if (caracter == '{' || caracter == '[' || caracter == '(') {
                pila.push(S.charAt(i));
            } else if (caracter.equals('}')) {
                if (!pila.pop().equals('{')) {
                    return false;
                }
            } else if (caracter.equals(']')) {
                if (!pila.pop() .equals('[')) {
                    return false;
                }
            } else if (caracter.equals(')')) {
                if (!pila.pop().equals('(')) {
                    return false;
                }
            }
        }

        if (pila.isEmpty()){
            return true;
        }
        return false;
    }
}
