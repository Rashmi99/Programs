package recursion;

import java.util.Stack;

public class delete_stack_mid {

	public static void del_mid(Stack<Integer>s,int k) {
		if(s.size()==0)return;
		if(k==1) {
			s.pop();
			return;
		}
		int val=s.peek();
		s.pop();
		del_mid(s,k-1);
		s.push(val);
	}
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(3);
		s.push(4);
		s.push(1);
		s.push(6);
		s.push(5);
		del_mid(s,s.size()/2+1);
		while(s.size()>0) {
			System.out.print(s.peek());
			s.pop();
		}
		
	}

}
