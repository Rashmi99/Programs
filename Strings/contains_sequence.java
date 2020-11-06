package strings;

public class contains_sequence {

	public static int find_matches(String s1,String s2) {
		String max="";
		String min="";
		int count=0;
		if(s1.length()>s2.length()) {max=s1;min=s2;}
		else {max=s2;min=s1;}
		for(int i=0;i<max.length();i++) {
			int ndx=min.indexOf(max.substring(i,i+1));
			if(ndx!=-1) {
				count++;
				max=max.substring(ndx-1);
				System.out.println(max);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABCDEFG";
		String s2="BFGA";
		System.out.println("No of matches is "+find_matches(s1,s2));
	}

}
