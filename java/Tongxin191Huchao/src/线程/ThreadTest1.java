package �߳�;

//class Runner1 implements Runnable{	//��һ:�̳нӿ�
	class Runner1 extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Runner1"+i);
		}
	}
}


public class ThreadTest1 {
	public static void main(String[] args) {
		Runner1 r = new Runner1();
		r.start();    //����
//		Thread t = new Thread(r);	
//		t.start();	//�߳�����   ���н���ִ��
		r.run();    //��������  ���߳�ִ����  ��ִ�����߳�
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread:-----"+i);
		}
	}
}
