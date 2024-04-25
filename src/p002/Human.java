package p002;

public class Human {
	
	//名詞（フィールド/メンバ変数）
	String name;
	int age;
	
	//動詞（メソッド）
	void introduce () {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		
	}
	
	void walk () {
		System.out.println("人は歩くよ");
		
	}

	
	void eat () {
		System.out.println("今食っとるんじゃい");
	}

}
