package binary_search;

import java.util.Arrays;

public class min_pages_allocation {

	public static int calc_min(int[] pages,int stud) {
		int res=-1;
		int start=Arrays.stream(pages).max().orElse(0);
		
		int end=Arrays.stream(pages).sum();
		
		//System.out.println(start);
		//System.out.println(end);
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(isvalid(pages,pages.length,stud,mid)) {
				res=mid;
				end=mid-1;
				//System.out.println(mid);
			}
			else start=mid+1;
		}
		return res;
	}
	public static boolean isvalid(int[] pages,int n,int k,int max) {
		int student=1;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=pages[i];
			if(sum>max) {
				student++;
				sum=pages[i];
			}
			if(student>k)return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,40};
		int k=3;
		System.out.println("Min no of max pages 1 student can read is "+calc_min(arr,k));

	}

}
