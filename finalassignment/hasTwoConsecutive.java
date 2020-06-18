/***************************************************************************
 * ITC155 - Final - Problem 2
 * BJP5 Exercise 16.6: Method hasTwoConsecutive 
 * FIRST METHOD defined after constructor in LinkedIntList.java
 */
public class Consecutive_Client {

	public static void main(String[] args) {

		LinkedIntList list1 = new LinkedIntList();
		list1.add(3);
		list1.add(6);
		list1.add(9);
		list1.add(12);

		System.out.println("");
		System.out.println("Original list sequence" + list1);
		System.out.println("Method hasTwoConsecutive Test: >>> " + list1.hasTwoConsecutive());
		System.out.println();

		list1.add(15);
		list1.add(5);
		list1.set(3, 7);

		System.out.println("The List has been modified >>> " + list1);
		System.out.println("Method hasTwoConsecutive Test: >>> " + list1.hasTwoConsecutive());
	}

}
