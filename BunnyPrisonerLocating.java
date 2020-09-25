
public class BunnyPrisonerLocating {
    public static void main(String[] args) {
        long x= 300;
        long y = 2;
        String r = solution(x,y);
        System.out.print(r);
    }

    public static String solution(long x, long y) {
            long result = (x+y-1)*(x+y-2); // derived equation
            result /= 2;
            result += x;
        return String.valueOf(result);
    }

}
