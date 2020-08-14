package stacks;

import java.util.Stack;

public class min_ele_o1 {
	int min_ele;
	Stack<Integer> s=new Stack<>();
	void push_ele(int a) {
		if(s.isEmpty()) {
			s.push(a);
			min_ele=a;
		}
		else {
			if(a>=min_ele)s.push(a);
			else {
				s.push(2*a-min_ele);
				min_ele=a;
			}
		}
	}
	void pop_ele() {
		if(s.isEmpty()) return;
		else {
			if(s.peek()>=min_ele)s.pop();
			else {
				min_ele=2*min_ele-s.peek();
				s.pop();
			}
		}
	
	}
	/*int top() {
		if(s.isEmpty())return -1;
		else {
			if(s.peek()>=min_ele)return s.peek();
			else return min_ele;
		}
	}*/
	int get_min() {
		if(s.isEmpty())return -1;
		return min_ele;
	}
	
	public static void main(String[] args) {
		min_ele_o1 s=new min_ele_o1();
		s.push_ele(10);
		s.push_ele(40);
		s.push_ele(23);
		
		s.push_ele(10);
		s.push_ele(34);
		s.pop_ele();
		s.pop_ele();
		s.push_ele(8);
		s.push_ele(40);
		System.out.println(s.get_min());

	}

}
