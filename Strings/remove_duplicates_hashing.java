package strings;

import java.util.HashSet;

public class remove_duplicates_hashing {
	
	public static void remove_duplicates(String s) {
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(char c:set)
			System.out.print(c);
		
		
		
	}
	public static void main(String[] args) {
		String s="hiii wasssupp";
		remove_duplicates(s);

	}

}
