#include <iostream>
#include <string>

using namespace std;

int log(const string& msg){
	cout << msg << endl;
	return 0;
}

class Parent{
	protected:
		int attr;// = log("親クラスフィールド初期化"); //これはできないんでした。
	public:
		Parent():
		attr(log("親クラスフィールド初期化"))
		{
			log("親クラスコンストラクタ開始");
			doInit();
			log("親クラスコンストラクタ終了");
		}
		virtual ~Parent(){
		}
		virtual void doInit(){
			log("親クラスの初期化処理");
		};
		virtual void method(){
			log("*親メソッド*");
		}
};

class Child : public Parent{
	protected:
		int attr;
	public:
		Child():
		Parent(),
		attr(log("子クラスフィールド初期化"))
		{
			log("子クラスコンストラクタ");
		};
		virtual ~Child(){
		};
		virtual void doInit(){
			log("子クラスの初期化処理");
		};
		virtual void method(){
			log("*子メソッド*");
		}
};

int main(){
	Child child;
	child.method();
	return 0;
}

