package binary_search;

public class no_of_rotations {
	
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
	public static void main(String[] args) {
		int arr[]= {11,12,15,18,2,5,6,8};
		System.out.println("Number of rotations="+rotations(arr));

	}

}
