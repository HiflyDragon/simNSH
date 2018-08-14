import java.util.Set;

public class equip {

	private short level;
	//等级 范围1~100
	private short quality;
	//品质 0白 1黄 2绿 3蓝 4红 5紫 6百炼 7橙
	private short durability;
	//装备耐久
	private short sect;
	//流派 0血河 1铁衣 2九灵 3素问 4神相 5碎梦
	private short component;
	//部位 0武器 1头部 2上衣 3腕部 4手套 5腰带 6鞋子 7项链 8手镯 9戒指
	private Set<BasicAttrib> basicAttrib;
	//基础属性
	private Set<Affix> affix;
	//词条
}
