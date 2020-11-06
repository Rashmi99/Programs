package recursion;
//prints dictinct permutations
//considering boolean array->for distinct(initially dont use)
public class string_permutation {

	public static void print_permu(String ip,String op) {
		if(ip.length()==0) {
			System.out.print(op+" ");
			return;
		}
		boolean alpha[]=new boolean[26];
		for(int i=0;i<ip.length();i++) {
			char ch=ip.charAt(i);
			String res=ip.substring(0,i)+ip.substring(i+1);
			System.out.println(res);
			System.out.println(op);
			if(alpha[ch-'a']==false)
				print_permu(res,op+ch);
			alpha[ch-'a']=true;
		}
	}
	public static void main(String[] args) {
		String ip="abc";
		print_permu(ip,"");

	}

}
