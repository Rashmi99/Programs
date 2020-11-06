package recursion;

public class tower_of_hanoi {
	int count=0;
	public void TOH(int s,int d,int h,int n) {
		if(n==1) {
			System.out.println("Moving plate "+n+" from "+s+"->"+d);
			count++;
			return;
		}
		TOH(s,h,d,n-1);
		System.out.println("Moving plate "+n+" from "+s+"->"+d);
		count++;
		TOH(h,d,s,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tower_of_hanoi han=new tower_of_hanoi();
		int n=3;
		int s=1,h=2,d=3;
		han.TOH(s,d,h,n);
		System.out.println(han.count);
	}

}
