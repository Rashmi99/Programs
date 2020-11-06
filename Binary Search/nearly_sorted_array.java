package binary_search;

public class nearly_sorted_array {
	public static int search(int arr[],int ele) {
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==ele)return mid;
			else if(mid-1>=start && arr[mid-1]==ele)return mid-1;
			else if(mid+1<=end && arr[mid+1]==ele)return mid+1;
			else if(ele<arr[mid])end=mid-2;
			else start=mid+2;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,25,40,35,60};
		int ele=35;
		System.out.println("Element found at index "+search(arr,ele));

	}

}
