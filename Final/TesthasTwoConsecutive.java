import static org.junit.Assert.*;
import org.junit.Test;

class LinkedIntListJunitTest {

	@Test
	void testFullTrue() {

		LinkedIntList list = new LinkedIntList();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);

		assertTrue(list.hasTwoConsecutive());
	}

	@Test
	void testFalse() {

		LinkedIntList list = new LinkedIntList();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);

		assertFalse(list.hasTwoConsecutive());
	}
}
