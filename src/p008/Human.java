package p008;

public class Human {

	//＜カプセル化＞
	//①「名詞」を同じクラス内からでしかアクセスできないようにする
	//②「メソッド（アクセッサ）」経由で、
	//フィールドにデータの代入（具）を行えるようにする
	//③「メソッド」経由なので、

	//名詞（フィールド/メンバ変数）
	private String name;
	private int age;
	
	//アクセッサ・メソッド（「具」のセッタ＆ゲッタ）の定義

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if (0 <= age && age <= 89995) {
			this.age = age;

		} else {
			System.out.println("やり直しな！！");
		}
		
	}


	//動詞（メソッド）
	/*	void introduce () {
			System.out.println("名前：" + name);
			System.out.println("年齢：" + age);
			
		}
	*/
}
