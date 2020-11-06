package recursion;
//does not remove duplicates
public class print_subset {

	public static void find_subsets(String ip,String op) {
		if(ip.length()==0) {
			System.out.println(op);
			return;
		}
		String op1=op;
		String op2=op;
		op2+=ip.charAt(0);
		ip=ip.substring(1);
		find_subsets(ip,op1);
		find_subsets(ip,op2);
		return;
	}
	public static void main(String[] args) {
		String ip="aac";
		String op="";
		find_subsets(ip,op);

	}

}
