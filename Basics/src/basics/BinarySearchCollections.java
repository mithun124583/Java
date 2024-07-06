package basics;
// Java Program to Demonstrate Working of binarySearch()
// method of Collections class
// Importing required classes
import java.util.List; 
import java.util.ArrayList; 
import java.util.Collections;

public class BinarySearchCollections {
            //main driver method
	public static void main(String[] args) {
		// Creating an empty ArrayList of integer type
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(22);
		al.add(45);
		al.add(57);
		al.add(98);
		
		int key = 57;
		int res = Collections.binarySearch(al, key);
		if(res >= 0){
			System.out.println(key + " found at index: "+res);
		} else {
			System.out.println(key + " not found");
		}
	}
}
