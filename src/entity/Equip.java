package entity;
import java.util.Set;
import util.Data;
import util.RandomUtil;

public abstract class Equip {

	private int id;
	//主键
	private String name;
	//名称
	private int level;
	//等级 范围1~100
	private int quality;
	//品质 0白 1黄 2绿 3蓝 4红 5紫 6橙
	//private int durability;
	//装备耐久
	private int sect;
	//流派 0血河 1铁衣 2九灵 3素问 4神相 5碎梦 6All
	private int part;
	//部位 0武器 1头部 2上衣 3腕部 4手套 5腰带 6鞋子 7项链 8手镯 9戒指
	private boolean isInternal;
	//是否内功 true内功 false外功
	protected Set<BasicAttrib> basicAttrib;
	//基础属性
	private Set<Affix> affix;
	//词条
	//紫色武器作为单独的子类 包含 武器分块、武器契合
	private boolean isStrable;
	//能否强化
	private int strengthen;
	//强化级别 0~4
	private boolean isSmelting;
	//是否百炼
	//private Set<Gem> gem;
	//宝石
//	private String suit;
	//套装效果
//	private String exterior;
	//外观
//	private int score;
	//武器评分
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getQuality() {
		return Data.index1[0][quality];
	}
	public void setQuality(int quality) {
		//如果选择传入的参数为 蓝及以上（0） 红及以上（1），则产生一个随机的品质
		if (quality==0) 
				quality=RandomUtil.getRandom(2,4);
		if (quality==1)
				quality=RandomUtil.getRandom(3,4);
		this.quality = quality;
	}
	public String getSect() {
		return Data.index1[2][sect];
	}
	public void setSect(int sect) {
		//如果选择传入的参数为 随机（0），则产生一个随机的流派
		if (sect==0) 
			sect=RandomUtil.getRandom(1,6);
		this.sect = sect;
	}
	public String getPart() {
		return Data.index1[1][part];
	}
	public void setPart(int part) {
		//如果选择传入的参数为 随机（0），则产生一个随机的部位
		if (part==0) 
			part=RandomUtil.getRandom(1,9);
		this.part = part;
	}
	public Set<BasicAttrib> getBasicAttrib() {
		return basicAttrib;
	}
	public void setBasicAttrib(Set<BasicAttrib> basicAttrib) {
		this.basicAttrib = basicAttrib;
	}
	public Set<Affix> getAffix() {
		return affix;
	}
	public void setAffix(Set<Affix> affix) {
		this.affix = affix;
	}
	public boolean isStrable() {
		return isStrable;
	}
	public void setStrable(boolean isStrable) {
		this.isStrable = isStrable;
	}
	public int getStrengthen() {
		return strengthen;
	}
	public void setStrengthen(int strengthen) {
		this.strengthen = strengthen;
	}
	public boolean isSmelting() {
		return isSmelting;
	}
	public void setSmelting(boolean isSmelting) {
		this.isSmelting = isSmelting;
	}
	public boolean isInternal() {
		return isInternal;
	}
	public void setInternal(boolean isInternal) {
		this.isInternal = isInternal;
	}
//	public void show() {
//		System.out.println(this.getName());
//		System.out.println("等级要求："+this.getLevel());
//	}
}
