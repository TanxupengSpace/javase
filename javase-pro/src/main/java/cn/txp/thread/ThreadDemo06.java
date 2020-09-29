package cn.txp.thread;

public class ThreadDemo06 implements Runnable{
	private String name;
	private int ticket; // Ʊ
	public ThreadDemo06(String name, int ticket) {
		this.name = name;
		this.ticket = ticket;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 100; i ++) {
			this.sale();
		}
	}
	// ͬ������
	public synchronized void sale() {
		if(ticket > 0) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("�߳�" + name + this.ticket --);
		}
	}
	public static void main(String[] args) {
		ThreadDemo06 thread = new ThreadDemo06("�߳�", 5);
		new Thread(thread).start();
		new Thread(thread).start();
		new Thread(thread).start();
	}
}
