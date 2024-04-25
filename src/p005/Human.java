package p005;

public class Human {

	//名詞（フィールド/メンバ変数）
	String name;
	int age;

	//動詞（メソッド）

	void eat() {
		System.out.println("自分で払いな");
	}

	void eat(int money) {
		System.out.println(money + "ルピー稼いだし、");
		System.out.println("宴じゃぁ！！！");
	}

	void eat(int money, int doll) {
		System.out.println(money + "ルピー稼いだし、");
		System.out.println("宴じゃぁ！！！");
	}
	
	
	/*void eat (int money2) {
		System.out.println(money + "ルピー稼いだし、");
		System.out.println("宴じゃぁ！！！");
	}*/

	void eat(String bento) {
		System.out.println(bento + "じゃい！");
		System.out.println("食え！！！");
	}

}
