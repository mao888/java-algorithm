package �������;

//�������Ĵ洢��
abstract class Storage{
	protected String brand;
	protected String type;
	protected String owner;
	private static int num;
	//���췽��һ
	public Storage(String xm){
		brand = xm;
	}
	//���췽����
	public Storage(String xm,String type,String owner,int num) {
		this(xm);
		this.type=type;
		this.owner=owner;
		this.num = num;
	}
	//��ͨ����
	// �����ͺ�
	abstract public String getType();	//�������󷽷�
	//������г�Ա������ֵ
	abstract public void show();		//�������󷽷�
	//�Ƚ����������Ƿ����
	abstract public void compare(Storage stor);		// �������󷽷�
	//��̬����
	//������������Ķ������
	public static void count() {
		System.out.println("�����Ķ������:"+num);
	}
}

//����̳���Storage������compute
class compute extends Storage {
	//���췽��
	public compute(String xm, String type, String owner, int num) {
		super(xm, type, owner, num);
		// TODO Auto-generated constructor stub
	}
	//���췽��
	public compute(String xm) {
		super(xm);
		// TODO Auto-generated constructor stub
	}
	//ʵ�ֳ������е�getType����
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return brand;
	}
	//ʵ�ֳ������ص�show����
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Ʒ��:"+brand);
		System.out.println("�ͺ�:"+type);
		System.out.println("������:"+owner);
	}
	//ʵ�ֳ������е�compare����
	public void compare(Storage stor) {
		// TODO Auto-generated method stub
		if (this.owner == stor.owner)System.out.println("�������������");
		else System.out.println("�������������");
	}
};

//��������
public class computer {
	public static void main(String[] args) {
		Storage stor1 = new compute("����","STDR2000307","20191544119����",1);		//�����������stor1,ָ���������
		Storage stor2 = new compute("��˶","STDR2000308","20191544118giao��",2);	//�����������stor2,ָ���������
		stor1.compare(stor2);
		stor1.show();
		stor2.show();
	}
}