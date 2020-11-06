package binary_search;

public class floor_of_ele {
	
	public static int floor(int arr[],int ele) {
		int start=0,end=arr.length-1;
		int res=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]<=ele) {
				res=arr[mid];
				start=mid+1;
			}
			else end=mid-1;
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,36,57,78,89};
		int ele=57;
		System.out.println("Floor is "+floor(arr,ele));

	}

}
