class BitMal8{
	static int clearSetBitI(int n,int i){
		int y=1<<i;
		return n & ~(y);
	}
    public static void main(String[] args){
		System.out.println(clearSetBitI(13,3));
		System.out.println(clearSetBitI(9,2));
	}
}