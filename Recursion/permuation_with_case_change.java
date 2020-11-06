package recursion;

public class permuation_with_case_change {

	public static void case_change(String ip,String op) {
		if(ip.length()==0) {
			System.out.println(op);
			return;
		}
		String op1=op;
		String op2=op;
		op1+=ip.substring(0,1).toUpperCase();
		op2+=ip.charAt(0);
		ip=ip.substring(1);
		case_change(ip,op1);
		case_change(ip,op2);
		return;
	}
	public static void main(String[] args) {
		//ip should be smaller case letter
		String ip="abcd";
		String op="";
		case_change(ip,op);
	}

}
