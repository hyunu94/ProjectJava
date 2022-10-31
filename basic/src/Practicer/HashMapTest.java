package Practicer;

import java.util.*;
public class HashMapTest {
	public static void main(String[] args) {
		HashMap <String , String> map = new HashMap<>();
		map.put("boy","소년");
		map.put("girl","소녀");
		map.put("school","학교");
		
		Iterator<String> str = map.keySet().iterator();
		while(str.hasNext()) {
			String key = str.next();
			String value = map.get(key);
			//System.out.println(str.next() + "=>" + map.get(str));
			
			System.out.println(key + "=>" + value);
		}

	}

}
