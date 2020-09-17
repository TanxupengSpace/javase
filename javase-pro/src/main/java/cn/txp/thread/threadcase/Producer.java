package cn.txp.thread.threadcase;

public class Producer implements Runnable{
	private Info info = null;
	public Producer(Info info) {
		this.info = info;
	}
	@Override
	public void run() {
		boolean flag = false;
		for(int i = 0 ; i < 50 ; i ++) {
			if(flag) {
				this.info.set("谭旭鹏", "Java开发程序员");
				flag = false;
			}else {
				this.info.set("dj", "www.tanxupeng.info");
				flag = true;
			}
		}
	}
}
