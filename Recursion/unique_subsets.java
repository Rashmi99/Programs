package recursion;

import java.util.ArrayList;
import java.util.HashSet;
//same as before, just add elements to hashSet-> it doesn't allow duplicates
public class unique_subsets {
	HashSet<String> h=new HashSet<>();
	public void print_subsets(String ip,String op) {
		if(ip.length()==0) {
			h.add(op);
			//System.out.print(op+" ");
			return;
		}
		String op1=op;
		String op2=op;
		op2+=ip.charAt(0);
		ip=ip.substring(1);
		
		print_subsets(ip,op1);
		print_subsets(ip,op2);
		return;
	}
	public static void main(String[] args) {

		unique_subsets u=new unique_subsets();
		String ip="aabb";
		String op="";
		
		u.print_subsets(ip,op);
		//u.h.stream().sorted();
			
		ArrayList<String> a=new ArrayList<>();
		System.out.println("Normal order");
		for(String s:u.h) {
			a.add(s);
			System.out.println(s);
		}
		a.sort(null);
		System.out.println("Lexicographic order");
		System.out.println(a);
		/*Iterator<String> i = u.h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); */
		
		}

}
