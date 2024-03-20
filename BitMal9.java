class BitMal9{
	static int toggleBitI(int n,int i){
		int y=1<<i;
		return n^y;
	}
	
	public static void main(String[] args){
		System.out.println(toggleBitI(13,1));
		System.out.println(toggleBitI(9,1));
	}
}