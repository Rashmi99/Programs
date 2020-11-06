package strings;
//space =O(1)(only extra string declared), time=O(n);
public class remove_duplicates_indexof {

	public static String remove_duplicates(String s) {
		String ns=new String();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			//System.out.print(s.indexOf(c));
			if(ns.indexOf(c)<0) { 
				ns+=c;
				//System.out.println(x);
			}
		}
		return ns;
	}
	public static void main(String[] args) {
		String s="hello this is a bot";
		System.out.println(remove_duplicates(s));

	}

}
