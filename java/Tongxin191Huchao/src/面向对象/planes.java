package �������;

class Plane{
	private String pName;
	private String pModel;
	private int pWeight;
	private double speed;
	
	//���췽��һ
	public Plane(String pName) {
		this.pName = pName;
	}
	//���췽����
	public Plane(String pName,String pModel,int pWeight, double speed) {
		this(pName);
		this.pModel = pModel;
		this.pWeight = pWeight;
		this.speed = speed;
	}
	//��ͨ����
	//���طɻ��ͺ�
	public String getpModel() {
		return pModel;
	}
	public void setpModel(String pModel) {
		this.pModel = pModel;
	}
	//����������г�Ա������ֵ
	public void show(){
		System.out.println("�ɻ�����:"+pName);
		System.out.println("�ɻ��ͺ�:"+pModel);
		System.out.println("�ɻ�����:"+pWeight+"��");
		System.out.println("�ɻ��ٶ�:"+speed+"����ÿСʱ");
	}
	//����
	public void speedUp(int s2) {
		this.speed+=s2;
		System.out.println("����"+s2+",�ٶ�Ϊ:"+speed+"����ÿСʱ");
	}
	//����
	public void speedDown(int s1) {
		this.speed-=s1;
	System.out.println("����:"+s1+",�ٶ�Ϊ:"+speed+"����ÿСʱ");
	}
	//�Ƚ����������Ƿ����
	public void compare(Plane plane) {
	if (this.pWeight==plane.pWeight&&this.speed==plane.speed)System.out.println("�������������");
	else System.out.println("�������ɻ������");
	}
	
}
public class planes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane plane1 = new Plane("�ͻ�","����747",200,700);
		Plane plane2 = new Plane("ֱ����","��ֱ9",80,150);
		plane1.compare(plane2);
		plane1.show();
		plane1.speedDown(10);
		plane1.speedUp(20);
		plane2.show();
		plane2.speedDown(10);
		plane2.speedUp(20);
	}
}
