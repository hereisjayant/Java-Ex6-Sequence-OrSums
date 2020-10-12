package orsum;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ORSumTest {

    /* the timeout interval per test is 10 seconds */
    private static int TIMEOUT = 10;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(TIMEOUT);

    private int[] input;
    private int target;
    private boolean answer;

    public ORSumTest(int[] _input, int _target, boolean _answer) {
        input = _input;
        target = _target;
        answer = _answer;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testInstances() {
        int[][] inputs = {
            {1, 2, 4, 8},
            {0},
            {9},
            {},
            {1, 4, 8},
            {16, 1, 4, 8},
            {16, 1, 4, 8},
            {16, 1, 4, 8},
            {0, 17, 4, 18, 200},
        };

        int[] targets = {
            7,
            0,
            9,
            0,
            7,
            11,
            26,
            25,
            19,
        };

        boolean[] answers = {
            true,
            true,
            true,
            true,
            false,
            false,
            false,
            true,
            true,
        };

        Object[][] parameters = new Object[inputs.length][3];
        for (int i = 0; i < inputs.length; i++) {
            parameters[i] = new Object[] {inputs[i], targets[i], answers[i]};
        }
        return Arrays.asList(parameters);
    }

    @Test
    public void test() {
        assertEquals(answer, TargetORSum.isPossible(input, target));
    }

}
