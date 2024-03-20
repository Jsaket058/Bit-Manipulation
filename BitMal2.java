import java.util.*;

class BitMal2{
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
	public static void main(String [] ar){
		System.out.println(convertDecimal("1001"));
		System.out.println(convertDecimal("1010"));
	}
}