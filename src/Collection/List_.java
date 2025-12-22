package Collection;

import java.util.*;

public class List_ {

	public static void Array_List() {


		//List allows duplicate and maintain order
		//add , set, get, remove

		ArrayList <Integer> arr=new ArrayList<>();

		arr.add(1);	arr.add(2);	arr.add(3);	arr.add(8);	arr.add(9);arr.add(0);arr.add(1);		
		System.out.println("Addition  "+arr);

		arr.set(2, 7);
		System.out.println("Set   "+arr);

		System.out.println("Get  "+arr.get(4));

		arr.remove(5);
		System.out.println("Remove  "+arr);

		Collections.sort(arr);

		System.out.println("Ascending "+arr);

		Collections.sort(arr, Collections.reverseOrder());

		System.out.println("Decending "+arr);

		System.out.println("Size of array list "+arr.size());

		System.out.println("List contains 1? "+arr.contains(1));

		System.out.println("Last index of 1 is : "+ arr.lastIndexOf(1));


		for(Integer i:arr) {
			System.out.println(i);
		}


		arr.removeAll(arr);

		System.out.println("Remove All  "+arr);

		System.out.println("Is array listy empty " + arr.isEmpty());

		for(Integer i:arr) {
			System.out.println(i);
		}

	}

	public static void Linked_List() {
		System.out.println();
		System.out.println("Linked List Starts");
		LinkedList<Integer> lst=new LinkedList<>();
		
		lst.add(9);
		lst.add(10);
		
		System.out.println(lst);
		
		lst.clear();
		
		System.out.println(lst);

	}
	public static void main(String[] args) {
		Array_List();
		Linked_List();//same as array list front end wise
	}

}
