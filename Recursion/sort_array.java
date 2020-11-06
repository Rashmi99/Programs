package recursion;

import java.util.ArrayList;

public class sort_array {

	public static void sort(ArrayList<Integer>a) {
		if(a.size()==0)return;
		int temp=a.get(a.size()-1);
		a.remove(a.size()-1);
		sort(a);
		insert(a,temp);
	}
	public static void insert(ArrayList<Integer>a,int temp) {
		if(a.size()==0 || a.get(a.size()-1)<=temp) {
			a.add(temp);
			return;
		}
		int val=a.get(a.size()-1);
		a.remove(a.size()-1);
		insert(a,temp);
		a.add(val);
		
	}
	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(8);
		a.add(5);
		sort(a);
		for(int i=0;i<a.size();i++)System.out.print(a.get(i)+" ");

	}

}
