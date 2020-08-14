package stacks;

import java.util.Stack;

public class min_ele_with_extra_space {
	Stack<Integer> s=new Stack<>();
	Stack<Integer> ss=new Stack<>();
	
	void push_ele(int a) {
		s.push(a);
		if(ss.isEmpty() || a <= ss.peek()) ss.push(a);  
		return;
	}
	int pop_ele() {
		if(s.isEmpty())return -1;
		int ans=s.pop();
		if(ss.peek()==ans) ss.pop();
		return ans;
	}
	int get_min() {
		if(ss.isEmpty())return -1;
		return ss.peek();
	}
	
	
	public static void main(String[] args) {
		min_ele_with_extra_space s=new min_ele_with_extra_space();
		
		s.push_ele(10);
		s.push_ele(30);
		s.push_ele(9);
		s.push_ele(3);
		//s.pop_ele();
		System.out.println("Min element is "+s.get_min());

	}

}
