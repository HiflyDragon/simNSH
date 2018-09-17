package util;

public class CreateUtil {
	public static int randomValue(int rA,int rB) {
		int range=rB-rA;
		return (int)Math.rint(range*Math.random()+rA);	
	}
	public static void main(String args[]) {
		for (int i=0;i<20;i++) {
		System.out.print(randomValue(0,10)+" ");
		}
	}
}
