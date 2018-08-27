package entity;
import java.util.Set;

public abstract class Equip {

	private int id;
	//����
	private String name;
	//����
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
	private boolean isInternal;
	//�Ƿ��ڹ� true�ڹ� false�⹦
	private Set<BasicAttrib> basicAttrib;
	//��������
	private Set<Affix> affix;
	//����
	//��ɫ������Ϊ���������� ���� �����ֿ顢��������
	private boolean isStrable;
	//�ܷ�ǿ��
	private short strengthen;
	//ǿ������ 0~4
	private boolean isSmelting;
	//�Ƿ����
	//private Set<Gem> gem;
	//��ʯ
//	private String suit;
	//��װЧ��
//	private String exterior;
	//���
//	private int score;
	//��������
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
	public boolean isStrable() {
		return isStrable;
	}
	public void setStrable(boolean isStrable) {
		this.isStrable = isStrable;
	}
	public short getStrengthen() {
		return strengthen;
	}
	public void setStrengthen(short strengthen) {
		this.strengthen = strengthen;
	}
	public boolean isSmelting() {
		return isSmelting;
	}
	public void setSmelting(boolean isSmelting) {
		this.isSmelting = isSmelting;
	}

}
