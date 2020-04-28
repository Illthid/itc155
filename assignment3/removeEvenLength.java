/*
*********************************************************************************
* Write a method called 'removeEvenLength' that takes an 'ArrayLIst' of strings as a parameter and removes
* all the strings of even length from the list.
*
* David Barnette
* 4/28/2020
* *******************************************************************************
 */

import java.util.ArrayList;

public class removeEvenLength {

        public static void main(String[] args) {

            ArrayList<String> list = new ArrayList<>();
            list.add("walk");
            list.add("talk");
            list.add("speak");
            list.add("run");
            list.add("falling");
            list.add("scream");

            removeEvenLength(list);
            System.out.println(list);


        }

        public static void removeEvenLength(ArrayList<String> list) {

            for (int i = 0; i < list.size(); i++) {
                String word = list.get(i);
                if (word.length() % 2 == 0) {
                    list.remove(i);
                    i--;
                }
            }

        }

    }

