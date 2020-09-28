import java.math.BigInteger;

public class Fuel_Injection {
    // Fuel Injection Perfection
    // Google Foobar LVL 3

    public static void main(String[] args) {
        int x = solution("2");
        System.out.println(x);
    }


    public static int solution(String x) {
        BigInteger y = new BigInteger(x);
        int total = 0;

        while(y.compareTo(BigInteger.ONE) > 0){
            if(y.and(BigInteger.valueOf(1)).equals(BigInteger.ZERO)){
                while(y.compareTo(BigInteger.valueOf(1)) > 0 && y.and(BigInteger.valueOf(1)).equals(BigInteger.ZERO)){
                    y = y.shiftRight(1);
                    total++;
                }
            }else{
                total++;
                BigInteger temp = y.add(BigInteger.valueOf(1)).sqrt();
                if(temp.and(BigInteger.valueOf(1)).equals(BigInteger.ZERO)){
                    y = y.add(BigInteger.valueOf(1));
                }else{
                    y = y.subtract(BigInteger.valueOf(1));
                }
            }
        }
    // Your code here
        return total;
    }
}

