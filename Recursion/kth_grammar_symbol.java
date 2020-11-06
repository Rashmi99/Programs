package recursion;

public class kth_grammar_symbol {
	
	public static Boolean solve(int n,int k) {
		if(n==1 && k==1)return false;
		int mid=(int)Math.pow(2, n-1)/2;
		if(k<=mid)return solve(n-1,k);
		else return !solve(n-1,k-mid);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int k=4;
		if(solve(n,k))System.out.print(1);
		else System.out.print(0);
	}

}
