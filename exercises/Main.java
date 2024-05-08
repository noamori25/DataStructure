package exercises;

import com.codewithmosh.Array;
import netscape.javascript.JSObject;

import java.util.Arrays;

public class Main {
    public static void main(String[] names) {
//        System.out.println('Array class');
//        ArrayOfItems myArray = new ArrayOfItems(4);
//        myArray.insert(10);
//        myArray.insert(20);
//        myArray.insert(30);
//        myArray.insert(40);
//        myArray.insert(50);
//        myArray.insert(60);
//        myArray.removeAt(2);
//        myArray.printArray();
//        System.out.println("index of 40: " + myArray.indexOf(40));
//        System.out.println("max number: " + myArray.max());
//        ArrayOfItems arrayToCompare = new ArrayOfItems(5);
//        arrayToCompare.insert(10);
//        arrayToCompare.insert(10);
//        arrayToCompare.insert(3);
//        arrayToCompare.insert(50);
//        arrayToCompare.insert(60);
//        ArrayOfItems commonItems = myArray.intersect(arrayToCompare);
//        commonItems.printArray();
//        ArrayOfItems reversedItems = myArray.reverse();
//        reversedItems.printArray();
//        myArray.printArray();
//        myArray.insertAt(4, 100);
//        myArray.printArray();

        System.out.println("LinkedList class");
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addFirst(0);
        list.addLast(4);
//        list.deleteFirst();
//        list.deleteLast();
        System.out.println(list);
        list.reversing();
        System.out.println(list);

    }
}
