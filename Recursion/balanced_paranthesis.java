package recursion;

import java.util.ArrayList;

public class balanced_paranthesis {
	
	public ArrayList<String> generate_paranthesis(int n){	
		ArrayList<String> a=new ArrayList<>();
		int open=n;
		int close=n;
		String op="";
		solve(open,close,op,a);
		return a;
	}
	public void solve(int open,int close,String op,ArrayList<String> a) {
		if(open==0 && close==0) {
			a.add(op);
			return;
		}
		if(open!=0) {
			String op1=op;
			op1+='(';
			solve(open-1,close,op1,a);
		}
		if(close>open) {
			String op2=op;
			op2+=')';
			solve(open,close-1,op2,a);
		}
		return;
	}
	public static void main(String[] args) {
		int n=4;
		balanced_paranthesis b=new balanced_paranthesis();
		System.out.println(b.generate_paranthesis(n));

	}

}
