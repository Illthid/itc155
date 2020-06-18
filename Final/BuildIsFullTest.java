import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuildIsFullTest {

        @Test
        void test() {
            buildIsFull test = new buildIsFull();
            buildIsFullNode testNode = null;

            testNode = test.insert(testNode, 1);
            testNode = test.insert(testNode, 3);
            testNode = test.insert(testNode, 5);
            testNode = test.insert(testNode, 7);
            testNode = test.insert(testNode, 9);

            Assertions.assertEquals(true, buildIsFull.isFull(testNode));
        }

    }
}
