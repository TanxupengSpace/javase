package cn.txp.thread;

public class ThreadDemo04 implements Runnable{
	private String name;
	private int ticket; // 票
	public ThreadDemo04(String name, int ticket) {
		this.name = name;
		this.ticket = ticket;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 100; i ++) {
			if(ticket > 0) {
				System.out.println("线程" + name + this.ticket --);
			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo04 thread = new ThreadDemo04("线程", 5);
		new Thread(thread).start();
		new Thread(thread).start();
		new Thread(thread).start();
	}
}
