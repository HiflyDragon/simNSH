package entity;
import util.Data;
import util.RandomUtil;

public class purpleWeapon extends Weapon {

	/*
	 * Ӧ�����ֹ���������
	 * һ����������ƥ��ȼ�Ʒ�ʵ���Ŀ
	 * ��һ����4����Ŀ��ƥ������ 
	 */
	
	public purpleWeapon(String name){
		//ȥData��Ѱ���봫���nameƥ�����Ŀ
		setName(name);
		setLevel(Integer.parseInt(Data.SW60ZW[1]));
		setQuality(Integer.parseInt(Data.SW60ZW[2]));
		setSect(Integer.parseInt(Data.SW60ZW[3]));
		setPart(Integer.parseInt(Data.SW60ZW[4]));
		//�趨��ɫ�����Ĺ������ֵ
		WGGJ[3]=223;WGGJ[4]=520;
		NGGJ[3]=223;NGGJ[4]=520;
		//�趨��С�����
		WGGJ[0]=RandomUtil.getRandom(WGGJ[3]-60, WGGJ[3]);
		WGGJ[1]=RandomUtil.getRandom(WGGJ[4]-60, WGGJ[4]);
		NGGJ[0]=RandomUtil.getRandom(WGGJ[3]-60, WGGJ[3]);
		NGGJ[1]=RandomUtil.getRandom(NGGJ[4]-60, NGGJ[4]);
		//basicAttrib.add
		
	}
	
	public purpleWeapon(String level,String quality,String sect,String part) {
		
	}
}
