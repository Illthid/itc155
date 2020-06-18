import static org.junit.Assert.assertTrue;
import java.util.*;

//Write a method hasTwoConsecutive that returns whether or not a list of
//integers has two adjacent numbers that are consecutive integers 
//(true if such a pair exists and false otherwise). For example, if a 
//variable list stores the following sequence of values, then the call 
//list.hasTwoConsecutive() should return true because the list contains the adjacent 
//numbers (7, 8) which are a pair of consecutive numbers: [1, 18, 2, 7, 8, 39, 18, 40]
//If the list had stored the following sequence of values, then the method should return 
//false: [1, 18, 17, 2, 7, 39, 18, 40, 8] This sequence contains some pairs of numbers that 
//could represent consecutive integers (e.g., 1 and 2, 7 and 8, 39 and 40), but those pairs 
//of numbers are not adjacent in the sequence. The list also has a pair of adjacent numbers
//(18, 17) that are not in the right order to be considered consecutive. You may not make 
//any assumptions about how many elements are in the list.
//Assume that you are adding this method to the LinkedIntList class as defined below:


}
class listNode{
    int data;
    listNode next;
}

public class hasTwoConsecutive {
    listNode first;
    public boolean hasTwoConsecutive() {
        if(first == null) {
            return false;
        }
        listNode prev = first;
        listNode current = prev.next;

        while(current != null) {
            if(prev.data + 1 == current.data) {
                return true;
            }
            prev = current;
            current = prev.next;
        }
        return false;
    }
    public void insertInt(int data) {
        listNode node=new listNode();
        node.data=data;
        node.next=null;

        if(first==null) {
            first=node;
        }
        else {
            listNode n=first;
            while(n.next!=null) {
                n=n.next;
            }
            n.next=node;
        }
    }
    public void insertStart(int data){
        listNode node=new listNode();
        node.data=data;
        node.next=null;
        node.next=first;
        first = node;
    }
    public void insertSpecific(int index, int data) {
        listNode node=new listNode();
        node.data=data;
        node.next=null;
        if(index==0) {
            insertStart(data);
        }
        else {
            listNode n = first;
            for(int i=0;i<index;i++) {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    }
    public void deleteSpecific(int index) {
        if(index==0) {
            first=first.next;
        }
        else {
            listNode n = first;
            listNode nn = null;
            for (int i=0;i<index;i++) {
                n=n.next;
            }
            nn=n.next;
            n.next=nn.next;
        }
    }
    public void show() {
        listNode node = first;
        while (node.next!=null) {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}

