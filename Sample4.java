abstract class Parent{
	protected static final int log(String msg){
		System.out.println(msg);
		return 0;
	}
	protected int field = log("親クラス・フィールド宣言時");
	public Parent(){
		log("親クラス・コンストラクタ");
	}
}
class Child extends Parent {
	protected int field = log("子クラス・フィールド宣言時");
	public Child(){
		super();
		log("子クラス・コンストラクタ");
	}
	public void method(){
	}
}

public class Sample4{
	public static void main(String[] args){
		Child child = new Child();
		child.method();
	}
}

