///*******************************************************************
// DoubleList.java
//
// A class that takes an ArrayList<String> and replaces every string
// (element) with two of that same string.
//
// David Barnette
// 4/28/2020
//*******************************************************************

import java.util.ArrayList;

public class doubleList {

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

    public static void doubleList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String copy = list.get(i);
            list.add(i+1, copy);
            i++;
        }
        }

    }

