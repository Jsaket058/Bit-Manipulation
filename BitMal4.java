import java.util.*;
class BitMal4{
	static String onesCompliment(String s){
		s=s.replace("1","9");
		s=s.replace('0','1');
		s=s.replace('9','0');
		return s;
	}
	static int convertDecimal(String s){
		StringBuilder str=new StringBuilder(s);
		int sum=0;
		int r=1;
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)=='1')sum+=r;
			r*=2;
		}
		return sum;
	}
	static String convertBinary(int x){
		StringBuilder s=new StringBuilder();
		while(x!=0){
			if(x%2==1)s.append("1");
			else s.append("0");
			x=x/2;
		}
		s.reverse();
		return s.toString();
	}
	static String twosCompliment(String s){
		int x=convertDecimal(onesCompliment(s));
		return convertBinary(x+1);
	}
	public static void main(String[] ar){
		System.out.println(twosCompliment("1100"));
		System.out.println(twosCompliment("0011"));
	}
}