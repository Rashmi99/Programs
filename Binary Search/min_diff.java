package binary_search;

public class min_diff {
	
	public static int find_min(int[] arr,int ele) {
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==ele)return arr[mid];
			else if(ele<arr[mid])end=mid-1;
			else start=mid+1;
		}
		//System.out.println(start+" "+end);
		int min;
		if(Math.abs(arr[start]-ele)<Math.abs(arr[end]-ele))min= arr[start];
		else min=arr[end];
		return min;
	}
	public static void main(String[] args) {
		int arr[]= {4,6,9,12,15,33,45};
		int ele=5;
		System.out.println("Min diff given by "+find_min(arr,ele));

	}

}
