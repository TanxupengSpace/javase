package cn.txp.thread.threadcase;

public class TestCaseDemo {
	public static void main(String[] args) {
		Info info = new Info();
		Producer producer = new Producer(info);
		Customers cons = new Customers(info);
		new Thread(producer).start();
		new Thread(cons).start();
	}
}
