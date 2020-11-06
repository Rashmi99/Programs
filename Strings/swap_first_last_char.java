package strings;

public class swap_first_last_char {

	public static String swap_letters(String s) {
		return s.charAt(s.length()-1)+s.substring(1,s.length()-1)+s.charAt(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a sentence";
		System.out.println("after swapping: "+swap_letters(s));
	}

}
