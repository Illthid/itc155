//*******************************************************************
// DoubleList.java
//
// A class that takes an ArrayList<String> and replaces every string
// (element) with two of that same string. Includes a jUnit test.
// 
// David Barnette
// 4/262020
//*******************************************************************

import java.util.ArrayList;

public class DoubleList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
    
		list.add("how");
		list.add("are");
		list.add("you?");

		System.out.println("Before doubling elements:\n" + list);
		System.out.println();
		doubleList(list);
		System.out.println("After doubling elements:\n" + list);
	}

	public static void doubleList(ArrayList<String> name) {
		int arraySize = name.size();
		
		for (int i = 0; i < arraySize; i++) {
			name.add(i * 2 + 1, name.get(i * 2));
		}

	}
	
