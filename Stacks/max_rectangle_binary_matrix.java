package stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class max_rectangle_binary_matrix {
	//use functions used in max_hist area and find max for each hist created
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
		int[][] bin_mat= {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0},{1,1,1,1},{1,1,1,1}};
		int max[]=new int[bin_mat.length];
		int temp[]=new int[bin_mat.length];
		//System.out.println(bin_mat.length);
		//System.out.println(bin_mat[0].length);
		
		for(int i=0;i<bin_mat.length;i++) {
			for(int j=0;j<bin_mat[0].length;j++) {
				if(bin_mat[i][j]!=0) 
					temp[j]=temp[j]+bin_mat[i][j];
				else temp[j]=0;
				//System.out.println(temp[j]);
			}
			max[i]=max_area(temp);
		}
		
		//for printing max values:
		//for(int i=0;i<max.length;i++)System.out.println(max[i]);
		System.out.println("Maximum binary matrix is: "+Arrays.stream(max).max().orElse(0));
		
	}

}
