import java.util.Set;

public abstract class equip {

	private short level;
	//等级 范围1~100
	private short quality;
	//品质 0白 1黄 2绿 3蓝 4红 5紫 6百炼 7橙
	//private short durability;
	//装备耐久
	private short sect;
	//流派 0血河 1铁衣 2九灵 3素问 4神相 5碎梦
	private short component;
	//部位 0武器 1头部 2上衣 3腕部 4手套 5腰带 6鞋子 7项链 8手镯 9戒指
	private Set<BasicAttrib> basicAttrib;
	//基础属性
	private Set<Affix> affix;
	//词条
	//紫色武器作为单独的子类 包含 武器分块、武器契合
	private short strengthen;
	//装备强化 0~4
	//private Set<Gem> gem;
	//宝石
	private String suit;
	//套装效果
	private String exterior;
	//外观
	private int score;
	//武器评分
	public short getLevel() {
		return level;
	}
	public void setLevel(short level) {
		this.level = level;
	}
	public short getQuality() {
		return quality;
	}
	public void setQuality(short quality) {
		this.quality = quality;
	}
	public short getSect() {
		return sect;
	}
	public void setSect(short sect) {
		this.sect = sect;
	}
	public short getComponent() {
		return component;
	}
	public void setComponent(short component) {
		this.component = component;
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
	public short getStrengthen() {
		return strengthen;
	}
	public void setStrengthen(short strengthen) {
		this.strengthen = strengthen;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getExterior() {
		return exterior;
	}
	public void setExterior(String exterior) {
		this.exterior = exterior;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
