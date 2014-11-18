package Problem3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem4Test {

    @Test
    public void testPali() {
        Problem4 test3 = new Problem4();
        long[][] testCases = {
                {2, 9009},
                {1, 9},
                {0, 0},
                {3, 580085},
                //{4, 99000099},
                //{5, 9900000099l}
        };
        for (long[] testCase: testCases){
            assertEquals( testCase[1], test3.Pali((int)testCase[0]) );
        }
    }

    @Test
    public void testIsPali() {
        Problem4 test3 = new Problem4();
        long[] testCases = {
                 9009,
                9,
                0,
                 90909,
                1234321,
                1221,
                1111,
                11111111,
        };
        long[] testCasesWrong = {
                90091,
                92,
                10,
                490909,
                122321,
                123421,
                11112,
                11113111,
        };
        for (long testCase: testCases){
            assertEquals( "Input " + testCase, true, test3.IsPalind( testCase) );
        }
        for (long testCase: testCasesWrong){
            assertEquals( "Input " + testCase, false, test3.IsPalind( testCase) );
        }
    }


}