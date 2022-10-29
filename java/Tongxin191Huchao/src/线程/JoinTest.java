package 线程;

public class JoinTest {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("abcde ");
		t1.start();
		try {
			t1.join();			//等待该线程终止 等子线程执行完主线程才执行
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		for (int i = 1; i <=10; i++) {
			System.out.println("I am main Thread");
		}
		
	}
	
}


class MyThread2 extends Thread{
	
	public MyThread2(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}

	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println("I am "+getName());	//调用Thread类的getName  拿到super(s)中设定的名字
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			return;
		}
	}
}
