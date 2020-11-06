package binary_search;

import java.util.ArrayList;

public class BS_on_matrix {

	public static ArrayList<Integer> matrix_search(int[][] arr,int ele){
		ArrayList<Integer> a=new ArrayList<>();
		int i=0;
		int n=arr.length;int m=arr[0].length;
		int j=m-1;
		while(i>=0 && i<n && j>=0 && j<m) {
			if(arr[i][j]==ele) {
				a.add(i);
				a.add(j);
				return a;
			}
			else if(arr[i][j]>ele)j--;
			else i++;
		}
		
		return a;
	}
	public static void main(String[] args) {
		int[][] arr= {{10,20,30,40},{15,25,35,45},{27,29,37,45},{32,33,39,50}};
		int ele=26;
		System.out.println("Element found at index "+matrix_search(arr,ele));

	}

}
