import java.math.BigInteger;

public class Bomb_Baby {
    public static void main(String[] args) {
        String x = solution("4","7"); // test here
        System.out.println(x);
    }

    public static String solution(String x, String y){
        BigInteger m = new BigInteger(x); // mach
        BigInteger f = new BigInteger(y); // facula
        BigInteger total = new BigInteger("0");

        while(m.signum()> 0 && f.signum()>0){ // if they are positive
            if(m.compareTo(BigInteger.ONE)==0 && f.compareTo(BigInteger.ONE)==0) return String.valueOf(total); // if they are both 1
            if(m.compareTo(BigInteger.ONE)==0){
                return f.add((total.subtract(BigInteger.valueOf(1)))).toString();
            }
            if(f.compareTo(BigInteger.ONE)==0) {
                return m.add((total.subtract(BigInteger.valueOf(1)))).toString();
            }
            if(m.equals(f)) return "impossible"; // in this case its impossible to get the result

            else if(f.compareTo(m) > 0){
                total = total.add(f.divide(m)); // add the number of times m fits into f
                f = f.mod(m); // f = the remainder after dividing
            }
            else {
                total = total.add(m.divide(f));
                m = m.mod(f);
            }
        }
        return "impossible"; // if they were both negative then just return impossible
    }

}

