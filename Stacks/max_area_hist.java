import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class max_area_hist {
	
	public static ArrayList<Integer> NSL(int arr[]){
		Stack<Integer> s=new Stack<>();
		Stack<Integer> ndx=new Stack<>();
		ArrayList<Integer> a=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(s.isEmpty()) a.add(-1);			
			else if(!s.isEmpty() && s.peek()<arr[i]) a.add(ndx.peek());
			else if(!s.isEmpty() && s.peek()>=arr[i]) {
				while(!s.isEmpty() && s.peek()>=arr[i]) {s.pop();ndx.pop();}
				if(s.isEmpty())a.add(-1);
				else a.add(ndx.peek());
			}
			s.push(arr[i]);
			ndx.push(i);
					
		}
		return a;
	}
	public static ArrayList<Integer> NSR(int arr[]){
		Stack<Integer> s=new Stack<>();
		Stack<Integer> ndx=new Stack<>();
		ArrayList<Integer> a=new ArrayList<>();
		
		for(int i=arr.length-1;i>=0;i--) {
			if(s.isEmpty()) a.add(arr.length);			
			else if(!s.isEmpty() && s.peek()<arr[i]) a.add(ndx.peek());
			else if(!s.isEmpty() && s.peek()>=arr[i]) {
				while(!s.isEmpty() && s.peek()>=arr[i]) {s.pop();ndx.pop();}
				if(s.isEmpty())a.add(arr.length);
				else a.add(ndx.peek());
			}
			s.push(arr[i]);
			ndx.push(i);
					
		}
		Collections.reverse(a);
		return a;
	}
	public static int max_area(int arr[]) {
		ArrayList<Integer> left=new ArrayList<>();
		ArrayList<Integer> right=new ArrayList<>();
		left=NSL(arr);
		right=NSR(arr);
		
		int[] width=new int[arr.length];
		for(int i=0;i<arr.length;i++)width[i]=right.get(i)-left.get(i)-1;
		int max=width[0]*arr[0];
		for(int i=1;i<width.length;i++) {
			if(max<width[i]*arr[i])max=width[i]*arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a= {6,5,6,1,5};//{6,2,5,4,5,1,6};
		int max=max_area(a);
		System.out.println("max area of histogram is "+max);

	}

}
