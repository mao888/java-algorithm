package �߳�;


//import java.util.Math;
//����������������
import ����������.set;

public class ProducerConsumer {
	public static void main(String[] args) {
		SyncStack ss = new SyncStack();
		Producer p1 = new Producer(ss);
		Consumer c1 = new Consumer(ss);
		new Thread(c1).start();
		new Thread(p1).start();
		
		
	}
}

class WoTou{
	int id;
	public WoTou(int id) {
		// TODO Auto-generated constructor stub
	this.id=id;
	}
	@Override
	public String toString() {
		return " "+id;
	}
}

//װ��ͷ�����ӣ�ջʵ��
class SyncStack{
	int index=0;
	WoTou[] arrWT = new WoTou[6];
	
	public synchronized void push(WoTou wt) {
		while (index==arrWT.length) {		//����������װ�� ֹͣ
			try {
				this.wait();	//wait:��ǰ�����������������ʵ�����߳�wait  �������Լ�����ǰ��:�˶�����ס
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.notify();		//notify������һ����������wait��ĳһ��������߳�
		arrWT[index]=wt;
		index++;
		System.out.println("�����˵�:"+index+"������ͷ");
	}
	
	public synchronized WoTou pop() {
		while (index==0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		System.out.println("�����˵�"+index+"����ͷ:");
		return arrWT[index];
	}
}

//������ Producer��
class Producer implements Runnable{
	SyncStack ss = null;
	public Producer(SyncStack ss) {
		// TODO Auto-generated constructor stub
		this.ss = ss;
	}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			WoTou wt = new WoTou(i);
			ss.push(wt);
//			System.out.println("�����˵�:"+wt+"������ͷ");
		
			try {
				Thread.sleep((int)(Math.random()*10));
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}


//������ Consumer��
class Consumer implements Runnable{
	SyncStack ss= null;
	public Consumer(SyncStack ss) {
		// TODO Auto-generated constructor stub
		this.ss=ss;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			WoTou wt =ss.pop();
//			System.out.println("�����˵�"+wt+"����ͷ:");
			
			try {
				Thread.sleep((int)(Math.random()*10));
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}
	
}


