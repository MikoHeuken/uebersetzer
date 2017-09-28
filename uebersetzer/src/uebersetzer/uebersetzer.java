package uebersetzer;

public class uebersetzer {


	public static void main(String[] args) {
		
		int n=50; 		//**Diese Zahl wird konvertiert*//
		int y=0;
		
		for(int z=40; z>=0; z=z-1) {
			if(n-potenz(2,z)>=0) {
				n=n-potenz(2,z);
				y=y+potenz(10,z);
			
				
			}
			
		}
		
	System.out.println(y);
		
	}
	
	public static int potenz(int b, int z) {
		
		int a=b;
		
		if(z>0) {
			for(int p=z-1; p>=1; p=p-1){
				b=b*a;
			}
		}
		else {b=1;}
		
		int e=b;
		return e;


		
	}
}
