package ����������;

public class fanxingTest<T>			//���巺���࣬T�ǲ�������   �൱������ġ�������ʽ������
{								
	private static final String Integer = null;
//�����Ͳ�������ʾ���������Ͳ��ǹ̶��ģ�����T�ɴ�������һ����������				
	private T obj;				//�ø�T�������������Ա����

	/**
	 * @return the obj
	 */
	public T getObj() {			 	//���巺����ķ���getObj()			
		return obj;					//�ø������������÷����ķ���ֵ
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(T obj) {		//���巺����ķ���setobj()   �ø�T����������Ա�����Ĳ���
		this.obj = obj;				
	}
	
	@Override
	public String toString() {
		return " [" + obj + "]";
	}

	public static void main(String[] args) {
		fanxingTest<String> name = new fanxingTest<String>();	//ʹ�÷�����fanxingTest<String>�������Ͷ���nameʱ������ʹ��String���������Ͳ���T
		fanxingTest<Integer> age = new fanxingTest<Integer>();	//����Integer�Ͷ���
		//name
		name.setObj("����");
		String getname = name.getObj();
		System.out.println("����:"+getname);
		//age
		age.setObj(20);
		int getage = age.getObj();
		System.out.println("����:"+getage);
		
		Integer [] num = {1,2,3,4,5};	//��������
		fanxingTest.display(num);;
		
		String str[]= {"��","��","��","��","��","��","��"};
		fanxingTest.display(str);
		
	}
	
	
//	public static void main(String[] args) {
//		fanxingTest fan = new fanxingTest();
//		int i =1;
//		fan.add(i);
//		fan.adsd(i);
//		int[] is = {1};
//		Integer[] is2 = {1};
//		fan.adsd(is2);
//		fan.adsd(is);
//	}
//	public  <H> void adsd(H[] a){
//		System.err.println(a);
//	}
//	
//	public  <H> void adsd(H a){
//		System.err.println(a);
//	}
//	
//	public void add(Object a) {
//		
//		System.out.println(a);
//	}
	
	public static<E> void display(E[] arr) 	//���巺�ͷ���,EΪ��������
	{
		for (int i = 0; i < arr.length; i++)System.out.print(arr[i]+" ");
		System.err.println();
	}
}

