package cn.txp.juc.utils;

import java.util.concurrent.TimeUnit;

public class TimeUnitDemo {
	public static void main(String[] args) {
		// 将1天转换成秒
		long time = TimeUnit.SECONDS.convert(1, TimeUnit.DAYS);
		System.out.println(time);  // = 86400
	}
}