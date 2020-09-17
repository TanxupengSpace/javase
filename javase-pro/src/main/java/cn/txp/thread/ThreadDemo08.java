package cn.txp.thread;

/**
 * 线程是否存活
 * @author tanxupeng
 *
 */
public class ThreadDemo08 implements Runnable{
	@Override
	public void run() {
		for(int x = 0 ; x < 5; x ++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		ThreadDemo08 thread01 = new ThreadDemo08();
		Thread th1 = new Thread(thread01);
		th1.isAlive();
		System.out.println(th1.isAlive());
		th1.start();
		System.out.println(th1.isAlive());
	}
}
