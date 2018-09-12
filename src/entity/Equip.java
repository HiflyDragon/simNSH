package entity;
import java.util.Set;

public abstract class Equip {

	private int id;
	//����
	private String name;
	//����
	private int level;
	//�ȼ� ��Χ1~100
	private int quality;
	//Ʒ�� 0�� 1�� 2�� 3�� 4�� 5�� 6���� 7��
	//private int durability;
	//װ���;�
	private int sect;
	//���� 0Ѫ�� 1���� 2���� 3���� 4���� 5���� 6All
	private int component;
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
	private int strengthen;
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public int getSect() {
		return sect;
	}
	public void setSect(int sect) {
		this.sect = sect;
	}
	public int getComponent() {
		return component;
	}
	public void setComponent(int component) {
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
//		System.out.println("�ȼ�Ҫ��"+this.getLevel());
//	}
}
