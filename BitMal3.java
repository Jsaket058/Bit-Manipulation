import java.util.*;

class BitMal3{
	static String onesCompliment(String s){
		s=s.replace("1","9");
		s=s.replace('0','1');
		s=s.replace('9','0');
		return s;
	}
	
	public static void main(String[] ar){
		System.out.println(onesCompliment("1100"));
		System.out.println(onesCompliment("0011"));
	}
}