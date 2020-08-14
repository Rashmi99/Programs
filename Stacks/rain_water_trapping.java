package stacks;

import java.util.Arrays;

public class rain_water_trapping {

	public static void main(String[] args) {
		//int arr[]={3,0,0,2,0,4};
		int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Area of rain water trapped = "+area_rain_water(arr)+" units");		
	}
	public static int area_rain_water(int arr[]) {
		int[] mxl=new int[arr.length];
		int[] mxr=new int[arr.length];
		mxl[0]=arr[0];
		for(int i=1;i<mxl.length;i++) 
			mxl[i]=Math.max(mxl[i-1], arr[i]);
		mxr[mxr.length-1]=arr[arr.length-1];
		for(int i=mxr.length-2;i>=0;i--)
			mxr[i]=Math.max(mxr[i+1], arr[i]);
		int[] water=new int[arr.length];
		for(int i=0;i<water.length;i++)
			water[i]=Math.min(mxl[i], mxr[i])-arr[i];
		return (int)Arrays.stream(water).sum();
	}

}
