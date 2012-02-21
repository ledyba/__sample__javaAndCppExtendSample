abstract class Parent{ //抽象クラスになりました。
	private int field = 0;
	public Parent(){
		System.out.println("親コンストラクタだよー。fieldは"+field+"だったよー。");
		/* 全派生クラス共通の初期化処理がこの間に入ってる（という気持ち） */
		final int result = doInit(); //派生クラスごとで違う初期化処理
		/* ここも全派生クラス共通の初期化処理が入ってる（という気持ち） */
		System.out.println("親コンストラクタ終わりだよー。結果は"+result+"だったよー。");
	}
	public void method(){
		System.out.println("親のメソッドだよー。");
	}
	protected abstract int doInit();
}
class Child extends Parent {
	private int field = 1;
	public Child(){
		super();
		System.out.println("子コンストラクタだよー。fieldは"+field+"だったよー。");
	}
	public void method(){
		System.out.println("子供のメソッドだよー。");
	}
	protected int doInit(){
		System.out.println("子供が初期化してるよー。");
		return 184; //特に意味はない
	}
}

public class Sample3{
	public static void main(String[] args){
		Child child = new Child();
		child.method();
	}
}

