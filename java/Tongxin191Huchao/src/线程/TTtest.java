package �߳�;

public class TTtest implements Runnable {
	//��2:b��ӡ��� 1.��������main����ִ�У����߳���Ҫ׼�� 2.main�����̵߳�ҵ�����
	
	// ����1 synchronized ������
	// 1. aT,bT ����ִ��ͬһ������
	// 2. ����� ������synchronized����

	// ��3:���ݿ����ĳһ����¼������ �ҿ����޸ĺͶ� ���͸ĵķ����ķ��� �ĸ��ü�synchronized Ϊʲô����Ӱ��Ч��\
	// ���� mysql �˼����м����ġ�
	//  
	int b = 100;

	public synchronized void m1() throws Exception { // ����1:���˷���ִ�еĹ����� m2�����ܹ���ִ����
		//		b = 1000; // �Ƿ�Ҫ�ȵ����������ִ����
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " " + 2);
	}

	public synchronized void m2() throws Exception {
		Thread.sleep(2500);
//		System.out.println(b);
		b = 2000;
		System.out.println(1);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		TTtest tt = new TTtest();
		Thread t = new Thread(tt);
		t.start();		// t �߳�ȥ ִ�е�m1 m1ӵ�л�����
		tt.m1();		// main �߳�ִ�е�m1	
//		System.out.println(tt.b);
		// ��3:���ݿ����ĳһ����¼������ �ҿ����޸ĺͶ� ���͸ĵķ����ķ��� �ĸ��ü�synchronized Ϊʲô����Ӱ��Ч��

		// java ����û�������Զ����̡߳� main�̣߳����������������С�
		// Thread.sleep(n) ����������������Ǹ��߳�ȥ˯�ߡ�
	}
}
