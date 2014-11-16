package Problem3;

import java.util.HashSet;

/**
 * Created by Magda on 2014-11-16.
 */
public class Problem3 {
    public long PrimeFac(long n){
        if (n<=0) return 0;
        long maxPrimeFac = n;
        HashSet sieve = new HashSet();
        long current = 2;
        while(current <= n/2){
            if( !sieve.contains(current)){
                long cur = current;
                while(cur < n){
                    sieve.add(cur);
                    cur += current;
                }
                if (cur == n) maxPrimeFac = current;
            }
            current++;
        }
        return maxPrimeFac;
    }

    private long[] Sieve(long n) {
        return new long[0];
    }
}
