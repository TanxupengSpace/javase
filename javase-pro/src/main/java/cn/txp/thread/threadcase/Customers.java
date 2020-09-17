package cn.txp.thread.threadcase;

public class Customers implements Runnable{
	private Info info = null;
    public Customers(Info info) {
    	this.info = info;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 50 ; i ++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.info.get();
		}
	}
}
