import java.util.Set;
import java.util.HashSet;

public class ReturnSmallerInteger {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.print(smallerNotPresent(A));
    }

    public static int smallerNotPresent(int[] A){
        Set<Integer> unicos = new HashSet<>();

        for (int i = 0; i < A.length; i++){
            if (A[i] > 0) {
                unicos.add(A[i]);
            }
        }

        if (unicos.isEmpty()){
            return 1;
        }

        for (int j = 1; j <= unicos.size()+1; j++){
            if (!unicos.contains(j)){
               return j;
            }
        }

        return 1;
    }

    /*
    Write a function:

    class Solution { public int solution(int[] A); }

    that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

    Given A = [1, 2, 3], the function should return 4.

    Given A = [−1, −3], the function should return 1.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [−1,000,000..1,000,000].
     */
}
