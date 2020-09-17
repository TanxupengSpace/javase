package cn.txp.thread;

/**
 * 取得和设置线程名称
 * @author tanxupeng
 *
 */
public class ThreadDemo07 implements Runnable{
	@Override
	public void run() {
		for(int x = 0 ; x < 5; x ++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		ThreadDemo07 thread01 = new ThreadDemo07();
		new Thread(thread01).start();
		new Thread(thread01).start();
		new Thread(thread01).start();
		new Thread(thread01).start();
		Thread th1 = new Thread(thread01);
		th1.setName("线程A");
		th1.start();
		new Thread(thread01, "线程B");
	}
}
