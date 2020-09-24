import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolarDoomsday {
    public static void main(String[] args) {
        solution(12);
    }

        public static int[] solution(int area) { // challenge 1
        List<Integer> result = new ArrayList();
        while(area>0){
            int t =(int)Math.sqrt(area);
            t *=t;
            result.add(t);
            area -=t;
        }
        int[] res = new int[result.size()];
        for(int i =0;i<res.length;i++){
            res[i] = result.get(i);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
