//*******************************************************************
// DoubleListTest.java
//
// A jUnit test for the doubleList method.
// 
//David Barnette
// 4/27/2020
//*******************************************************************

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class DoubleListTest extends DoubleList {

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
