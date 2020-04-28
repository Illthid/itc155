/* 
*************************************************
* jUnit test for removeEvenLength.java
*
*David Barnette
*4/28/2020
*************************************************
*/

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.Test;

class removeEvenLengthTest extends removeEvenLength{
    @Test
    public void testRemoveEvenLength() {
        ArrayList<String> testlist = new ArrayList<String>();
        testlist.add("walk");
        testlist.add("talk");
        testlist.add("speak");
        testlist.add("run");
        testlist.add("falling");
        testlist.add("scream");
        assertEquals(testlist.size(), 6);

        ArrayList<String> testlist2 = new ArrayList<String>();
        testlist2.add("walking");
        testlist2.add("talking");
        testlist2.add("speaking");

        removeEvenLength(testlist);
        assertEquals(testlist,testlist2);


        }
    }
