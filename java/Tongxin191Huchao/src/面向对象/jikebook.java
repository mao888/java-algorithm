package �������;

import java.util.Scanner;

//1.ͼ��ݽӿ�
interface Library{
	//��Ա����
	public void borrow();	//����ͼ��
	public void revert();	//�黹ͼ��
}
//2.ͼ����
class Book{
	//��Ա����
	private String name;		//ͼ������
	private String publisher;	//������
	
	//���췽��
		//ͨ���βγ�ʼ��ͼ�����ƣ�name���ͳ����磨publisher��
	public Book(String name,String publisher) {
		this.name=name;
		this.publisher=publisher;
	}
	//��ͨ����
		//1.����gettor��settor�������ڻ�ȡ����������name������ֵ��
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		//2.��дEquals���������ҽ���������name)�ͳ�����(publisher) �����ʱ����Ϊͬһ���顣
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		return true;
	}
		//3.��дtoString����������������name)�ͳ�����(publisher)����Ϣ����ʽ���£���������Java������ƣ������磺�廪��ѧ�����硱
	@Override
	public String toString() {
		return "����:"+this.name+"  ������:"+this.publisher;
	}
}
//3.�ݲ�ͼ���ࣨCollectionBook�����̳���Book�࣬ʵ��Library�ӿ�
class CollectionBook extends Book implements Library{
	//��Ա����
	private String bNo;		//ͼ����
	private String stacks;	//�������
	private boolean isBorrow;		//�Ƿ����
	//���췽��
	public CollectionBook(String name, String publisher,String bNo,String stacks) {
		super(name, publisher);
		this.bNo=bNo;
		this.stacks= stacks;
		// TODO Auto-generated constructor stub
	}
	//��ͨ����
		//1.ʵ�ֽӿ��е�borrow����
	@Override
	
	public void borrow() {
		// TODO Auto-generated method stub
		if (isBorrow==true)System.out.println("�Բ��𣬸�ͼ���ѽ���");
		else System.out.println("���ĳɹ�");
	}
		//2.ʵ�ֽӿ��е�revert����
	@Override
	public void revert() {
		// TODO Auto-generated method stub
		if (isBorrow==false)System.out.println("����ɹ�");
		else System.out.println("��ͼ���ѹ黹");
	}
}

public class jikebook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionBook book1 = new CollectionBook("�����������", "�廪������", "00123", "һ�����");
		CollectionBook book2 = new CollectionBook("�������˼䡷", "�㽭������", "12300", "������");
		if (book1.equals(book2)==true) System.out.println("�������������");
		else System.out.println("�������������");
		Scanner sc = new Scanner(System.in);
		System.out.println("����������(0����1)");
		while (sc.hasNext()) {
		int x= sc.nextInt();
		if (x==0) {
			book1.borrow();
		}
		if (x==1) {
			book1.revert();
		}
		}
	}

}
