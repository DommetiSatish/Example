package com.New;

import java.util.HashMap;
import java.util.Map;

public class Collection {

	public static void main(String[] args) {

		
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(13, "Satish");
		hm.put(15, "kumar");
		hm.put(17, "dommeti");
		hm.put(10, "prasad");
		hm.put(16, "Simple");
		//hm.putAll(hm);
		 for(Map.Entry m:hm.entrySet())  {
			 System.out.println(m.getKey()+" "+m.getValue());	
		}
		 hm.replace(26, "Simple", "pranay");
		 for(Map.Entry m:hm.entrySet())  {
			 System.out.println(m.getKey()+" "+m.getValue());
		 }
		 hm.remove(26);
		 for(Map.Entry m:hm.entrySet())  {
			 System.out.println(m.getKey()+" "+m.getValue());
	}
		 hm.remove(17);
		 for(Map.Entry m:hm.entrySet())  {
			 System.out.println(m.getKey()+" "+m.getValue());
			 
	}
	}

}
