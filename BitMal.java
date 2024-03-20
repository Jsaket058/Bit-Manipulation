import java.util.*;

class BitMal{
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
	public static void main(String args[]){
		System.out.println(convertBinary(13));
		System.out.println(convertBinary(8));
	}
}