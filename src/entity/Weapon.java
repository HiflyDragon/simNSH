package entity;

public class Weapon extends Equip {
//	private int lowWGGJ;
//	private int highWGGJ;
//	private int lowNGGJ;
//	private int highNGGJ;
	
	//用数组来保存 0最小攻 1最大攻 2最小攻的最大值 3最大攻的最大值
	protected int[] WGGJ=new int[4];
	protected int[] NGGJ=new int[4];
}
