package cn.txp.thread;

public class ThreadDemo02 implements Runnable{
	private String name;
	public ThreadDemo02(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int x = 0 ; x < 5 ; x ++) {
			System.out.println(this.name + x);
		}
	}
	public static void main(String[] args) {
		ThreadDemo02 thread01 = new ThreadDemo02("线程A");
		ThreadDemo02 thread02 = new ThreadDemo02("线程B");
		new Thread(thread01).start();
		new Thread(thread02).start();
	}
}
