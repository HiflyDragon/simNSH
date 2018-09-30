package entity;
import java.util.Set;
import util.Data;
import util.RandomUtil;

public abstract class Equip {

	private int id;
	//����
	private String name;
	//����
	private int level;
	//�ȼ� ��Χ1~100
	private int quality;
	//Ʒ�� 0�� 1�� 2�� 3�� 4�� 5�� 6��
	//private int durability;
	//װ���;�
	private int sect;
	//���� 0Ѫ�� 1���� 2���� 3���� 4���� 5���� 6All
	private int part;
	//��λ 0���� 1ͷ�� 2���� 3�� 4���� 5���� 6Ь�� 7���� 8���� 9��ָ
	private boolean isInternal;
	//�Ƿ��ڹ� true�ڹ� false�⹦
	protected Set<BasicAttrib> basicAttrib;
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
	public String getQuality() {
		return Data.index1[0][quality];
	}
	public void setQuality(int quality) {
		//���ѡ����Ĳ���Ϊ �������ϣ�0�� �켰���ϣ�1���������һ�������Ʒ��
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
		//���ѡ����Ĳ���Ϊ �����0���������һ�����������
		if (sect==0) 
			sect=RandomUtil.getRandom(1,6);
		this.sect = sect;
	}
	public String getPart() {
		return Data.index1[1][part];
	}
	public void setPart(int part) {
		//���ѡ����Ĳ���Ϊ �����0���������һ������Ĳ�λ
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
//		System.out.println("�ȼ�Ҫ��"+this.getLevel());
//	}
}
