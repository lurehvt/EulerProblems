package Problem3; /**
 * Created by Magda on 2014-11-17.
 */
import java.util.ArrayList;

public class Problem4 {
    public long Pali(int k){
        long max = 0;
        long cur;
        int[] nums = new int[]{1,1};
        for (int i = (int)Math.pow(10, k-1); i < Math.pow(10, k); i++) {
            for (int j = (int)Math.pow(10, k-1); j <= i; j++) {
                cur = i * j;
                if( IsPalind(cur)) { max = cur; nums = new int[]{i,j}; }
            }
        }
        System.out.println(max);
        System.out.println(nums[0] + " " + nums[1]);
        return max;
    }

    protected boolean IsPalind(long num) {
        ArrayList dec = new ArrayList();
        long cur = num;
        while(cur >= 0){
            dec.add(cur % 10);
            if( cur < 10 ) break;
            cur /= 10;
        }
        for (int i = 0; i < dec.size()/2; i++) {
            if( dec.get(i) != dec.get(dec.size()-1 - i))
                return false;
        }
        return true;
    }

    public long Pali2(int k) {
        long max = 0;

        return  max;
    }

}


