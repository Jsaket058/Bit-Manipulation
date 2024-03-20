class BitMal6{
	static boolean checkBitI(int x,int i){
	int y=1<<i;
	// return (x|y)==x;
	// return (((x>>i)&1)==1);
	return (x&(y))!=0;
	}
	public static void main(String[] args){
		System.out.println(checkBitI(13,2));
		System.out.println(checkBitI(13,1));
	}
}