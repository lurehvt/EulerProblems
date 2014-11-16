package Problem2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem2Test {

    @Test
    public void testFibEven(){
        Problem2 problem2 = new Problem2();
        int[][] testCases = new int[][]{
                {5, 2 },
                {4, 2 },
                {6, 2 },
                {8, 2 + 8},
                {34, 2 + 8 + 34},
                {4* (int)Math.pow(10,6), 4613732},

        };

        for (int[] testCase : testCases) {
            assertEquals("For number " + testCase[0] + " expected sum " + testCase[1], testCase[1], problem2.FibEven(testCase[0]));
        }
    }
}