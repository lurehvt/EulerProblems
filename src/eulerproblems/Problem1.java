package eulerproblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magda on 2014-11-15.
 */
public class Problem1 {
    // Calculate sum of numbers less than n, that are dividable by (at least) one of multipliers
    public int MultSum2(int n, int[] multipliers)
    {
        int sum = 0;
        int[] counts = new int[multipliers.length];

        if( n < 0 ) return 0;
        boolean dividable = false;

        for (int i = 1; i < n ; i++)
        {
            for (int j = 0; j < multipliers.length ; j++) {
                if( multipliers[j] > 0) {
                    counts[j] = (counts[j] + 1) % multipliers[j];
                    if (counts[j] == 0) dividable = true;
                }
            }
            if (dividable) sum += i;
            dividable = false;
        }
        return sum;
    }

    public int MultSum(int n, int[] multipliers)
    {
        int sum = 0;
        if( n < 1 ) return 0;
        if( multipliers.length > 30 ) return -1;

        int[] multipliersFiltered = FilterMultpiliers(multipliers, n);
        //int multLen = multipliersFiltered.length;

        for (int i = 1; i <= Math.pow(2,multipliersFiltered.length)-1; i++) {
            int[] subMult = SubMult(i, multipliersFiltered);
            sum = sum + (int)Math.pow(-1, subMult[0]-1) * SingleSum(n-1, subMult[1]);
        }
        return sum;
    }

    private int[] FilterMultpiliers(int[] multipliers, int n) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < multipliers.length; i++) {
            if (multipliers[i] > 0 && multipliers[i] < n)
                ret.add(multipliers[i]);
        }
        int[] retArr = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            retArr[i] = ret.get(i);
        }
        return retArr;
    }

    private int[] SubMult(int i, int[] multipliers) {
        int binary = i;
        int multi = 1, countMulti = 0;
        int ind = 0;
        while (binary > 0){
            if( (binary & 1) == 1) {
                multi *= multipliers[ind];
                countMulti++;
            }
            ind++;
            binary = binary >> 1;
        }
        return new int[]{ countMulti, multi };
    }

    private int SingleSum( int n, int multiplier)
    {
        int sum = 0;
//        for (int i = 1; i <= n/mult; i++) {
//            sum +=i;
//        }
        if( multiplier > n) return 0;
        sum = n/multiplier * (n/multiplier +1) /2;
        return sum * multiplier;
    }

}
