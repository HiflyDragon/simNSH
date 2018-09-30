package util;

public class RandomUtil {
	
	public static int getRandom(int minValue,int maxValue) {
		int range=maxValue-minValue;
		return (int)Math.rint(range*Math.random()+minValue);	
	}
	public static void main(String args[]) {
		for (int i=0;i<20;i++) {
		System.out.print(getRandom(2,4)+" ");
		}
	}
}
