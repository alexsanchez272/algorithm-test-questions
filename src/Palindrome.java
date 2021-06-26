public class Palindrome {
    public static void main(String[] Args){
        String palindrome = "abaaba";
        String reverse = "";
        char[] arr = palindrome.toCharArray();

        for(int i = arr.length-1; i >= 0; i--){
           reverse += arr[i];
        }

        System.out.println(reverse.equals(palindrome));
    }
}
