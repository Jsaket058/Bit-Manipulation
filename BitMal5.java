//swapping of two number.
class BitMal5{
	static void swap(int a,int b){
		a=a^b;
		b=a^b;
		a=a^b;
        System.out.println("value of a and b after swapping: "+a+" & " +b);
	}
	public static void main(String[] args){
		int a=9;
		int b=10;
		System.out.println("value of a and b before swapping: "+a+" & " +b);
		swap(a,b); 
	}
}