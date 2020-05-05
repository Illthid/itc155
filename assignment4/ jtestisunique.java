import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class assignment4Test {

	@Test
	public void testIsUnique() {
		assignment4 tester = new assignment4();
		Map<String, String> mainMap = new HashMap<String, String>();
		Map<String, String> mainMap2 = new HashMap<String, String>();
		mainMap.put("Marty", "Stepp");
		mainMap.put("Stuart", "Reges");
		mainMap.put("Jessica", "Miller");
		mainMap.put("Amanda", "Camp");
		mainMap.put("Chelsea", "Jansen");
		
		//Separate HasMap that should come out false
		mainMap2.put("Marty", "Stepp");
		mainMap2.put("Stuart", "Reges");
		mainMap2.put("Charolette", "Jansen");
		mainMap2.put("Jessica", "Miller");
		mainMap2.put("Amanda", "Camp");
		mainMap2.put("Chelsea", "Jansen");
		
		//making sure something is being produced
		assertNotNull(tester.isUnique(mainMap));
		//making sure that the first hashmap comes out true
		assertEquals(true, tester.isUnique(mainMap));
		//making sure that the first hashmap comes out false
		assertEquals(false, tester.isUnique(mainMap2));
		
		
	}

}
