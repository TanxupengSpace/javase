package cn.txp.thread;


public class ThreadDemo01 extends Thread{
	@Override
	public void run() {
		for(int x = 0 ; x < 5; x ++) {
			System.out.println(Thread.currentThread().getName() + "x=" + x);
		}
	}
	public static void main(String[] args) {
		ThreadDemo01 thread01 = new ThreadDemo01();
		ThreadDemo01 thread02 = new ThreadDemo01();
		thread01.start();
		thread02.start();
	}
}
