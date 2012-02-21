class Parent{
	public Parent(){
		System.out.println("親コンストラクタだよー。");
	}
	public void method(){
		System.out.println("親のメソッドだよー。");
	}
}
class Child extends Parent {
	public Child(){
		super();
		System.out.println("子コンストラクタだよー。");
	}
	public void method(){
		System.out.println("子供のメソッドだよー。");
	}
}


public class Sample1{
	public static void main(String[] args){
		Child child = new Child();
		child.method();
	}
}

