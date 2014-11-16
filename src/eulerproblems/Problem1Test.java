package eulerproblems;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test {

    @Test
    public void testMultSum_simple(){
        Problem1 problem1 = new Problem1();
        assertEquals( 2+3+4, problem1.MultSum(5, new int[]{2,3}) );
        assertEquals( 2+3+4, problem1.MultSum(5, new int[]{2,3, 0, 150}) );
        assertEquals( 0, problem1.MultSum(0, new int[]{2,3, 5, 6}) );
        assertEquals( 0, problem1.MultSum(2, new int[]{2,3}) );
        assertEquals( 0, problem1.MultSum(123, new int[]{123}) );
        assertEquals( 2+3+4+5+6+8+9+10+12+14+15+16, problem1.MultSum(17, new int[]{2,3,5}) );
    }

    @Test
    public void testMultSum(){
        Problem1 problem1 = new Problem1();
        assertEquals( 333167, problem1.MultSum(1000, new int[]{2,3}) );
        assertEquals( 233168, problem1.MultSum(1000, new int[]{5,3}) );
    }

}