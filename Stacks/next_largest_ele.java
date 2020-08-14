package stacks;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class next_largest_ele {

	public static void main(String[] args) {
		int arr[]= {1,3,2,4};
		ArrayList<Integer> a=new ArrayList<>();
		a=findnextgreater(arr);
		System.out.println(a);

	}
	//nearest larger element
	public static ArrayList<Integer> findnextgreater(int[] arr){
		ArrayList<Integer> a=new ArrayList<>();
		Stack<Integer> s=new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			if(s.isEmpty())a.add(-1);			
			else if(!s.isEmpty() && s.peek()>arr[i]) a.add(s.peek());
			else if(!s.isEmpty() && s.peek()<=arr[i]) {
				while(!s.isEmpty() && s.peek()<=arr[i])s.pop();
				if(s.isEmpty())a.add(-1);
				else a.add(s.peek());
			}
			s.push(arr[i]);
					
		}
		Collections.reverse(a);
		return a;
		
	}

}
