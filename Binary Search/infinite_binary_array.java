package binary_search;

public class infinite_binary_array {
	
	public static int find_1(int[] arr) {
		int low=0,high=1;
		while(high<arr.length && arr[high]!=1) {
			low=high;
			high*=2;
		}
		return first_occurance(arr,low,high);
	}
	
	public static int first_occurance(int[] arr,int start,int end) {
		int res=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==1) {
				res=mid;
				end=mid-1;
			}
			else if(arr[mid]!=1)start=mid+1;
		}
		return res;
	}
	public static void main(String args[]) {
		int arr[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		System.out.println("first occurance of 1 is "+find_1(arr));
	}
}
