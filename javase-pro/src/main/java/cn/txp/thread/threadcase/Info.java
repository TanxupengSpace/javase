package cn.txp.thread.threadcase;

public class Info {
	private String name = "谭旭鹏";
	private String content = "Java开发程序员";
	private boolean flag = true; // true 生产     false  消费
	public synchronized void set(String name, String content) {
		if(!flag) { // 是false，只能取走，不能生产
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.setName(name);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setContent(content);
		flag = false;
		super.notify();
	}
	public synchronized void get() {
		if(flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + "-------->" + this.getContent());
		flag = true;
		super.notify();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
