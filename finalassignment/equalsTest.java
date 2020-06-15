import java.util.Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Final1Test {

	@Test
	public void equalTest() {
		Stack<Integer> num1 = new Stack<Integer>();
		num1.add(21);
		num1.add(34);
		num1.add(99);
		num1.add(2);
		 
		Stack<Integer> num2 = new Stack<Integer>();
		num2.add(21);
		num2.add(34);
		num2.add(99);
		num2.add(2);
		 
		Assertions.assertEquals(true, Final1.equals(num1,num2));
	}
}
