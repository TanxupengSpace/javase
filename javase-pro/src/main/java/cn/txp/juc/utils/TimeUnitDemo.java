package cn.txp.juc.utils;

import java.util.concurrent.TimeUnit;

public class TimeUnitDemo {
	public static void main(String[] args) {
		// ��1��ת������
		long time = TimeUnit.SECONDS.convert(1, TimeUnit.DAYS);
		System.out.println(time);  // = 86400
	}
}