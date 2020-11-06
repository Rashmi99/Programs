package binary_search;

public class find_ele_rotated_sorted_array {
	public static int rotations(int arr[]) {
		int start=0,prev=0,next=0;
		int mid=0;
		int n=arr.length;
		int end=n-1;
		while(start<=end) {
			mid=start+(end-start)/2;			
			prev=(mid-1)%n;
			next=(mid+1)%n;			
			 if (arr[end]>arr[start])
		            return start;
		     if(arr[prev]>arr[mid] && arr[next]>arr[mid])
		            return mid;
		     else if(arr[mid]>arr[start])
		            start=mid+1;
		     else
		            end=mid-1;			
		}
		return -1;
	}
	public static int find_ele(int[] arr,int ele) {
		int index=rotations(arr);
		return Math.max(bin_search(arr,0,index-1,ele), bin_search(arr,index,arr.length-1,ele));
		 
	}
	public static int bin_search(int[] arr,int start,int end,int ele) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==ele)return mid;
			else if(ele<arr[mid])end=mid-1;
			else start=mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {11,13,15,17,2,4,6};
		int ele=4;
		System.out.println("Element found at index "+find_ele(arr,ele));

	}

}
