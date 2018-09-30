package entity;
import util.Data;
import util.RandomUtil;

public class purpleWeapon extends Weapon {

	/*
	 * 应有两种构建方法：
	 * 一种是以名字匹配等级品质等条目
	 * 另一种以4个条目来匹配名字 
	 */
	
	public purpleWeapon(String name){
		//去Data中寻找与传入的name匹配的条目
		setName(name);
		setLevel(Integer.parseInt(Data.SW60ZW[1]));
		setQuality(Integer.parseInt(Data.SW60ZW[2]));
		setSect(Integer.parseInt(Data.SW60ZW[3]));
		setPart(Integer.parseInt(Data.SW60ZW[4]));
		//设定紫色武器的攻的最大值
		WGGJ[3]=223;WGGJ[4]=520;
		NGGJ[3]=223;NGGJ[4]=520;
		//设定最小攻最大攻
		WGGJ[0]=RandomUtil.getRandom(WGGJ[3]-60, WGGJ[3]);
		WGGJ[1]=RandomUtil.getRandom(WGGJ[4]-60, WGGJ[4]);
		NGGJ[0]=RandomUtil.getRandom(WGGJ[3]-60, WGGJ[3]);
		NGGJ[1]=RandomUtil.getRandom(NGGJ[4]-60, NGGJ[4]);
		//basicAttrib.add
		
	}
	
	public purpleWeapon(String level,String quality,String sect,String part) {
		
	}
}
