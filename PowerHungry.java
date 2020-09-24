import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerHungry{
    public static void main(String[] args) {
        solution(new int[] {0, 0, 0,0,0});
    }

    public static String solution(int[] xs) {
        if(xs.length == 1){
            return String.valueOf(xs[0]);
        }
        Arrays.sort(xs);
        int start = 0;
        if(xs[start] == 0){
            while(xs[start] == 0){
                start++;
                if(start == xs.length){
                    System.out.println("here 2");
                    return "0";
                }
            }
        }
        BigInteger result = new BigInteger(Integer.toString(xs[start]));

        int largestN = xs[start];
        for(int i =start+1;i<xs.length;i++) {
            if(xs[i] != 0) {
                if(xs[i] < 0){
                    largestN = Math.max(xs[i],largestN);
                }
                BigInteger temp = new BigInteger(Integer.toString(xs[i]));
                result = result.multiply(temp);
            }
        }
        if(largestN < 0 && result.compareTo(BigInteger.valueOf(largestN)) == 0){
            System.out.println("here 1");
            return "0";
        }
        if(result.signum() == -1){ // divide by largest negative
            BigInteger temp = new BigInteger(String.valueOf(largestN));
            result = result.divide(temp);
        }
        System.out.println(result.toString());
        return result.toString();
    }
}

