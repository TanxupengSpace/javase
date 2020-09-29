package cn.txp.lambda;

class Dog{
	private String name;
	private Integer age;
	public Dog(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "名称:" + this.name + "\t" + "年龄:" + this.age;
	}
}
/**
 * @param <R> 表示返回结果类型
 */
@FunctionalInterface
interface IFunction<R>{
	R create_dog(String name,  Integer age);
}
public class FunAdducation {
	public static void main(String[] args) {
		// 引用构造方法
		IFunction<Dog> ifun = Dog :: new;
		System.out.println(ifun.create_dog("狗蛋", 5)); // 返回结果:  名称:狗蛋	年龄:5
	}
}
