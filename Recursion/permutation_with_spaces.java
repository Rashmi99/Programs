package recursion;

public class permutation_with_spaces {

	public static void permutations(String ip,String op) {
		op+=ip.charAt(0);
		ip=ip.substring(1);
		solve(ip,op);
	}
	public static void solve(String ip,String op) {
		if(ip.length()==0) {
			System.out.println(op);
			return;
		}
		String op1=op;
		String op2=op;
		op1+="_"+ip.charAt(0);
		op2+=ip.charAt(0);
		ip=ip.substring(1);
		solve(ip,op1);
		solve(ip,op2);
		return;
	}
	public static void main(String[] args) {
		String ip="ABCD";
		String op="";
		System.out.println("The permutations are:");
		permutations(ip,op);

	}

}
