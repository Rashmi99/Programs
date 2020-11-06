package binary_search;

public class infinite_sorted_array {
	public static int sort_array(int[] arr,int ele) {
		int low=0;
		int high=1;
		while(high<arr.length && ele>arr[high]) {
			low=high;
			high=high*2;
			//System.out.println(high);
		}
		return bin_search(arr,low,high,ele);
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
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,12,40,80,100,104,200,400,589,890,900,1000,1020,3040,4050,5060,6670,8989,9000};
		int ele=900;
		System.out.println("Index is "+sort_array(arr,ele));
}
}
