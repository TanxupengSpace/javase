package cn.txp.lambda;

/*
 * 定义一个接口
 */
@FunctionalInterface
interface Lambdainfo{
	int add(int paramone, int paramtow);
}
public class LambdaDemo1 {
	public static void main(String[] args) {
		Lambdainfo li = (p1, p2) -> {return p1 + p2;};
		System.out.println(li.add(10, 20));
		
		// 如果只有一条返回语句，可以省略{ }括号
		Lambdainfo lbi = (p1, p2) -> p1 + p2;
		System.out.println(lbi.add(10, 40));
	}
}
