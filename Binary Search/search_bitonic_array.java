package binary_search;

public class search_bitonic_array {
	
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
	
	public static int Binary_asc(int[] arr,int start,int end,int ele) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==ele)return mid;
			else if(ele<arr[mid])end=mid-1;
			else start=mid+1;
		}
		return -1;
	}
	public static int Binary_desc(int[] arr,int start,int end,int ele) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==ele)return mid;
			else if(ele>arr[mid])end=mid-1;
			else start=mid+1;
		}
		return -1;
	}
	public static int search_array(int[] arr,int ele) {
		
		int index_peak=find_peak(arr);
		//int index_left=Binary_asc(arr,0,index_peak-1,ele);
		//int index_right=Binary_desc(arr,index_peak,arr.length-1,ele);
		//return Math.max(index_left, index_right);
		return Math.max(Binary_asc(arr,0,index_peak-1,ele),Binary_desc(arr,index_peak,arr.length-1,ele) );
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,4,3,2,1};
		int ele=1;
		System.out.println("Element present at index "+search_array(arr,ele));

	}

}
