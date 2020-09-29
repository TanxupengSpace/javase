package cn.txp.thread;

public class ThreadDemo05 implements Runnable{
	private String name;
	private int ticket; // 票
	public ThreadDemo05(String name, int ticket) {
		this.name = name;
		this.ticket = ticket;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 100; i ++) {
			synchronized (this) {
				if(ticket > 0) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("线程" + name + this.ticket --);
				}
			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo05 thread = new ThreadDemo05("线程", 5);
		new Thread(thread).start();
		new Thread(thread).start();
		new Thread(thread).start();
	}
}
