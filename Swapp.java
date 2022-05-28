class Swapp{

	static int x , y;
	
	static void swapping(){
	
		System.out.println("\nBefore Swapping");
		System.out.println("x = "+x+", y = "+y);

		y = x + y - (x=y);
		
		System.out.println("\nAfter Swapping");
		System.out.println("x = "+x+", y = "+y);
	
	}
	
	public static void main(String args[]){
		
		x = 2;
		y = 4;
		
		Swapp.swapping();
	}
}