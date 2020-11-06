package binary_search;

public class peak_element {
	
	public static int find_peak(int arr[]) {
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid>0 && mid<arr.length-1) {
				if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
					return mid;
				else if(arr[mid-1]>arr[mid])end=mid-1;
				else start=mid+1;
			}
			else if(mid==0) {
				if(arr[0]>arr[1])return 0;
				else return 1;
			}
			else if(mid==arr.length-1) {
				if(arr[arr.length-1]>arr[arr.length-2])return arr.length-1;
				else return arr.length-2;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {3,4,5,6,3};
		System.out.println("peak element at index "+find_peak(arr));

	}

}
