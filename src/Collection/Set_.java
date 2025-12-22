package Collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.LinkedHashSet;


public class Set_ {
	
	public static void Hash_Set() {
		
		System.out.println();
		System.out.println("##########HashSet#########");
		
		LinkedList<String> ls=new LinkedList<>();
		LinkedList<String> ls1=new LinkedList<>();		

		ls.add("Stuff");
		ls.add("Stuf");
		ls.add("Stu");
		
		ls1.add("Stuff");
		ls1.add("Stuf");
		ls1.add("Stu");

		System.out.println("Lsit1 :"+ls +"and List2 :"+ls1);
		
		HashSet<LinkedList> hs=new HashSet<>();
		
		hs.add(ls);
		hs.add(ls1);
		
		System.out.println("Identical list inside hashset: "+hs);//the value of ls and ls1 are same , so hashset removed duplicate and printed only once
			
		for(LinkedList a:hs) {
			
			System.out.println(a);
			
		}
		
	}
	public static void LinkedHashSet() {
		
		System.out.println();
		System.out.println("##############LinkedHashSet##############");
		LinkedHashSet<Character> lst=new LinkedHashSet<>();	
		
		lst.add('a');
		lst.add('b');
		lst.add('r');
		
		for(Character x:lst) {
			System.out.println(x);
		}


	}
	public static void Tree_Set() {
		
		System.out.println();
		System.out.println("###########TreeSet###########");
		
		TreeSet<String> ts = new TreeSet<>();
		
		LinkedList<String> ls = new LinkedList<>();
		
		ls.add("Ks");
		ls.add("Ks");
		ls.add("Is");
		ls.add("fs");
		
		System.out.println("Linked List is :"+ls);
		
		ts.addAll(ls);
		
		System.out.println("LinkedlistCoverted to tree set :"+ts);

		
	}

	public static void main(String[] args) {

		Hash_Set();
		LinkedHashSet();//same as hash set
		Tree_Set();//stores value in order by default
		}
	

}
