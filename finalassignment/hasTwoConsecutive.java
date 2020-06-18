/***************************************************************************
 * ITC155 - Final - Problem 2
 * BJP5 Exercise 16.6: Method hasTwoConsecutive 
 * FIRST METHOD defined after constructor in LinkedIntList.java
 */
public class ConsecutiveClient {

	public static void main(String[] args) {

		LinkedIntList list1 = new LinkedIntList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		System.out.println("");
		System.out.println("Original list sequence" + list1);
		System.out.println("Method hasTwoConsecutive Test: >>> " + list1.hasTwoConsecutive());
		System.out.println();

		list1.add(12);
		list1.add(2);
		list1.set(1, 3);

		System.out.println("The List has been modified >>> " + list1);
		System.out.println("Method hasTwoConsecutive Test: >>> " + list1.hasTwoConsecutive());
	}

}
