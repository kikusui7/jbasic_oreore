package p009UConstOR;

public class Human {

	//名詞（フィールド/メンバ変数）
	String name;
	int age;

	//コンストラクタ（/目的/インスタンス化の際に楽に）（＝メソッド）

	//戻り値無し
	/*Human(String name, int age) {
		//System.out.println("こっちでやるにょ");
		this.name = name;
		this.age = age;
		
		//「this」でフィールドの名詞指定
		
		//中継
	
	}*/

	Human() {
		//オーバーロード
		this("お前の名ねぇから！！",-1);
		//Human ✖
		
		//固定名・数
	}

	Human(String name, int age) {

		this.name = name;
		this.age = age;
	}

	//動詞（メソッド）
	void introduce() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);

	}

}
