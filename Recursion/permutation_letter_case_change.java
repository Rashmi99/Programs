package recursion;

public class permutation_letter_case_change {

	public static void case_change(String ip,String op) {
		if(ip.length()==0) {
			System.out.println(op);
			return;
		}
		
		String nums="0123456789";
		//System.out.print(nums.contains(ip.substring(0,1)));
		if(!nums.contains(ip.substring(0,1))) {
			String op1=op;
			String op2=op;
			op1+=ip.substring(0,1).toLowerCase();
			op2+=ip.substring(0,1).toUpperCase();
			ip=ip.substring(1);
			case_change(ip,op1);
			case_change(ip,op2);
		}
		else {
			String op1=op;
			op1+=ip.charAt(0);
			ip=ip.substring(1);
			case_change(ip,op1);
		}
			
		return;
	}
	public static void main(String[] args) {
		String ip="a1B62c";
		String op="";
		case_change(ip,op);

	}

}
