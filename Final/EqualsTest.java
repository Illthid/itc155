import java.util.Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class equalsTest {

	@Test
	public void test() {
		Stack<Integer> num1 = new Stack<Integer>();
		num1.add(10);
		num1.add(11);
		num1.add(12);
		num1.add(13);
		 
		Stack<Integer> num2 = new Stack<Integer>();
		num2.add(13);
		num2.add(12);
		num2.add(11);
		num2.add(10);
		 
		Assertions.assertEquals(true, Final1.equals(num1,num2));
	}

}
