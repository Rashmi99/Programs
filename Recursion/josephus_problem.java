package recursion;

import java.util.ArrayList;

public class josephus_problem {

	int ans=-1;
	public void solve(ArrayList<Integer>a, int k,int index) {		
		if(a.size()==1) {
			//System.out.print(a.get(0)); 
			ans=a.get(0);
			return;// a.get(0);
		}
		index=(index+k)%a.size();
		//System.out.println(index+" "+a.get(index));
		a.remove(index);
		solve(a,k,index);
		return;//ans;
	}
	public static void main(String[] args) {
		josephus_problem m=new josephus_problem();
		int n=40;
		int k=7;
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<n;i++)a.add(i+1);
		int index=0;
		System.out.print("The person who will be alive is person ");
		m.solve(a,k-1,index);
		System.out.println(m.ans);

	}

}
