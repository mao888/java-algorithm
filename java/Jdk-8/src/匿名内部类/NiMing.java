package �����ڲ���;
/*
 * 
 * ʲô�������ڲ��ࣿ	
	�����ڲ��࣬����˼�壬���ǲ�֪������ൽ����ʲô���֣�Ҳ���ǲ�֪��������
   �����ڲ����ʹ�ó�����
	�����ڲ����ʺϴ�������ֻ��Ҫʹ��һ�ε��࣬Ҳ����˵����һ�������ڲ��ֻ࣬��Ҫ��һ�μ��ɡ�
 * */

interface Product{
	 double getPrice();
	 String getName();
}
	 
class Anony{
	public void test(Product product){
	System.out.println("������һ��"+product.getName()+"��������"+product.getPrice());
	}
}

/*
 * 
 * new ����(����) | ʵ�ֽӿ�()
{
// �����ڲ�������岿��
}
������Ķ�����Կ����������ڲ������̳�һ�����࣬��ʵ��һ���ӿڣ������ֻ�ܼ̳�һ�����࣬����ʵ��һ���ӿڡ�
��������
	�����ڲ��಻���ǳ����ࡣ
	�����ڲ��಻�ܶ��幹���������������ڲ���û�������������޷����幹�������������ڲ�����Գ�ʼ���飬����ͨ����ʼ��������ɹ�������Ҫ��ɵĹ�����

 * */
public class NiMing {
	public static void main(String[] args){
		Anony anony=new Anony();
		// ע�⣬�˴�Ҫ����һ�����������
		anony.test(new Product(){
			@Override
			public double getPrice(){
					return 578.6;
				}
			@Override
			public String getName(){
					return "����ʼǱ�";
				}
			}
		);
		
	}

}


