package Demo;
/**
* 食堂排队问题 --生产者和消费者的关系
* @author 胡超
*
*/
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.internal.runners.statements.FailOnTimeout;

class food{
	private int id;
	//含参构造函数u，这里用不到无参构造器，所以可以不写。否则新建对象将会出错。
	public food(int id) {
		this.id=id;
	}
	//get set 方法
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}

//生产者
class Producer implements Runnable{
	private boolean working = true;
	private BlockingQueue<food> queue;			//用组合的方式来加入一条BlockingQueue
	private static AtomicInteger count = new AtomicInteger();
	
	//构造函数
	public Producer(BlockingQueue<food> queue) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (working) {
			int id = count.incrementAndGet();
			food Food = new food(id);
			System.out.println(Thread.currentThread().getId()+"号员工开始工作");
			if (queue.offer(Food)) {
				System.out.println(Thread.currentThread().getId()+"号员工将"+Food.getId()+"号食物加入餐台");
			}else {
				System.out.println("餐台已满，"+Food.getId()+"号事物无法加入");
			}
			try {
				Thread.sleep((int)(Math.random()*1000*3));
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public void stop(){
		working=false;
	}
}

//消费者类
class consumer implements Runnable{
	private boolean flag = true;
	private BlockingQueue<food> queue;
	//构造函数
	public consumer(BlockingQueue<food>queue) {
		// TODO Auto-generated constructor stub
		this.queue=queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				food Food = queue.take();	//take()方式，若队列中没有元素则线程被阻塞
				System.out.println(Food.getId()+"号食物已被"+Thread.currentThread().getId()+"号顾客端走");
				Thread.sleep(1000*2);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}
public class PaiDuiSystem {
	public static void main(String[] args) {
	BlockingQueue<food> queue = new LinkedBlockingDeque<>(10);
	Producer []p1= new Producer[3];
	consumer []c1 = new consumer[15];
	for (int i = 0; i < 3; i++) {
		p1[i] = new Producer(queue);
	}
	for (int j = 0; j < 15; j++) {
		c1[j] = new consumer(queue);
	}
	ExecutorService executorService = Executors.newFixedThreadPool(5);
	for (int i = 0; i < 3; i++) {
		executorService.execute(p1[i]);
	}
	for (int j = 0; j < 15; j++) {
		executorService.execute(c1[j]);
	}
	try {
		Thread.sleep(1000*20);
	} catch (InterruptedException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
}

