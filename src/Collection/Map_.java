package Collection;

import java.util.HashMap;

public class Map_ {

	public static void main(String[] args) {

		//Duplicate keys are not allowed and values are allowed
		
		HashMap hm=new HashMap();
		
		hm.put(101,"Kalidass");
		hm.put(102,"Kali");
		hm.put(103,"Kal");
		hm.put(104,"Kas");
		hm.put(105,"Kd");
		
		System.out.println(hm.get(105));
		hm.remove(105);
		
		
		System.out.println(hm.containsKey(104));
		
		System.out.println(hm.containsValue("Kal"));

		System.out.println(hm.keySet());
		
		System.out.println(hm.values());

		for(Object d :hm.values()) {
			
			System.out.println(d);
			
		}
	}

}
