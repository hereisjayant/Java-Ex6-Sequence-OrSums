package sequences;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SequenceTest {

    /* the timeout interval per test is 1 second */
    private static int TIMEOUT = 1;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(TIMEOUT);

    private int input;
    private long answer;

    public SequenceTest(int _input, long _answer)
        throws IllegalArgumentException, InstantiationException {
        input = _input;
        answer = _answer;
    }

    @Test
    public void test() {
        assertEquals(answer, DoubleSixSquareSequence.get(input));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testInstances() {
        int[] inputs = {
            0,
            1,
            2,
            3,
            8,
            12,
            19,
            20,
            1000,
            10000
        };

        long[] expOuts = {
            1,
            2,
            3,
            5,
            12,
            21,
            36,
            37,
            12853,
            534420
        };

        Object[][] parameters = new Object[inputs.length][2];
        for (int i = 0; i < inputs.length; i++) {
            parameters[i] = new Object[]{inputs[i], expOuts[i]};
        }
        return Arrays.asList(parameters);
    }
}
