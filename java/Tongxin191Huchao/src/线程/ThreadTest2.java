package �߳�;

import java.util.Date;
//import org.omg.CORBA.DATA_CONVERSION;

/*
public enum State {
   NEW,
   RUNNABLE,
   BLOCKED,
   WAITING,
   TIMED_WAITING,
   TERMINATED;
}
*/
public class ThreadTest2 {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		try {
			Thread.sleep(10000);
			thread.interrupt();	
			
			// java���߳�ת̬ 4 5
			// java���Ƽ��жϣ�ֹͣ������
			// java���Ƽ�ʹ�õķ���
			// java�������ն��߳�Ӱ�죨��չ��
		
		} catch (InterruptedException e) {
			// TODO: handle exception
			 //�ж��߳�
		}
	}
}

class MyThread extends Thread{
	boolean flag = true;
	public void run() {
		while (flag) {
			System.out.println("==="+new Date()+"===");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				return;
			}
		}
	}
}