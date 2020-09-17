package cn.txp.thread;

class Customer{
	public void buy_cars() {
		System.out.println("���Լ��ٸ�Ǯ��");
	}
	public void after() {
		System.out.println("�������򵽳���");
	}
}
class Vendition{
	public void vendition_cars() {
		System.out.println("�ȸ�Ǯ���Լݳ���");
	}
	public void after() {
		System.out.println("�����Ѿ��۳�");
	}
}
public class ThreadDemo09 implements Runnable{
	private static Customer customer = new Customer();
	private static Vendition vendition = new Vendition();
	private boolean flag = false;
	@Override
	public void run() {
		if(flag) { // ��������
			synchronized(customer) { // ͬ�������
				customer.buy_cars();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(vendition) {
					customer.after();
				}
			}
		}else {
			synchronized(vendition) {
				vendition.vendition_cars();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(customer) {
					vendition.after();
				}
			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo09 thread1 = new ThreadDemo09();
		ThreadDemo09 thread2 = new ThreadDemo09();
		thread1.flag = true;
		thread2.flag = false;
		Thread t1 = new Thread(thread1);
		t1.start();
		Thread t2 = new Thread(thread2);
		t2.start();
	}
}
