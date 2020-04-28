/* *********************************************************
doubleListTest.java
A jUnit test for doubleList method.

David Barnette
4/28/2020
************************************************************
*/

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class doubleListTest extends doubleList{
    @Test
    void test() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("how");
        list.add("are");
        list.add("you?");

        ArrayList<String> newList = new ArrayList<String>();
        newList.add("how");
        newList.add("how");
        newList.add("are");
        newList.add("are");
        newList.add("you?");
        newList.add("you?");

        doubleList(list);

        assertEquals(list, newList);

    }

}
