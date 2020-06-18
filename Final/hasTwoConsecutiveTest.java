import static org.junit.Assert.*;
import org.junit.Test;

class hasTwoConsecutiveTest {

	@Test
	void test() {
		hasTwoConsecutive list1=new hasTwoConsecutive();
		list1.insertInt(18);
		list1.insertStart(1);
		list1.insertSpecific(3, 2);	
		list1.insertInt(7);
		list1.insertInt(39);
		
		
		Assertions.assertEquals(true, list1.hasTwoConsecutive());
		
	
	}

}
