package �����ڲ���;

/*
 * ��2(�̳���)
 * */
abstract class Device{
	
	private String name;
	public abstract double  getPrice();
	
	public String getName(){
	 	return name;
	}
	
	public Device(){}
	
	public Device(String name){
		this.name=name;
	}
	
} 

/* 
 * ����һ��ʵ���࣬ʵ���ඨ��һ��������
 * �����Ĳ���Ϊ�����ĳ�������󣬵�ʱ��ᴫ��һ�����������
 * ���������̳������������ĳ�����
 * */
class Anony1 {
    public void test(Device device){
        System.out.println("������һ��"+device.getName()+"������"+device.getPrice());
    }
}

public class NiMing2 {
	public static void main(String[] args){
		Anony1 anony=new Anony1();
		// ע�⣬�˴�Ҫ����һ�����������
		anony.test(new Device("�������ӻ�"){
			@Override
			public double getPrice(){
					return 578.6;
				}
		}
		);
	
		Device device=new Device(){
			@Override
			public double getPrice(){
				return 556.56;
			}
			@Override
			public String getName(){
				return "���ĵ��ӻ�";
			}
		};
		
		anony.test(device);
	}

}

	
	
	
	
	
	
	
	
	
	
	