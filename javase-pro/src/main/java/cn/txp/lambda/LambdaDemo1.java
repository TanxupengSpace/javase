package cn.txp.lambda;

/*
 * ����һ���ӿ�
 */
@FunctionalInterface
interface Lambdainfo{
	int add(int paramone, int paramtow);
}
public class LambdaDemo1 {
	public static void main(String[] args) {
		Lambdainfo li = (p1, p2) -> {return p1 + p2;};
		System.out.println(li.add(10, 20));
		
		// ���ֻ��һ��������䣬����ʡ��{ }����
		Lambdainfo lbi = (p1, p2) -> p1 + p2;
		System.out.println(lbi.add(10, 40));
	}
}
