package Problem2;

/**
 * Created by Magda on 2014-11-16.
 */
public class Problem2 {

    public long FibEven( int n ){
        if( n  <= 1 ) return 0;
        if( n  == 2 ) return 2;
        //sum(Fi) = Fn+2 -1
        //sum(Fi) / 2 -> if n=3k then this is value

        Tuple fi = Fibon(n);
        if( fi.getI() % 3 == 0) {
            return ( fi.getFib_prev() + fi.getFib() - 1)/2;
        }
        if( fi.getI() % 3 == 1) {
            return (fi.getFib() - 1)/2;
        }
        return (fi.getFib_prev() -1)/2;
    }

    //retuns greatest Fib(N) such that Fib(N)=<k
    private Tuple Fibon(int k) {
        if( k  < 1 ) return new Tuple(0, 1, 1);
        if( k  == 1 ) return new Tuple(1, 2, 2);
        if( k  == 2 ) return new Tuple(2, 3, 3);

        long fib = 2, fib_prev = 1, tmp;
        int i = 3;
        while( fib <= k ){
            tmp = fib;
            fib += fib_prev;
            fib_prev = tmp;
            i++;
        }
        return new Tuple(fib_prev, fib, i-1);
    }

    private class Tuple {
        private long fib_prev;
        private long fib;
        private int i;

        public Tuple(long fib_prev, long fib, int i) {

            this.fib_prev = fib_prev;
            this.fib = fib;
            this.i = i;
        }

        public long getFib_prev() {
            return fib_prev;
        }

        public int getI() {
            return i;
        }

        public long getFib() {
            return fib;
        }
    }
}
