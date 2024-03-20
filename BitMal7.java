class BitMal7{
	static int setBitI(int n,int i){
		int y=1<<i;
		return (n|y);
	}
	public static void main(String[] args){
		System.out.println(setBitI(13,1));
		System.out.println(setBitI(9,1));
	}
}