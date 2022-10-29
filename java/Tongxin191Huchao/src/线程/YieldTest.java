package 线程;

public class YieldTest {
	public static void main(String[] args) {
		MyThread3 t1= new MyThread3("t1");
		MyThread3 t2 =new MyThread3("t2");
		t1.start();
		t2.start();
	}
}


class MyThread3 extends Thread{
	MyThread3(String s ) {
		// TODO Auto-generated constructor stub
	super(s);
	}
	
	public void run() {
		for (int i = 1; i <=100; i++) {
			System.out.println(getName()+": "+i);
			if (i%10==0) {
				yield();	//暂停当前正在执行的线程对象，并执行其他线程
			}	
		}
	}
	
}
