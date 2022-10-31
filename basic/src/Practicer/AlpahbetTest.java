package Practicer;

import java.util.*;

public class AlpahbetTest {
	public static void main(String[] args) {
		ArrayList<Character> arr = new ArrayList<>();
		char ch = 'A';
		
		for(int i=0;i<26;i++) {
			arr.add((char)(ch+i));
		}
		
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i) + " ");
		}
		
		
		for(Character cha : arr) {
			System.out.print(cha + " ");
		}
		
		HashMap <Integer , Character> map = new HashMap<>();
		
		for(int i=0;i<26;i++) {
			map.put(i , (char)(ch+i));
		}
		
		Iterator <Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			char value = map.get(key);
			System.out.print(value);
		}
		
		for(int i=0;i<map.size();i++) {
			System.out.print(map.get(i));
		}
		
		HashSet <Character> set = new HashSet<>();
		for(int i=0;i<26;i++){
			set.add((char)(ch+i));
		}
		
		Iterator <Character> iter2 = set.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}

	}

}
