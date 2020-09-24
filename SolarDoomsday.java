import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolarDoomsday {
    public static void main(String[] args) {
        solution(12);
    }

        public static int[] solution(int area) { // challenge 1
        List<Integer> result = new ArrayList();
        while(area>0){ // continue until its 0
            int t =(int)Math.sqrt(area);
            // the square root of the given area * 2
            t *=t;
            // is always going to be the largest square number that fits inside the bounds
            result.add(t);
            area -=t;
            // negate the number from the original total
        }
        int[] res = new int[result.size()];
        for(int i =0;i<res.length;i++){
            res[i] = result.get(i); // copy over from list
        }
        System.out.println(Arrays.toString(res)); // for testing purpose
        return res;
    }
}
