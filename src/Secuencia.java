public class Secuencia {


    public static void main(String[] args) {
       solution(29);
    }

    public static int solution(int N){
        if(N == 0 || N == 1){
            return N;
        }else if (N > 25){
            N = N%25+1;
        }

        int a = 0;
        int b= 1;
        System.out.print(a);
        for (int i = 2; i <= N; i++){
            System.out.print(","+b);
            b = sumaDisgitos(b);
            int temp = a+b;
            if (N == i){
                return temp;
            }else {
                a = b;
                b = temp;
            }
        }
        System.out.print("....");
        return N;
    }


    public static int sumaDisgitos(int num){
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;

    }
}

//1,1,2,3,5,8,13,12,7,10,8,9,17,17,16,15,13,10,5,6,11,8,10,9
//10,10,2,3,5,8,13,12,7,10,8,9,17,17,16,15,13,10,5,6,11,8,10,9
//10,10,2,3,5,8,13,12,7,10,8,9,17,17,16,15,13,10,5,6,11,8,10,9

