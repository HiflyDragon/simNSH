import java.util.Set;

public abstract class equip {

	private short level;
	//�ȼ� ��Χ1~100
	private short quality;
	//Ʒ�� 0�� 1�� 2�� 3�� 4�� 5�� 6���� 7��
	//private short durability;
	//װ���;�
	private short sect;
	//���� 0Ѫ�� 1���� 2���� 3���� 4���� 5����
	private short component;
	//��λ 0���� 1ͷ�� 2���� 3�� 4���� 5���� 6Ь�� 7���� 8���� 9��ָ
	private Set<BasicAttrib> basicAttrib;
	//��������
	private Set<Affix> affix;
	//����
	//��ɫ������Ϊ���������� ���� �����ֿ顢��������
	private short strengthen;
	//װ��ǿ�� 0~4
	//private Set<Gem> gem;
	//��ʯ
	private String suit;
	//��װЧ��
	private String exterior;
	//���
	private int score;
	//��������
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
