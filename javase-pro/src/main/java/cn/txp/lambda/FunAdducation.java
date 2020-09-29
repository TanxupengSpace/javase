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
		return "����:" + this.name + "\t" + "����:" + this.age;
	}
}
/**
 * @param <R> ��ʾ���ؽ������
 */
@FunctionalInterface
interface IFunction<R>{
	R create_dog(String name,  Integer age);
}
public class FunAdducation {
	public static void main(String[] args) {
		// ���ù��췽��
		IFunction<Dog> ifun = Dog :: new;
		System.out.println(ifun.create_dog("����", 5)); // ���ؽ��:  ����:����	����:5
	}
}
