package cn.txp.thread;

public class ThreadDemo03 extends Thread{
	private String name;
	private int ticket;
	public ThreadDemo03(String name, int ticket) {
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
		ThreadDemo03 thread1 = new ThreadDemo03("线程A", 5);
		ThreadDemo03 thread2 = new ThreadDemo03("线程B", 5);
		ThreadDemo03 thread3 = new ThreadDemo03("线程C", 5);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
