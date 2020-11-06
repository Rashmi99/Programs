package binary_search;

public class first_last_occurance {
	
	static int start_ele(int arr[],int ele) {
		int start=0;
		int end=arr.length-1;
		int res=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==ele) {
				res=mid;
				end=mid-1;
			}
			else if(ele<arr[mid]) end=mid-1;
			else start=mid+1;			
		}
		return res;
	}
	
	static int end_ele(int arr[],int ele) {
		int start=0;
		int end=arr.length-1;
		int res=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==ele) {
				res=mid;
				start=mid+1;
			}
			else if(ele<arr[mid]) end=mid-1;
			else start=mid+1;			
		}		
		return res;
	}
	
	static int[] search(int arr[],int ele) {
		int[] ndx=new int[2];
		ndx[0]=start_ele(arr,ele);
		ndx[1]=end_ele(arr,ele);
		return ndx;
	}
	
	public static void main(String[] args) {
		int[] arr= {2,4,10,10,10,18,20};
		int ele=10;
		int[] res=search(arr,ele);
		System.out.println("["+res[0]+","+res[1]+"]");
	}

}
