package Problem3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem3Test {

    @Test
    public void testPrimeFac() {
        Problem3 problem3 = new Problem3();
        long[][] testCases = new long[][]{
                {5, 5 },
                {4, 2 },
                {6, 3 },
                {8, 2},
                {34, 17},
                {33, 11},
                {17, 17},
                {1, 1},
                {2,2},
                {3,3},
                {0,0}
//                {600851475143l, 4613732},

        };

        for (long[] testCase : testCases) {
            assertEquals("For number " + testCase[0] + " expected prime factor " + testCase[1], testCase[1], problem3.PrimeFac(testCase[0]));
        }
    }
}