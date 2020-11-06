package binary_search;

public class next_letter {
	
	public static char find_next(char[] arr,char ele) {
		char next=arr[0];
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>ele) {
				next=arr[mid];
				end=mid-1;
			}
			else start=mid+1;
		}
		
		return next;
	}
	public static void main(String[] args) {
		char arr[]= {'a','c','h','h','r','x'};
		//also works for duplicates
		char ele='h';
		System.out.println(find_next(arr,ele));
		

	}

}
